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
import modelos.Carreras;
import modelos.LGAC;

/**
 *
 * @author anton
 */
public class LGAC_DAO {
    
    public List<LGAC> obtenerLGAC() throws SQLException {
        List<LGAC> lineasGAC = new ArrayList<>();
        String sql = "SELECT * FROM LGAC";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                LGAC lgac = new LGAC(
                    rs.getInt("Id_LGAC"),
                    rs.getString("Nombre_LGAC"),
                    rs.getInt("No_horas_semanas"),
                    rs.getString("Profesor_CURP")
                );
                lineasGAC.add(lgac);
            }
        }
        return lineasGAC;   
    }
    
     public void insertarLGAC(LGAC lgac){
        try{
            String sql = "INSERT INTO LGAC (Id_LGAC, Nombre_LGAC, No_horas_semanas, Profesor_CURP) VALUES (?,?,?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, lgac.getId_LGAC());
            st.setString(2, lgac.getNombre_LGAC());
            st.setInt(3, lgac.getNo_horas_semanas());
            st.setString(4, lgac.getProfesor_CURP());
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }

    }
     
     
    public void eliminarLGAC (int Id_LGAC){
        try {
            String sql = "DELETE FROM LGAC WHERE Id_LGAC = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, Id_LGAC);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarLGAC(LGAC lgac){
        int idLGAC = lgac.getId_LGAC();
        try {
            String sql = "UPDATE LGAC SET Id_LGAC= ?, Nombre_LGAC= ?, No_horas_semanas= ?, Profesor_CURP= ? WHERE Id_LGAC ='"+ idLGAC + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, idLGAC);
            st.setString(2, lgac.getNombre_LGAC());
            st.setInt(3, lgac.getNo_horas_semanas());
            st.setString(4, lgac.getProfesor_CURP());

            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
    
    public List<LGAC> buscarLGACPorNombre(int idLGAC) {
        List<LGAC> lineasGAC = new ArrayList<>();
        String sql = "SELECT * FROM LGAC WHERE Id_LGAC LIKE ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {

            st.setString(1, "%" + idLGAC + "%");
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                LGAC lgac = new LGAC(
                    resultSet.getInt("Id_LGAC"),
                    resultSet.getString("Nombre_LGAC"),
                    resultSet.getInt("No_horas_semanas"),
                    resultSet.getString("Profesor_CURP")                                       
                );
                lineasGAC.add(lgac);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de excepciones, puede mejorarse según necesidades
        }
        return lineasGAC;
    }
    
}
