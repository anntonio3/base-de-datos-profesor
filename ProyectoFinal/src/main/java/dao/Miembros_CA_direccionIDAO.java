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
import modelos.Miembros_CA_direccionI;

/**
 *
 * @author anton
 */
public class Miembros_CA_direccionIDAO {
    public List<Miembros_CA_direccionI> obtenerMiembrosCADireccionI() throws SQLException {
        List<Miembros_CA_direccionI> miembrosCA = new ArrayList<>();
        String sql = "SELECT * FROM Miembros_CA_direccionI";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Miembros_CA_direccionI mCA = new Miembros_CA_direccionI(
                    rs.getString("Miembro1"),
                    rs.getString("Miembro2"),
                    rs.getString("Miembro3"),
                    rs.getInt("Direccion_individualizada_Id_tesis"),                             
                    rs.getString("Direccion_individualizada_Profesor_CURP")   
                );
                miembrosCA.add(mCA);
            }
        }

        return miembrosCA;
        
    }
    
     public void insertarMiembrosCADireccionI(Miembros_CA_direccionI mCA){
        try{
            String sql = "INSERT INTO Miembros_CA_direccionI (Miembro1, Miembro2, Miembro3,"
                    + " Direccion_individualizada_Id_tesis, Direccion_individualizada_Profesor_CURP) VALUES (?,?,?,?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, mCA.getMiembro1());
            st.setString(2, mCA.getMiembro2());
            st.setString(3, mCA.getMiembro3());
            st.setInt(4, mCA.getDireccion_individualizada_Id_tesis());
            st.setString(5, mCA.getDireccion_individualizada_Profesor_CURP());
           
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }



        }
     
     
    public void eliminarMiembrosCADireccionI (int Direccion_individualizada_Id_tesis){
        try {
            String sql = "DELETE FROM Miembros_CA_direccionI WHERE Direccion_individualizada_Id_tesis = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(4, Direccion_individualizada_Id_tesis);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarMiembrosCADireccionI(Miembros_CA_direccionI mCA){
        int idTesisDI = mCA.getDireccion_individualizada_Id_tesis();
        try {
            String sql = "UPDATE Miembros_CA_direccionI SET Miembro1= ?, Miembro2= ?, Miembro3= ?, "
                    + "Direccion_individualizada_Id_tesis= ?, Direccion_individualizada_Profesor_CURP= ?"
                    + " WHERE Direccion_individualizada_Id_tesis ='"+ idTesisDI + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1, mCA.getMiembro1());
            st.setString(2, mCA.getMiembro2());
            st.setString(3, mCA.getMiembro3());
            st.setInt(4, idTesisDI);
            st.setString(5, mCA.getDireccion_individualizada_Profesor_CURP());
         
            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
}
