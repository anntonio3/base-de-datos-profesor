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
import modelos.Asignaturas;
import modelos.Datos_academicos;

/**
 *
 * @author anton
 */
public class AsignaturasDAO {
    
    public List<Asignaturas> obtenerAsignaturas() throws SQLException {
        List<Asignaturas> asignaturas = new ArrayList<>();
        String sql = "SELECT * FROM Asignaturas";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Asignaturas asg = new Asignaturas(
                    rs.getString("Nombre_curso"),                                       
                    rs.getString("DES"),
                    rs.getString("Nivel"),
                    rs.getString("Programa_educativo"),  
                    rs.getDate("Fecha_inicio_curso").toLocalDate(),
                    rs.getInt("No_alumnos_inscritos"),
                    rs.getInt("No_duracion_semanas"),
                    rs.getString("Profesor_CURP")
   
                );
                asignaturas.add(asg);
            }
        }

        return asignaturas;
    }
    
    
     public void insertarAsignaturas(Asignaturas asg){
        try{
            String sql = "INSERT INTO Asignaturas (Nombre_curso, DES, Nivel, Programa_educativo, Fecha_inicio_curso"
                    + ", No_alumnos_inscritos, No_duracion_semanas, Profesor_CURP) VALUES (?,?,?,?,?,?,?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, asg.getNombre_curso());
            st.setString(2, asg.getDES());
            st.setString(3, asg.getNivel());
            st.setString(4, asg.getPrograma_educativo());
            st.setDate(5, Date.valueOf(asg.getFecha_inicio_curso()));
            st.setInt(6, asg.getNo_alumnos_inscritos());
            st.setInt(7, asg.getNo_duracion_semanas());
            st.setString(8, asg.getProfesor_CURP());
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }

    }
     
     
    public void eliminarAsignaturas (String Nombre_curso){
        try {
            String sql = "DELETE FROM Asignaturas WHERE Nombre_curso = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1, Nombre_curso);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarAsignaturas(Asignaturas asg){
        String nomCurso = asg.getNombre_curso();
        try {
            String sql = "UPDATE Asignaturas SET Nombre_curso= ?, DES= ?, Nivel= ?, Programa_educativo= ?, Fecha_inicio_curso= ?,"
                    + " No_alumnos_inscritos= ?, No_duracion_semanas= ?, Profesor_CURP= ? WHERE Nombre_curso ='"+ nomCurso + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1, nomCurso);
            st.setString(2, asg.getDES());
            st.setString(3, asg.getNivel());
            st.setString(4, asg.getPrograma_educativo());
            st.setDate(5, Date.valueOf(asg.getFecha_inicio_curso()));
            st.setInt(6, asg.getNo_alumnos_inscritos());
            st.setInt(7, asg.getNo_duracion_semanas());
            st.setString(8, asg.getProfesor_CURP());
            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
    
    
    
    public List<Asignaturas> buscarAsignaturasPorNombre(String nombreAsignatura) {
        List<Asignaturas> asignaturas = new ArrayList<>();
        String sql = "SELECT * FROM Asignaturas WHERE Nombre_curso LIKE ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {

            st.setString(1, "%" + nombreAsignatura + "%");
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                Asignaturas asg = new Asignaturas(
                    resultSet.getString("Nombre_curso"),                                       
                    resultSet.getString("DES"),
                    resultSet.getString("Nivel"),
                    resultSet.getString("Programa_educativo"),  
                    resultSet.getDate("Fecha_inicio_curso").toLocalDate(),
                    resultSet.getInt("No_alumnos_inscritos"),
                    resultSet.getInt("No_duracion_semanas"),
                    resultSet.getString("Profesor_CURP")  
                );
                asignaturas.add(asg);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de excepciones, puede mejorarse según necesidades
        }
        return asignaturas;
    }
    
    
    
}
