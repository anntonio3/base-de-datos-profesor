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
import modelos.CA;


/**
 *
 * @author anton
 */
public class CA_DAO {
    
    public List<CA> obtenerCA() throws SQLException {
        List<CA> cuerpoA = new ArrayList<>();
        String sql = "SELECT * FROM CA";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                CA ca = new CA(
                    rs.getInt("Id_CA"),
                    rs.getString("Nombre_CA"),
                    rs.getString("LGAC_asociada") 
                );
                cuerpoA.add(ca);
            }
        }

        return cuerpoA;
        
    }
    
     public void insertarCA(CA ca){
        try{
            String sql = "INSERT INTO CA (Id_CA, Nombre_CA, LGAC_asociada) VALUES (?,?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, ca.getId_CA());
            st.setString(2, ca.getNombre_CA());
            st.setString(3, ca.getLGAC_asociada());
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }

    }
     
     
    public void eliminarCA (int Id_CA){
        try {
            String sql = "DELETE FROM CA WHERE Id_CA = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, Id_CA);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarCA(CA ca){
        int idCA = ca.getId_CA();
        try {
            String sql = "UPDATE CA SET Id_CA= ?, Nombre_CA= ?, LGAC_asociada= ? WHERE Id_CA ='"+ idCA + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, idCA);
            st.setString(2, ca.getNombre_CA());
            st.setString(3, ca.getLGAC_asociada());

            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
    
    public List<CA> buscarCAPorNombre(int idCA) {
        List<CA> cuerpoA = new ArrayList<>();
        String sql = "SELECT * FROM CA WHERE Id_CA LIKE ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {

            st.setString(1, "%" + idCA + "%");
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                CA ca = new CA(
                    resultSet.getInt("Id_CA"),
                    resultSet.getString("Nombre_CA"),
                    resultSet.getString("LGAC_asociada")                                         
                );
                cuerpoA.add(ca);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de excepciones, puede mejorarse según necesidades
        }
        return cuerpoA;
    }
    
}
