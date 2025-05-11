/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.AsociadoDAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Asociado;

/**
 *
 * @author anton
 */
public class AsociadoServicios {
    private AsociadoDAO asociadoDAO;

    public AsociadoServicios() {
        asociadoDAO= new AsociadoDAO();
    }
    
    
    public List<Asociado> obtenerAsociado() throws SQLException {
        return asociadoDAO.obtenerAsociado();
    }
    
     public void insertarAsociado(Asociado a){
        asociadoDAO.insertarAsociado(a);
    }
     
    public void eliminarAsociado(String idProfesor){
        asociadoDAO.eliminarAsociado(idProfesor);   
    }
    
    public void actualizarAsociado(Asociado a){
        asociadoDAO.actualizarAsociado(a);
    }
    
}
