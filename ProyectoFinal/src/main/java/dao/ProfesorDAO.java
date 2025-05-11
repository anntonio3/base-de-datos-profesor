/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.Profesor;

/**
 *
 * @author anton
 */
public class ProfesorDAO {
    public List<Profesor> obtenerProfesor() throws SQLException {
        List<Profesor> profesor = new ArrayList<>();
        String sql = "SELECT * FROM Profesor";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Profesor profe = new Profesor(
                    rs.getString("CURP"),
                    rs.getInt("No_trabajador"),                                       
                    rs.getString("Nom_pila"),
                    rs.getString("Apellido_pat"),                                       
                    rs.getString("Apellido_mat"),
                    rs.getString("RFC"),
                    rs.getInt("No_IMSS"),                                       
                    rs.getString("Estado_civil"),
                    rs.getString("Email_personal"),
                    rs.getInt("Carreras_Id_carrera"), 
                    rs.getInt("Datos_laborales_No_profesor"), 
                    rs.getInt("Datos_academicos_Cedula"), 
                    rs.getInt("CA_Id_CA")     
                );
                profesor.add(profe);
            }
        }

        return profesor;
        
    }
    
     public void insertarProfesor(Profesor profe){
        try{
            String sql = "INSERT INTO Profesor (CURP, No_trabajador, Nom_pila, Apellido_pat, Apellido_mat, RFC"
                    + ", No_IMSS, Estado_civil, Email_personal, Carreras_Id_carrera, Datos_laborales_No_profesor, "
                    + "Datos_academicos_Cedula, CA_Id_CA) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, profe.getCURP());
            st.setInt(2, profe.getNo_trabajador());
            st.setString(3, profe.getNom_pila());
            st.setString(4, profe.getApellido_pat());
            st.setString(5, profe.getApellido_mat());
            st.setString(6, profe.getRFC());
            st.setInt(7, profe.getNo_IMSS());
            st.setString(8, profe.getEstado_civil());
            st.setString(9, profe.getEmail_personal());
            st.setInt(10, profe.getCarreras_Id_carrera());
            st.setInt(11, profe.getDatos_laborales_No_profesor());
            st.setInt(12, profe.getDatos_academicos_Cedula());
            st.setInt(13, profe.getCA_Id_CA());
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }


    }
     
     
    public void eliminarProfesor (String CURP){
        try {
            String sql = "DELETE FROM Profesor WHERE CURP = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1, CURP);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarProfesor(Profesor profe){
        String curp = profe.getCURP();
        try {
            String sql = "UPDATE Profesor SET CURP= ?, No_trabajador= ?, Nom_pila= ?, Apellido_pat= ?, Apellido_mat= ?,"
                    + " RFC= ?, No_IMSS= ?,Estado_civil= ?, Email_personal= ?, Carreras_Id_carrera= ?, "
                    + " Datos_laborales_No_profesor= ?, Datos_academicos_Cedula= ?, CA_Id_CA= ? WHERE CURP ='"+ curp + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1, curp);
            st.setInt(2, profe.getNo_trabajador());
            st.setString(3, profe.getNom_pila());
            st.setString(4, profe.getApellido_pat());
            st.setString(5, profe.getApellido_mat());
            st.setString(6, profe.getRFC());
            st.setInt(7, profe.getNo_IMSS());
            st.setString(8, profe.getEstado_civil());
            st.setString(9, profe.getEmail_personal());
            st.setInt(10, profe.getCarreras_Id_carrera());
            st.setInt(11, profe.getDatos_laborales_No_profesor());
            st.setInt(12, profe.getDatos_academicos_Cedula());
            st.setInt(13, profe.getCA_Id_CA());
            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
    
    public List<Profesor> buscarProfesorPorNombre(String CURP) {
        List<Profesor> profesor = new ArrayList<>();
        String sql = "SELECT * FROM Profesor WHERE CURP LIKE ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {

            st.setString(1, "%" + CURP + "%");
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                Profesor profe = new Profesor(
                    resultSet.getString("CURP"),
                    resultSet.getInt("No_trabajador"),                                       
                    resultSet.getString("Nom_pila"),
                    resultSet.getString("Apellido_pat"),                                       
                    resultSet.getString("Apellido_mat"),
                    resultSet.getString("RFC"),
                    resultSet.getInt("No_IMSS"),                                       
                    resultSet.getString("Estado_civil"),
                    resultSet.getString("Email_personal"),
                    resultSet.getInt("Carreras_Id_carrera"), 
                    resultSet.getInt("Datos_laborales_No_profesor"), 
                    resultSet.getInt("Datos_academicos_Cedula"), 
                    resultSet.getInt("CA_Id_CA")   
                );
                profesor.add(profe);
            }

            resultSet.close();
        } catch (SQLException e) {
            System.out.println("No encontro el registro");
            e.printStackTrace(); // Manejo básico de excepciones, puede mejorarse según necesidades
        }
        return profesor;
    }
    
}
