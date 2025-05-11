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
import modelos.Resultados_GestionAV;

/**
 *
 * @author anton
 */
public class Resultados_GestionAV_DAO {
    
    public List<Resultados_GestionAV> obtenerResultadosGestionAV() throws SQLException {
        List<Resultados_GestionAV> resultadosGAV = new ArrayList<>();
        String sql = "SELECT * FROM Resultados_GestionAV";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Resultados_GestionAV rG = new Resultados_GestionAV(
                    rs.getString("Resultado1"),
                    rs.getString("Resultado2"),
                    rs.getString("Resultado3"),
                    rs.getInt("Gestion_AV_Clave")                              
                       
                );
                resultadosGAV.add(rG);
            }
        }

        return resultadosGAV;
        
    }
    
     public void insertarResultadosGestionAV(Resultados_GestionAV rG){
        try{
            String sql = "INSERT INTO Resultados_GestionAV (Resultado1, Resultado2, Resultado3, Gestion_AV_Clave) VALUES (?,?,?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, rG.getResultado1());
            st.setString(2, rG.getResultado2());
            st.setString(3, rG.getResultado3());
            st.setInt(4, rG.getGestion_AV_Clave());
           
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }

    }
     
     
    public void eliminarResultadosGestionAV (int Gestion_AV_Clave){
        try {
            String sql = "DELETE FROM Resultados_GestionAV WHERE Gestion_AV_Clave = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(4, Gestion_AV_Clave);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarResultadosGestionAV(Resultados_GestionAV rG){
        int claveG = rG.getGestion_AV_Clave();
        try {
            String sql = "UPDATE Resultados_GestionAV SET Resultado1= ?, Resultado2= ?, Resultado3= ?, "
                    + "Gestion_AV_Clave= ? WHERE Gestion_AV_Clave ='"+ claveG + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1,rG.getResultado1());
            st.setString(2, rG.getResultado2());
            st.setString(3,rG.getResultado3());
            st.setInt(4,claveG );
         
            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
    
}
