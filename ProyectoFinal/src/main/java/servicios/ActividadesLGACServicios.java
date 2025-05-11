/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.Actividades_LGAC_DAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Actividades_LGAC;

/**
 *
 * @author anton
 */
public class ActividadesLGACServicios {
    private Actividades_LGAC_DAO actividadesLGACDAO;

    public ActividadesLGACServicios() {
        actividadesLGACDAO= new Actividades_LGAC_DAO();
    }
    
    
    public List<Actividades_LGAC> obtenerActividadesLGAC() throws SQLException {
        return actividadesLGACDAO.obtenerActividadesLGAC();
    }
    
     public void insertarActividadesLGAC (Actividades_LGAC aLGAC){
        actividadesLGACDAO.insertarActividadesLGAC(aLGAC);
    }
     
    public void eliminarActividadesLGAC(int idLGAC){
        actividadesLGACDAO.eliminarActividadesLGAC(idLGAC);   
    }
    
    public void actualizarActividadesLGAC(Actividades_LGAC aLGAC){
        actividadesLGACDAO.actualizarActividadesLGAC(aLGAC);
    }
    
}
