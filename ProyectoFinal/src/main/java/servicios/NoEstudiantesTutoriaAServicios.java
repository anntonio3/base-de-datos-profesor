/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.No_estudiantes_TutoriaADAO;
import java.sql.SQLException;
import java.util.List;
import modelos.No_estudiantes_TutoriaA;


/**
 *
 * @author anton
 */
public class NoEstudiantesTutoriaAServicios {
    private No_estudiantes_TutoriaADAO nEstudiantesDAO;

    public NoEstudiantesTutoriaAServicios() {
        nEstudiantesDAO = new No_estudiantes_TutoriaADAO();
    }
    
    
    public List<No_estudiantes_TutoriaA> obtenerNoEstudiantesTutoriaA() throws SQLException {
        return nEstudiantesDAO.obtenerNoEstudiantesTutoriaA();
    }
    
     public void insertarNoEstudiantesTutoriaA (No_estudiantes_TutoriaA nE){
        nEstudiantesDAO.insertarNoEstudiantesTutoriaA(nE);
    }
     
    public void eliminarNoEstudiantesTutoriaA(int idTutoria){
        nEstudiantesDAO.eliminarNoEstudiantesTutoriaA(idTutoria);   
    }
    
    public void actualizarNoEstudiantesTutoriaA(No_estudiantes_TutoriaA nE){
        nEstudiantesDAO.actualizarNoEstudiantesTutoriaA(nE);
    }
    
}
