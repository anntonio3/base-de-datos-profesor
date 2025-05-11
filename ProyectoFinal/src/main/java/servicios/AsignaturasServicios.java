/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;


import dao.AsignaturasDAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Asignaturas;


/**
 *
 * @author anton
 */
public class AsignaturasServicios {
    private AsignaturasDAO asignaturasDAO;

    public AsignaturasServicios() {
        asignaturasDAO= new AsignaturasDAO();
    }
    
    
    public List<Asignaturas> obtenerCarreras() throws SQLException {
        return asignaturasDAO.obtenerAsignaturas();
    }
    
     public void insertarAsignaturas(Asignaturas asg){
        asignaturasDAO.insertarAsignaturas(asg);
    }
     
    public void eliminarAsignaturas(String nomCurso){
        asignaturasDAO.eliminarAsignaturas(nomCurso);   
    }
    
    public void actualizarAsignaturas(Asignaturas asignaturas){
        asignaturasDAO.actualizarAsignaturas(asignaturas);
    }
    
    public List<Asignaturas> buscarAsignaturasPorNombre (String nomAsignatura){
        return asignaturasDAO.buscarAsignaturasPorNombre(nomAsignatura);
    }
    
}
