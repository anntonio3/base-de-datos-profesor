/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.RealizaDAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Realiza;

/**
 *
 * @author anton
 */
public class RealizaServicios {
    private RealizaDAO realizaDAO;

    public RealizaServicios() {
        realizaDAO= new RealizaDAO();
    }
    
    
    public List<Realiza> obtenerRealiza() throws SQLException {
        return realizaDAO.obtenerRealiza();
    }
    
     public void insertarRealiza(Realiza r){
        realizaDAO.insertarRealiza(r);
    }
     
    public void eliminarRealiza(String idProfesor){
        realizaDAO.eliminarRealiza(idProfesor);   
    }
    
    public void actualizarRealiza(Realiza r){
        realizaDAO.actualizarRealiza(r);
    }
    
}
