/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.Miembros_CA_direccionIDAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Miembros_CA_direccionI;

/**
 *
 * @author anton
 */
public class MiembrosCADireccionIServicios {
    private Miembros_CA_direccionIDAO miembrosCADAO;

    public MiembrosCADireccionIServicios() {
        miembrosCADAO = new Miembros_CA_direccionIDAO();
    }
    
    
    public List<Miembros_CA_direccionI> obtenerMiembrosCADireccionI() throws SQLException {
        return miembrosCADAO.obtenerMiembrosCADireccionI();
    }
    
     public void insertarMiembrosCADireccionI (Miembros_CA_direccionI mCA){
        miembrosCADAO.insertarMiembrosCADireccionI(mCA);
    }
     
    public void eliminarMiembrosCADireccionI(int idTesisDI){
        miembrosCADAO.eliminarMiembrosCADireccionI(idTesisDI);   
    }
    
    public void actualizarMiembrosCAProyectosI(Miembros_CA_direccionI mCA){
        miembrosCADAO.actualizarMiembrosCADireccionI(mCA);
    }
    
}
