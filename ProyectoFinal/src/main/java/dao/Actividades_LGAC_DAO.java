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
import modelos.Actividades_LGAC;

/**
 *
 * @author anton
 */
public class Actividades_LGAC_DAO {
    
    public List<Actividades_LGAC> obtenerActividadesLGAC() throws SQLException {
        List<Actividades_LGAC> actividadesLGAC = new ArrayList<>();
        String sql = "SELECT * FROM Actividades_LGAC";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Actividades_LGAC aLGAC = new Actividades_LGAC(
                    rs.getString("Actividad1"),
                    rs.getString("Actividad2"),
                    rs.getInt("LGAC_Id_LGAC"),                                       
                    rs.getString("LGAC_Profesor_CURP")
                       
                );
                actividadesLGAC.add(aLGAC);
            }
        }

        return actividadesLGAC;
        
    }
    
     public void insertarActividadesLGAC(Actividades_LGAC aLGAC){
        try{
            String sql = "INSERT INTO Actividades_LGAC (Actividad1, Actividad2, LGAC_Id_LGAC, LGAC_Profesor_CURP) VALUES (?,?,?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, aLGAC.getActividad1());
            st.setString(2, aLGAC.getActividad2());
            st.setInt(3, aLGAC.getLGAC_Id_LGAC());
            st.setString(4, aLGAC.getLGAC_Profesor_CURP());
           
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }



        }
     
     
    public void eliminarActividadesLGAC (int LGAC_Id_LGAC){
        try {
            String sql = "DELETE FROM Actividades_LGAC WHERE LGAC_Id_LGAC = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(3, LGAC_Id_LGAC);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarActividadesLGAC(Actividades_LGAC aLGAC){
        int idLGAC = aLGAC.getLGAC_Id_LGAC();
        try {
            String sql = "UPDATE Actividades_LGAC SET Actividad1= ?, Actividad2= ?, LGAC_Id_LGAC= ?, LGAC_Profesor_CURP= ? WHERE LGAC_Id_LGAC ='"+ idLGAC + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1,aLGAC.getActividad1());
            st.setString(2, aLGAC.getActividad2());
            st.setInt(3,idLGAC );
            st.setString(4, aLGAC.getLGAC_Profesor_CURP());
         
            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
    
}
