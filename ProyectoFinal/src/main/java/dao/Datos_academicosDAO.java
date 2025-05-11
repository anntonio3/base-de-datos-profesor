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
import modelos.Datos_academicos;
import modelos.Datos_laborales;

/**
 *
 * @author anton
 */
public class Datos_academicosDAO {
    
    public List<Datos_academicos> obtenerDatosAcademicos() throws SQLException {
        List<Datos_academicos> datosAcademicos = new ArrayList<>();
        String sql = "SELECT * FROM Datos_academicos";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Datos_academicos datosA = new Datos_academicos(
                    rs.getInt("Cedula"),
                    rs.getString("Institucion_estudio"),                                       
                    rs.getString("Grado_estudio"),
                    rs.getString("Pais"),                                       
                    rs.getDate("Fecha_inicio_estudios").toLocalDate(),
                    rs.getDate("Fecha_fin_estudios").toLocalDate(),   
                    rs.getDate("Fecha_obtencion_titulo").toLocalDate(),
                    rs.getString("Dedica_area"),
                    rs.getString("Dedica_disiplina"),
                    rs.getString("Distinciones_academicas")
   
                );
                datosAcademicos.add(datosA);
            }
        }

        return datosAcademicos;
    }
    
     public void insertarDatosAcademicos(Datos_academicos datosA){
        try{
            String sql = "INSERT INTO Datos_academicos (Cedula, Institucion_estudio, Pais, Grado_estudio, Fecha_inicio_estudios"
                    + ", Fecha_fin_estudios, Fecha_obtencion_titulo, Dedica_area, Dedica_disiplina, Distinciones_academicas) VALUES (?,?,?,?,?,?,?,?,?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, datosA.getCedula());
            st.setString(2, datosA.getInstitucion_estudio());
            st.setString(3, datosA.getGrado_estudio());
            st.setString(4, datosA.getPais());
            st.setDate(5, Date.valueOf(datosA.getFecha_inicio_estudios()));
            st.setDate(6, Date.valueOf(datosA.getFecha_fin_estudios()));
            st.setDate(7, Date.valueOf(datosA.getFecha_obtencion_titulo()));
            st.setString(8, datosA.getDedica_area());
            st.setString(9, datosA.getDedica_disiplina());
            st.setString(10, datosA.getDistinciones_academicas());
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }

    }
     
     
    public void eliminarDatosAcademicos (int Cedula){
        try {
            String sql = "DELETE FROM Datos_academicos WHERE Cedula = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, Cedula);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarDatosAcademicos(Datos_academicos datosA){
        int cedula = datosA.getCedula();
        try {
            String sql = "UPDATE Datos_academicos SET Cedula= ?, Institucion_estudio= ?, Pais= ?, Grado_estudio= ?, Fecha_inicio_estudio= ?,"
                    + " Fecha_fin_estudios= ?, Fecha_obtencion_titulo= ?, Dedica_area= ?, Dedica_disiplina= ?, Distinciones_academicas= ? WHERE Cedula ='"+ cedula + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, cedula);
            st.setString(2, datosA.getInstitucion_estudio());
            st.setString(3, datosA.getGrado_estudio());
            st.setString(4, datosA.getPais());
            st.setDate(5, Date.valueOf(datosA.getFecha_inicio_estudios()));
            st.setDate(6, Date.valueOf(datosA.getFecha_fin_estudios()));
            st.setDate(7, Date.valueOf(datosA.getFecha_obtencion_titulo())); 
            st.setString(8, datosA.getDedica_area());
            st.setString(9, datosA.getDedica_disiplina());
            st.setString(10, datosA.getDistinciones_academicas());
            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
    
    
    
    public List<Datos_academicos> buscarDatosAcademicosPorNombre(int cedula) {
        List<Datos_academicos> datosA = new ArrayList<>();
        String sql = "SELECT * FROM Datos_academicos WHERE Cedula LIKE ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {

            st.setString(1, "%" + cedula + "%");
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Datos_academicos da = new Datos_academicos(
                    rs.getInt("Cedula"),
                    rs.getString("Institucion_estudio"),                                       
                    rs.getString("Grado_estudio"),
                    rs.getString("Pais"),                                       
                    rs.getDate("Fecha_inicio_estudios").toLocalDate(),
                    rs.getDate("Fecha_fin_estudios").toLocalDate(),   
                    rs.getDate("Fecha_obtencion_titulo").toLocalDate(),
                    rs.getString("Dedica_area"),
                    rs.getString("Dedica_disiplina"),
                    rs.getString("Distinciones_academicas") 
                );
                datosA.add(da);
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de excepciones, puede mejorarse según necesidades
        }
        return datosA;
    }
  
    
    
}
