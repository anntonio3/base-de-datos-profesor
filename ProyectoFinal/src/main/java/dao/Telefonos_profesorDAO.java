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
import modelos.Telefonos_profesor;

/**
 *
 * @author anton
 */
public class Telefonos_profesorDAO {
    public List<Telefonos_profesor> obtenerTelefonosProfesor() throws SQLException {
        List<Telefonos_profesor> telefonosP = new ArrayList<>();
        String sql = "SELECT * FROM Telefonos_profesor";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Telefonos_profesor telProfe = new Telefonos_profesor(
                    rs.getInt("Telefono1"),
                    rs.getInt("Telefono2"),                                       
                    rs.getString("Profesor_CURP")
                       
                );
                telefonosP.add(telProfe);
            }
        }

        return telefonosP;
        
    }
    
     public void insertarTelefonosProfesor(Telefonos_profesor telProfes){
        try{
            String sql = "INSERT INTO Telefonos_profesor (Telefono1, Telefono2, Profesor_CURP) VALUES (?,?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, telProfes.getTelefono1());
            st.setInt(2, telProfes.getTelefono2());
            st.setString(3, telProfes.getProfesor_CURP());
           
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }



        }
     
     
    public void eliminarTelefonosProfesor (String Profesor_CURP){
        try {
            String sql = "DELETE FROM Telefonos_profesor WHERE Profesor_CURP = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(3, Profesor_CURP);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarTelefonosProfesor(Telefonos_profesor telProfes){
        String profeCurp = telProfes.getProfesor_CURP();
        try {
            String sql = "UPDATE Telefonos_profesor SET Telefono1= ?, Telefono2= ?, Profesor_CURP= ? WHERE Profesor_CURP ='"+ profeCurp + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1,telProfes.getTelefono1());
            st.setInt(2, telProfes.getTelefono2());
            st.setString(3, profeCurp);
         
            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
    
    
}
