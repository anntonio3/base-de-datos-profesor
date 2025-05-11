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
import modelos.Miembros_CA_proyectosI;

/**
 *
 * @author anton
 */
public class Miembros_CA_proyectosIDAO {
    
    public List<Miembros_CA_proyectosI> obtenerMiembrosCAProyectosI() throws SQLException {
        List<Miembros_CA_proyectosI> miembrosCA = new ArrayList<>();
        String sql = "SELECT * FROM Miembros_CA_proyectosI";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Miembros_CA_proyectosI mCA = new Miembros_CA_proyectosI(
                    rs.getString("Miembro1"),
                    rs.getString("Miembro2"),
                    rs.getString("Miembro3"),
                    rs.getInt("Proyectos_investigacion_Clave")                              
                       
                );
                miembrosCA.add(mCA);
            }
        }

        return miembrosCA;
        
    }
    
     public void insertarMiembrosCAProyectosI(Miembros_CA_proyectosI mCA){
        try{
            String sql = "INSERT INTO Miembros_CA_proyectosI (Miembro1, Miembro2, Miembro3, Proyectos_investigacion_Clave) VALUES (?,?,?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, mCA.getMiembro1());
            st.setString(2, mCA.getMiembro2());
            st.setString(3, mCA.getMiembro3());
            st.setInt(4, mCA.getProyectos_investigacion_Clave());
           
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }



        }
     
     
    public void eliminarMiembrosCAProyectosI (int Proyectos_investigacion_Clave){
        try {
            String sql = "DELETE FROM Miembros_CA_proyectosI WHERE Proyectos_investigacion_Clave = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(4, Proyectos_investigacion_Clave);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarMiembrosCAProyectosI(Miembros_CA_proyectosI mCA){
        int clavePI = mCA.getProyectos_investigacion_Clave();
        try {
            String sql = "UPDATE Miembros_CA_proyectosI SET Miembro1= ?, Miembro2= ?, Miembro3= ?, "
                    + "Proyectos_investigacion_Clave= ? WHERE Proyectos_investigacion_Clave ='"+ clavePI + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1,mCA.getMiembro1());
            st.setString(2, mCA.getMiembro2());
            st.setString(3,mCA.getMiembro3());
            st.setInt(4,clavePI );
         
            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
    
}
