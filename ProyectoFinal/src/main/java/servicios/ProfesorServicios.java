/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.ProfesorDAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Profesor;

/**
 *
 * @author anton
 */
public class ProfesorServicios {
    private ProfesorDAO profesorDAO;

    public ProfesorServicios() {
        profesorDAO = new ProfesorDAO();
    }
    
    
    public List<Profesor> obtenerProfesor() throws SQLException {
        return profesorDAO.obtenerProfesor();
    }
    
     public void insertarProfesor (Profesor profe){
        profesorDAO.insertarProfesor(profe);
    }
     
    public void eliminarProfesor(String CURP){
        profesorDAO.eliminarProfesor(CURP);   
    }
    
    public void actualizarAutor(Profesor profe){
        profesorDAO.actualizarProfesor(profe);
    }
    
    public List<Profesor> buscarProfesorPorNombre (String nombrePila){
        return profesorDAO.buscarProfesorPorNombre(nombrePila);
    }
    
}
