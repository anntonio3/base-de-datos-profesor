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
import modelos.No_estudiantes_TutoriaA;

/**
 *
 * @author anton
 */
public class No_estudiantes_TutoriaADAO {
    
    public List<No_estudiantes_TutoriaA> obtenerNoEstudiantesTutoriaA() throws SQLException {
        List<No_estudiantes_TutoriaA> nEstudiantes = new ArrayList<>();
        String sql = "SELECT * FROM No_estudiantes_TutoriaA";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                No_estudiantes_TutoriaA nE = new No_estudiantes_TutoriaA(
                    rs.getInt("Estudiantes1"),
                    rs.getInt("Estudiantes2"),
                    rs.getInt("Estudiantes3"),
                    rs.getInt("Tutoria_Asesoria_Id_tutoria"),                             
                    rs.getString("Tutoria_Asesoria_Profesor_CURP")   
                );
                nEstudiantes.add(nE);
            }
        }

        return nEstudiantes;
        
    }
    
     public void insertarNoEstudiantesTutoriaA(No_estudiantes_TutoriaA nE){
        try{
            String sql = "INSERT INTO No_estudiantes_TutoriaA (Estudiante1, Estudiante2, Estudiante3,"
                    + " Tutoria_Asesoria_Id_tutoria, Tutoria_Asesoria_Profesor_CURP) VALUES (?,?,?,?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, nE.getEstudiante1());
            st.setInt(2, nE.getEstudiante2());
            st.setInt(3, nE.getEstudiante3());
            st.setInt(4, nE.getTutoria_Asesoria_Id_tutoria());
            st.setString(5, nE.getTutoria_Asesoria_Profesor_CURP());
           
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }



        }
     
     
    public void eliminarNoEstudiantesTutoriaA (int Tutoria_Asesoria_Id_tutoria){
        try {
            String sql = "DELETE FROM No_estudiantes_TutoriaA WHERE Tutoria_Asesoria_Id_tutoria = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(4, Tutoria_Asesoria_Id_tutoria);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarNoEstudiantesTutoriaA(No_estudiantes_TutoriaA nE){
        int idTutoria= nE.getTutoria_Asesoria_Id_tutoria();
        try {
            String sql = "UPDATE No_estudiantes_TutoriaA SET Estudiante1= ?, Estudiante2= ?, Estudiante3= ?, "
                    + "Tutoria_Asesoria_Id_tutoria= ?, Tutoria_Asesoria_Profesor_CURP= ?"
                    + " WHERE Tutoria_Asesoria_Id_tutoria ='"+ idTutoria + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, nE.getEstudiante1());
            st.setInt(2, nE.getEstudiante2());
            st.setInt(3, nE.getEstudiante3());
            st.setInt(4, idTutoria);
            st.setString(5, nE.getTutoria_Asesoria_Profesor_CURP());
         
            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
}
