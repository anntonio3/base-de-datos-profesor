/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.Proyectos_investigacionDAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Proyectos_investigacion;

/**
 *
 * @author anton
 */
public class ProyectosInvestigacionServicios {
    
    private Proyectos_investigacionDAO proyectosIDAO;

    public ProyectosInvestigacionServicios() {
        proyectosIDAO= new Proyectos_investigacionDAO();
    }
    
    
    public List<Proyectos_investigacion> obtenerProyectosInvestigacion() throws SQLException {
        return proyectosIDAO.obtenerProyectosInvestigacion();
    }
    
     public void insertarProyectosInvestigacion(Proyectos_investigacion pI){
        proyectosIDAO.insertarProyectosInvestigacion(pI);
    }
     
    public void eliminarProyectosInvestigacion(int clave){
        proyectosIDAO.eliminarProyectosInvestigacion(clave);   
    }
    
    public void actualizarProyectosInvestigacion(Proyectos_investigacion pI){
        proyectosIDAO.actualizarProyectosInvestigacion(pI);
    }
    
    public List<Proyectos_investigacion> buscarProyectosInvestigacionPorNombre (String tituloProyecto){
        return proyectosIDAO.buscarProyectosInvestigacionPorNombre(tituloProyecto);
    }
    
}
