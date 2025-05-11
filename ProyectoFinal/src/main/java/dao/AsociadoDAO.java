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
import modelos.Asociado;

/**
 *
 * @author anton
 */
public class AsociadoDAO {
    
    public List<Asociado> obtenerAsociado() throws SQLException {
        List<Asociado> asociado = new ArrayList<>();
        String sql = "SELECT * FROM Asociado";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Asociado a = new Asociado(
                    rs.getString("Profesor_CURP"),
                    rs.getInt("Proyectos_investigacion_Clave")                                                                                           
                );
                asociado.add(a);
            }
        }

        return asociado;
        
    }
    
     public void insertarAsociado(Asociado a){
        try{
            String sql = "INSERT INTO Asociado (Profesor_CURP, Proyectos_investigacion_Clave) VALUES (?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, a.getProfesor_CURP());
            st.setInt(2, a.getProyectos_investigacion_Clave());
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }

    }
     
     
    public void eliminarAsociado (String Profesor_CURP){
        try {
            String sql = "DELETE FROM Asociado WHERE Profesor_CURP = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1, Profesor_CURP);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarAsociado(Asociado a){
        String idProfesor = a.getProfesor_CURP();
        try {
            String sql = "UPDATE Asociado SET Profesor_CURP= ?, Proyectos_investigacion_Clave= ? WHERE Profesor_CURP='"+ idProfesor + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1, idProfesor);
            st.setInt(2, a.getProyectos_investigacion_Clave());

            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
    
}
