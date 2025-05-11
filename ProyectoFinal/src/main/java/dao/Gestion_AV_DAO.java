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
import modelos.Gestion_AV;

/**
 *
 * @author anton
 */
public class Gestion_AV_DAO {
    public List<Gestion_AV> obtenerGestionAV() throws SQLException {
        List<Gestion_AV> gestionAV = new ArrayList<>();
        String sql = "SELECT * FROM Gestion_AV";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Gestion_AV gAV = new Gestion_AV(
                    rs.getInt("Clave"),                                       
                    rs.getString("Tipo"),
                    rs.getString("Descripcion"),
                    rs.getString("Funcion_encomendada"),  
                    rs.getDate("Fecha_inicio").toLocalDate(),
                    rs.getDate("Fecha_fin").toLocalDate(),
                    rs.getInt("No_horas_semanas"),
                    rs.getString("Estado"),
                    rs.getString("Institucion_gestion")
   
                );
                gestionAV.add(gAV);
            }
        }

        return gestionAV;
    }
    
    
     public void insertarGestionAV(Gestion_AV gAV){
        try{
            String sql = "INSERT INTO Gestion_AV (Clave, Tipo, Descripcion, Funcion_encomendada, Fecha_inicio"
                    + ", Fecha_fin, No_horas_semana, Estado, Institucion_gestion) VALUES (?,?,?,?,?,?,?,?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, gAV.getClave());
            st.setString(2, gAV.getTipo());
            st.setString(3, gAV.getDescripcion());
            st.setString(4, gAV.getFuncion_encomendada());
            st.setDate(5, Date.valueOf(gAV.getFecha_inicio()));
            st.setDate(6, Date.valueOf(gAV.getFecha_fin()));
            st.setInt(7, gAV.getNo_horas_semana());
            st.setString(8, gAV.getEstado());
            st.setString(9, gAV.getInstitucion_gestion());
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }

    }
     
     
    public void eliminarGestionAV (int Clave){
        try {
            String sql = "DELETE FROM Gestion_AV WHERE Clave = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, Clave);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarGestionAV(Gestion_AV gAV){
        int clave = gAV.getClave();
        try {
            String sql = "UPDATE Gestion_AV SET Clave= ?, Tipo= ?, Descripcion= ?, Funcion_encomendada= ?, Fecha_inicio= ?,"
                    + " Fecha_fin, No_horas_semana= ?, Estado= ?, Institucion_gestion= ? WHERE Clave ='"+ clave + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, clave);
            st.setString(2, gAV.getTipo());
            st.setString(3, gAV.getDescripcion());
            st.setString(4, gAV.getFuncion_encomendada());
            st.setDate(5, Date.valueOf(gAV.getFecha_inicio()));
            st.setDate(6, Date.valueOf(gAV.getFecha_fin()));
            st.setInt(7, gAV.getNo_horas_semana());
            st.setString(8, gAV.getEstado());
            st.setString(9, gAV.getInstitucion_gestion());
            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
}
