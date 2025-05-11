/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.Tutoria_AsesoriaDAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Tutoria_Asesoria;


/**
 *
 * @author anton
 */
public class TutoriaAsesoriaServicios {
    
    private Tutoria_AsesoriaDAO tutoriaADAO;

    public TutoriaAsesoriaServicios() {
        tutoriaADAO= new Tutoria_AsesoriaDAO();
    }
    
    
    public List<Tutoria_Asesoria> obtenerTutoriaAsesoria() throws SQLException {
        return tutoriaADAO.obtenerTutoriaAsesoria();
    }
    
     public void insertarTutoriaAsesoria(Tutoria_Asesoria tA){
        tutoriaADAO.insertarTutoriaAsesoria(tA);
    }
     
    public void eliminarTutoriaAsesoria(int idTutoria){
        tutoriaADAO.eliminarTutoriaAsesoria(idTutoria);   
    }
    
    public void actualizarTutoriaAsesoria(Tutoria_Asesoria tA){
        tutoriaADAO.actualizarTutoriaAsesoria(tA);
    }
    
}
