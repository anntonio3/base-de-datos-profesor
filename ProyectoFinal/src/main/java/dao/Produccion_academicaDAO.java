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
import modelos.Produccion_academica;
import modelos.Profesor;

/**
 *
 * @author anton
 */
public class Produccion_academicaDAO {
    
    public List<Produccion_academica> obtenerProduccionAcademica() throws SQLException {
        List<Produccion_academica> produccionA = new ArrayList<>();
        String sql = "SELECT * FROM Produccion_academica";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Produccion_academica produA = new Produccion_academica(
                    rs.getInt("Id_produccion"),                                     
                    rs.getString("Titulo"),
                    rs.getString("Link_detalles"),                                       
                    rs.getInt("Anio_publicado"),
                    rs.getInt("No_citas_producto"),                                    
                    rs.getString("Tipo_produccion"),
                    rs.getString("Es_CA"),
                    rs.getInt("Miembros_CA"), 
                    rs.getInt("No_ind_LGAC"), 
                    rs.getInt("No_CA_LGAC")   
                );
                produccionA.add(produA);
            }
        }

        return produccionA;
        
    }
    
     public void insertarProduccionAcademica(Produccion_academica produA){
        try{
            String sql = "INSERT INTO Produccion_academica (Id_produccion, Titulo, "
                    + "Link_detalles, Anio_publicado, No_citas_producto, Tipo_produccion,"
                    + " Es_CA, Miembros_CA, No_ind_LGAC, No_CA_LGAC) VALUES (?,?,?,?,?,?,?,?,?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, produA.getId_produccion());
            st.setString(2, produA.getTitulo());
            st.setString(3, produA.getLink_detalles());
            st.setInt(4, produA.getAnio_publicado());
            st.setInt(5, produA.getNo_citas_producto());
            st.setString(6, produA.getTipo_produccion());
            st.setString(7, produA.getEs_CA());
            st.setInt(8, produA.getMiembros_CA());
            st.setInt(9, produA.getNo_ind_LGAC());
            st.setInt(10, produA.getNo_CA_LGAC());
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }



        }
     
     
    public void eliminarProduccionAcademica (int Id_produccion){
        try {
            String sql = "DELETE FROM Produccion_academica WHERE Id_produccion = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, Id_produccion);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarProduccionAcademica(Produccion_academica produA){
        int idProduccion = produA.getId_produccion();
        try {
            String sql = "UPDATE Produccion_academica SET Id_produccion= ?, Titulo= ?, Link_detalles= ?, Anio_publicado= ?, No_citas_producto= ?,"
                    + " Tipo_produccion= ?, Es_CA= ?, Miembros_CA= ?, No_ind_LGAC= ?, No_CA_LGAC= ? WHERE CURP ='"+ idProduccion + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, idProduccion);
            st.setString(2, produA.getTitulo());
            st.setString(3, produA.getLink_detalles());
            st.setInt(4, produA.getAnio_publicado());
            st.setInt(5, produA.getNo_citas_producto());
            st.setString(6, produA.getTipo_produccion());
            st.setString(7, produA.getEs_CA());
            st.setInt(8, produA.getMiembros_CA());
            st.setInt(9, produA.getNo_ind_LGAC());
            st.setInt(10, produA.getNo_CA_LGAC());
            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
    
    public List<Produccion_academica> buscarProduccionAcademicaPorNombre(String Titulo) {
        List<Produccion_academica> produccionA = new ArrayList<>();
        String sql = "SELECT * FROM Produccion_academica WHERE Titulo LIKE ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {

            st.setString(1, "%" + Titulo + "%");
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                Produccion_academica produA = new Produccion_academica(
                    resultSet.getInt("Id_produccion"),                                     
                    resultSet.getString("Titulo"),
                    resultSet.getString("Link_detalles"),                                       
                    resultSet.getInt("Anio_publicado"),
                    resultSet.getInt("No_citas_producto"),                                    
                    resultSet.getString("Tipo_produccion"),
                    resultSet.getString("Es_CA"),
                    resultSet.getInt("Miembros_CA"), 
                    resultSet.getInt("No_ind_LGAC"), 
                    resultSet.getInt("No_CA_LGAC")   
                );
                produccionA.add(produA);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de excepciones, puede mejorarse según necesidades
        }
        return produccionA;
    }
    
}
