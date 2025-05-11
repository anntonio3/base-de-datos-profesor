/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.Datos_academicos;
import modelos.Direccion_individualizada;

/**
 *
 * @author anton
 */
public class Direccion_individualizadaDAO {
    
    public List<Direccion_individualizada> obtenerDireccionIndividualizada() throws SQLException {
        List<Direccion_individualizada> direccionI = new ArrayList<>();
        String sql = "SELECT * FROM Direccion_individualizada";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Direccion_individualizada dI = new Direccion_individualizada(
                    rs.getInt("Id_tesis"),
                    rs.getString("Titulo_tesis"),                                       
                    rs.getString("Grado_tesis"),                                      
                    rs.getDate("Fecha_inicio").toLocalDate(),
                    rs.getDate("Fecha_fin").toLocalDate(),   
                    rs.getString("Estado"),
                    rs.getString("Es_CA"),
                    rs.getInt("No_ind_CA"),   
                    rs.getString("Institucion_trabajo"),
                    rs.getString("Profesor_CURP")
   
                );
                direccionI.add(dI);
            }
        }

        return direccionI;
    }
    
     public void insertarDireccionIndividualizada(Direccion_individualizada dI){
        try{
            String sql = "INSERT INTO Direccion_individualizada (Id_tesis, Titulo_tesis, Grado_tesis, Fecha_inicio"
                    + ", Fecha_fin, Estado, Es_CA, No_ind_CA, Institucion_trabajo, Profesor_CURP) VALUES (?,?,?,?,?,?,?,?,?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, dI.getId_tesis());
            st.setString(2, dI.getTitulo_tesis());
            st.setString(3, dI.getGrado_tesis());
            st.setDate(4, Date.valueOf(dI.getFecha_inicio()));
            st.setDate(5, Date.valueOf(dI.getFecha_fin()));
            st.setString(6, dI.getEstado());
            st.setString(7, dI.getEs_CA());
            st.setInt(8, dI.getId_tesis());
            st.setString(9, dI.getInstitucion_trabajo());
            st.setString(10, dI.getProfesor_CURP());
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }

    }
     
     
    public void eliminarDireccionIndividualizada (int Id_tesis){
        try {
            String sql = "DELETE FROM Direccion_individualizada WHERE Id_tesis = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, Id_tesis);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarDireccionIndividualizada(Direccion_individualizada dI){
        int idTesis= dI.getId_tesis() ;
        try {
            String sql = "UPDATE Direccion_individualizada SET Id_tesis= ?, Titulo_tesis= ?, Grado_tesis= ?, Fecha_inicio= ?,"
                    + " Fecha_fin= ?, Estado= ?, Es_CA= ?, No_ind_CA= ?, Institucion_trabajo= ?, Profesor_CURP= ? WHERE Id_tesis ='"+ idTesis + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, idTesis);
            st.setString(2, dI.getTitulo_tesis());
            st.setString(3, dI.getGrado_tesis());
            st.setDate(4, Date.valueOf(dI.getFecha_inicio()));
            st.setDate(5, Date.valueOf(dI.getFecha_fin()));
            st.setString(6, dI.getEstado());
            st.setString(7, dI.getEs_CA());
            st.setInt(8, dI.getId_tesis());
            st.setString(9, dI.getInstitucion_trabajo());
            st.setString(10, dI.getProfesor_CURP());
            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
    
    
    
    public List<Direccion_individualizada> buscarDireccionIndividualizadaPorNombre(int idTesis) {
        List<Direccion_individualizada> direccionI = new ArrayList<>();
        String sql = "SELECT * FROM Direccion_individualizada WHERE Id_tesis LIKE ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {

            st.setString(1, "%" + idTesis + "%");
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                Direccion_individualizada dI = new Direccion_individualizada(
                    resultSet.getInt("Id_tesis"),
                    resultSet.getString("Titulo_tesis"),                                       
                    resultSet.getString("Grado_tesis"),                                      
                    resultSet.getDate("Fecha_inicio").toLocalDate(),
                    resultSet.getDate("Fecha_fin").toLocalDate(),   
                    resultSet.getString("Estado"),
                    resultSet.getString("Es_CA"),
                    resultSet.getInt("No_ind_CA"),   
                    resultSet.getString("Institucion_trabajo"),
                    resultSet.getString("Profesor_CURP")  
                );
                direccionI.add(dI);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de excepciones, puede mejorarse según necesidades
        }
        return direccionI;
    }
    

}
