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
import modelos.Realiza;

/**
 *
 * @author anton
 */
public class RealizaDAO {
    
    public List<Realiza> obtenerRealiza() throws SQLException {
        List<Realiza> realiza = new ArrayList<>();
        String sql = "SELECT * FROM Realiza";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Realiza r = new Realiza(
                    rs.getInt("Gestion_AV_Clave"),
                    rs.getString("Profesor_CURP")                                                                                         
                );
                realiza.add(r);
            }
        }

        return realiza;
        
    }
    
     public void insertarRealiza(Realiza r){
        try{
            String sql = "INSERT INTO Realiza (Gestion_AV_Clave, Profesor_CURP) VALUES (?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,r.getGestion_AV_Clave());
            st.setString(2, r.getProfesor_CURP());
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }

    }
     
     
    public void eliminarRealiza (String Profesor_CURP){
        try {
            String sql = "DELETE FROM Realiza WHERE Profesor_CURP = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(2, Profesor_CURP);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarRealiza(Realiza r){
        String idProfesor = r.getProfesor_CURP();
        try {
            String sql = "UPDATE Realiza SET Gestion_AV_Clave= ?, Profesor_CURP= ? WHERE Profesor_CURP='"+ idProfesor + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, r.getGestion_AV_Clave());
            st.setString(2, idProfesor);
            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
    
}
