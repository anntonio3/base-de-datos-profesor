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
import modelos.Publica;

/**
 *  Tabla intermedia entre Profesor y Produccion_academica
 * @author anton
 */
public class PublicaDAO {
    
    public List<Publica> obtenerPublica() throws SQLException {
        List<Publica> publica = new ArrayList<>();
        String sql = "SELECT * FROM Publica";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Publica p = new Publica(
                    rs.getString("Profesor_CURP"),
                    rs.getString("Produccion_academica_Id_produccion")                                                                                           
                );
                publica.add(p);
            }
        }

        return publica;
        
    }
    
     public void insertarPublica(Publica p){
        try{
            String sql = "INSERT INTO Publica (Profesor_CURP, Produccion_academica_Id_produccion) VALUES (?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, p.getProfesor_CURP());
            st.setString(2, p.getProduccion_academica_Id_produccion());
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }

    }
     
     
    public void eliminarPublica (String Profesor_CURP){
        try {
            String sql = "DELETE FROM Publica WHERE Profesor_CURP = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1, Profesor_CURP);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarPublica(Publica p){
        String idProfesor = p.getProfesor_CURP();
        try {
            String sql = "UPDATE Publica SET Profesor_CURP= ?, Produccion_academica_Id_produccion= ? WHERE Profesor_CURP='"+ idProfesor + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1, idProfesor);
            st.setString(2, p.getProduccion_academica_Id_produccion());

            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
    
}
