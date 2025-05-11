/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.Gestion_AV_DAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Gestion_AV;

/**
 *
 * @author anton
 */
public class GestionAVServicios {
    private Gestion_AV_DAO gestionAVDAO;

    public GestionAVServicios() {
        gestionAVDAO= new Gestion_AV_DAO();
    }
    
    
    public List<Gestion_AV> obtenerGestionAV() throws SQLException {
        return gestionAVDAO.obtenerGestionAV();
    }
    
     public void insertarGestionAV(Gestion_AV gAV){
        gestionAVDAO.insertarGestionAV(gAV);
    }
     
    public void eliminarGestionAV(int clave){
        gestionAVDAO.eliminarGestionAV(clave);   
    }
    
    public void actualizarGestionAV(Gestion_AV gAV){
        gestionAVDAO.actualizarGestionAV(gAV);
    }
    
}
