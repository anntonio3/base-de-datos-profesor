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
import modelos.Tutoria_Asesoria;

/**
 *
 * @author anton
 */
public class Tutoria_AsesoriaDAO {
    
    public List<Tutoria_Asesoria> obtenerTutoriaAsesoria() throws SQLException {
        List<Tutoria_Asesoria> tutoriaA = new ArrayList<>();
        String sql = "SELECT * FROM Tutoria_Asesoria";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Tutoria_Asesoria tA = new Tutoria_Asesoria(
                    rs.getInt("Id_tutoria"),
                    rs.getString("Titulo_tutoria"),                                       
                    rs.getString("Nivel"),
                    rs.getString("Programa_educativo"),
                    rs.getString("Estudiante_nom_pila"),
                    rs.getString("Estudiante_apellido_pat"),
                    rs.getString("Estudiante_apellido_mat"),
                    rs.getDate("Fecha_inicio").toLocalDate(),
                    rs.getDate("Fecha_fin").toLocalDate(),   
                    rs.getInt("Tiempo_minutos"),   
                    rs.getString("Tipo_guia"),
                    rs.getString("Estado"),
                    rs.getString("Profesor_CURP")
   
                );
                tutoriaA.add(tA);
            }
        }

        return tutoriaA;
    }
    
     public void insertarTutoriaAsesoria(Tutoria_Asesoria tA){
        try{
            String sql = "INSERT INTO Tutoria_Asesoria (Id_tutoria, Tipo_tutoria, Nivel, Programa_educativo,"
                    + " Estudiante_nom_pila, Estudiante_apellido_pat, Estudiante_apellido_mat, Fecha_inicio"
                    + ", Fecha_fin, Tiempo_minutos, Tipo_guia, Estado, Profesor_CURP) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, tA.getId_tutoria());
            st.setString(2, tA.getTipo_tutoria());
            st.setString(3, tA.getNivel());
            st.setString(4, tA.getPrograma_educativo());
            st.setString(5, tA.getEstudiante_nom_pila());
            st.setString(6, tA.getEstudiante_apellido_pat());
            st.setString(7, tA.getEstudiante_apellido_mat());
            st.setDate(8, Date.valueOf(tA.getFecha_inicio()));
            st.setDate(9, Date.valueOf(tA.getFecha_fin()));
            st.setInt(10, tA.getTiempo_minutos());
            st.setString(11, tA.getTipo_guia());
            st.setString(12, tA.getEstado());
            st.setString(13, tA.getProfesor_CURP());
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }

    }
     
     
    public void eliminarTutoriaAsesoria (int Id_tutoria){
        try {
            String sql = "DELETE FROM Tutoria_Asesoria WHERE Id_tutoria = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, Id_tutoria);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarTutoriaAsesoria(Tutoria_Asesoria tA){
        int idTutoria= tA.getId_tutoria();
        try {
            String sql = "UPDATE Tutoria_Asesoria SET Id_tutoria= ?, Tipo_tutoria= ?, Nivel= ?, Programa_educativo= ?,"
                    + " Estudiante_nom_pila= ?, Estudiante_apellido_pat= ?, Estudiante_apellido_mat= ?, Fecha_inicio= ?,"
                    + " Fecha_fin= ?, Tiempo_minutos= ?, Tipo_guia= ?, Estado= ?, Profesor_CURP= ?  WHERE Id_tutoria ='"+ idTutoria + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, idTutoria);
            st.setString(2, tA.getTipo_tutoria());
            st.setString(3, tA.getNivel());
            st.setString(4, tA.getPrograma_educativo());
            st.setString(5, tA.getEstudiante_nom_pila());
            st.setString(6, tA.getEstudiante_apellido_pat());
            st.setString(7, tA.getEstudiante_apellido_mat());
            st.setDate(8, Date.valueOf(tA.getFecha_inicio()));
            st.setDate(9, Date.valueOf(tA.getFecha_fin()));
            st.setInt(10, tA.getTiempo_minutos());
            st.setString(11, tA.getTipo_guia());
            st.setString(12, tA.getEstado());
            st.setString(13, tA.getProfesor_CURP());
            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
    
    
}
