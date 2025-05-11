/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.ProfesorDAO;
import dao.Telefonos_profesorDAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Profesor;
import modelos.Telefonos_profesor;

/**
 *
 * @author anton
 */
public class TelefonosProfesorServicios {
    private Telefonos_profesorDAO telefonosProfesorDAO;

    public TelefonosProfesorServicios() {
        telefonosProfesorDAO = new Telefonos_profesorDAO();
    }
    
    
    public List<Telefonos_profesor> obtenerTelefonosProfesor() throws SQLException {
        return telefonosProfesorDAO.obtenerTelefonosProfesor();
    }
    
     public void insertarTelefonosProfesor (Telefonos_profesor telProfe){
        telefonosProfesorDAO.insertarTelefonosProfesor(telProfe);
    }
     
    public void eliminarTelefonosProfesor(String IdCarrera){
        telefonosProfesorDAO.eliminarTelefonosProfesor(IdCarrera);   
    }
    
    public void actualizarTelefonosProfesor(Telefonos_profesor telProfe){
        telefonosProfesorDAO.actualizarTelefonosProfesor(telProfe);
    }
    
    
}
