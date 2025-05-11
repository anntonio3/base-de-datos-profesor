/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;


import dao.LGAC_DAO;
import java.sql.SQLException;
import java.util.List;
import modelos.LGAC;

/**
 *
 * @author anton
 */
public class LGACServicios {
    private LGAC_DAO lgacDAO;

    public LGACServicios() {
        lgacDAO= new LGAC_DAO();
    }
    
    
    public List<LGAC> obtenerLGAC() throws SQLException {
        return lgacDAO.obtenerLGAC();
    }
    
     public void insertarLGAC(LGAC lgac){
        lgacDAO.insertarLGAC(lgac);
    }
     
    public void eliminarLGAC(int idLGAC){
        lgacDAO.eliminarLGAC(idLGAC);   
    }
    
    public void actualizarLGAC(LGAC lgac){
        lgacDAO.actualizarLGAC(lgac);
    }
    
    public List<LGAC> buscarLGACPorNombre (int idLGAC){
        return lgacDAO.buscarLGACPorNombre(idLGAC);
    }
    
}
