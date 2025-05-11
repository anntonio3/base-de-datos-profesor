/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.CarrerasDAO;
import dao.ProfesorDAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Carreras;
import modelos.Profesor;

/**
 *
 * @author anton
 */
public class CarrerasServicios {
    private CarrerasDAO carrerasDAO;

    public CarrerasServicios() {
        carrerasDAO= new CarrerasDAO();
    }
    
    
    public List<Carreras> obtenerCarreras() throws SQLException {
        return carrerasDAO.obtenerCarreras();
    }
    
     public void insertarCarrera(Carreras cra){
        carrerasDAO.insertarCarrera(cra);
    }
     
    public void eliminarCarrera(int IdCarrera){
        carrerasDAO.eliminarCarrera(IdCarrera);   
    }
    
    public void actualizarCarrera(Carreras cra){
        carrerasDAO.actualizarCarrera(cra);
    }
    
    public List<Carreras> buscarCarreraPorNombre (int idCarrera){
        return carrerasDAO.buscarCarreraPorNombre(idCarrera);
    }
    
}
