/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.CA_DAO;
import java.sql.SQLException;
import java.util.List;
import modelos.CA;


/**
 *
 * @author anton
 */
public class CAServicios {
    
    private CA_DAO caDAO;

    public CAServicios() {
        caDAO= new CA_DAO();
    }
    
    
    public List<CA> obtenerCA() throws SQLException {
        return caDAO.obtenerCA();
    }
    
     public void insertarCA(CA ca){
        caDAO.insertarCA(ca);
    }
     
    public void eliminarCA(int idCA){
        caDAO.eliminarCA(idCA);   
    }
    
    public void actualizarCA(CA ca){
        caDAO.actualizarCA(ca);
    }
    
    public List<CA> buscarCAPorNombre (int idCA){
        return caDAO.buscarCAPorNombre(idCA);
    }
    
}
