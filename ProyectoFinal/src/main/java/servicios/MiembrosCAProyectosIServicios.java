/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.Miembros_CA_proyectosIDAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Miembros_CA_proyectosI;

/**
 *
 * @author anton
 */
public class MiembrosCAProyectosIServicios {
    private Miembros_CA_proyectosIDAO miembrosCADAO;

    public MiembrosCAProyectosIServicios() {
        miembrosCADAO = new Miembros_CA_proyectosIDAO();
    }
    
    
    public List<Miembros_CA_proyectosI> obtenerMiembrosCAProyectosI() throws SQLException {
        return miembrosCADAO.obtenerMiembrosCAProyectosI();
    }
    
     public void insertarMiembrosCAProyectosI (Miembros_CA_proyectosI mCA){
        miembrosCADAO.insertarMiembrosCAProyectosI(mCA);
    }
     
    public void eliminarMiembrosCAProyectosI(int clavePI){
        miembrosCADAO.eliminarMiembrosCAProyectosI(clavePI);   
    }
    
    public void actualizarMiembrosCAProyectosI(Miembros_CA_proyectosI mCA){
        miembrosCADAO.actualizarMiembrosCAProyectosI(mCA);
    }
    
}
