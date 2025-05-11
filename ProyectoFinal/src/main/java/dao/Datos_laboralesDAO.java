/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Date;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.Datos_laborales;
import modelos.Profesor;

/**
 *
 * @author anton
 */
public class Datos_laboralesDAO {
    
    public List<Datos_laborales> obtenerDatosLaborales() throws SQLException {
        List<Datos_laborales> datosLaborales = new ArrayList<>();
        String sql = "SELECT * FROM Datos_laborales";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Datos_laborales datosL = new Datos_laborales(
                    rs.getInt("No_profesor"),
                    rs.getString("Nombramiento_institucional"),                                       
                    rs.getString("Dedicacion"),
                    rs.getString("Dependencia"),                                       
                    rs.getDate("Inicio_contrato").toLocalDate(),
                    rs.getDate("Fin_contrato").toLocalDate(),                                    
                    rs.getString("Estado"),
                    rs.getString("Email_institucional")
   
                );
                datosLaborales.add(datosL);
            }
        }

        return datosLaborales;
    }
    
     public void insertarDatosLaborales(Datos_laborales datosL){
        try{
            String sql = "INSERT INTO Datos_laborales (No_profesor, Nombramiento_institucional, Dedicacion, Dependencia, Inicio_contrato"
                    + ", Fin_contrato, Estado, Email_institucional) VALUES (?,?,?,?,?,?,?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, datosL.getNo_profesor());
            st.setString(2, datosL.getNombramiento_institucional());
            st.setString(3, datosL.getDedicacion());
            st.setString(4, datosL.getDependencia());
            st.setDate(5, Date.valueOf(datosL.getInicio_contrato()));
            st.setDate(6, Date.valueOf(datosL.getFin_contrato()));
            st.setString(7, datosL.getEstado());
            st.setString(8, datosL.getEmail_institucional());
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }

    }
     
     
    public void eliminarDatosLaborales (int No_profesor){
        try {
            String sql = "DELETE FROM Datos_laborales WHERE No_profesor = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, No_profesor);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarDatosLaborales(Datos_laborales datosL){
        int NoProfesor = datosL.getNo_profesor();
        try {
            String sql = "UPDATE Datos_laborales SET No_profesor= ?, Nombramiento_institucional= ?, Dedicacion= ?, Dependencia= ?, Inicio_contrato= ?,"
                    + " Fin_contrato= ?, Estado= ?, Email_institucional= ? WHERE No_profesor ='"+ NoProfesor + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, NoProfesor);
            st.setString(2, datosL.getNombramiento_institucional());
            st.setString(3, datosL.getDedicacion());
            st.setString(4, datosL.getDependencia());
            st.setDate(5, Date.valueOf(datosL.getInicio_contrato()));
            st.setDate(6, Date.valueOf(datosL.getFin_contrato())); 
            st.setString(7, datosL.getEstado());
            st.setString(8, datosL.getEmail_institucional());
            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
    
    
    
    public List<Datos_laborales> buscarDatosLaboralesPorNombre(int noProfesor) {
        List<Datos_laborales> datosL = new ArrayList<>();
        String sql = "SELECT * FROM Datos_laborales WHERE No_profesor LIKE ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {

            st.setString(1, "%" + noProfesor + "%");
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Datos_laborales dL = new Datos_laborales(
                    rs.getInt("No_profesor"),
                    rs.getString("Nombramiento_institucional"),                                       
                    rs.getString("Dedicacion"),
                    rs.getString("Dependencia"),                                       
                    rs.getDate("Inicio_contrato").toLocalDate(),
                    rs.getDate("Fin_contrato").toLocalDate(),                                    
                    rs.getString("Estado"),
                    rs.getString("Email_institucional")  
                );
                datosL.add(dL);
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de excepciones, puede mejorarse según necesidades
        }
        return datosL;
    }
    
    
    
}
