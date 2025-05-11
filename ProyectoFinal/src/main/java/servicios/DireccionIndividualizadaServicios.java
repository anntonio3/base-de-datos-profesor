/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.Direccion_individualizadaDAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Direccion_individualizada;


/**
 *
 * @author anton
 */
public class DireccionIndividualizadaServicios {
    
    private Direccion_individualizadaDAO direccionIDAO;

    public DireccionIndividualizadaServicios() {
        direccionIDAO= new Direccion_individualizadaDAO();
    }
    
    
    public List<Direccion_individualizada> obtenerDireccionIndividualizada() throws SQLException {
        return direccionIDAO.obtenerDireccionIndividualizada();
    }
    
     public void insertarDireccionIndividualizada(Direccion_individualizada dI){
        direccionIDAO.insertarDireccionIndividualizada(dI);
    }
     
    public void eliminarDireccionIndividualizada(int idTesis){
        direccionIDAO.eliminarDireccionIndividualizada(idTesis);   
    }
    
    public void actualizarDireccionIndividualizada(Direccion_individualizada dI){
        direccionIDAO.actualizarDireccionIndividualizada(dI);
    }
    
    public List<Direccion_individualizada> buscarDireccionIndividualizadaPorNombre (int idTesis){
        return direccionIDAO.buscarDireccionIndividualizadaPorNombre(idTesis);
    }
}
