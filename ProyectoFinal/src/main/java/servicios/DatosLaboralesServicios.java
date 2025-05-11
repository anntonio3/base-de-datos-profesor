/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;


import dao.Datos_laboralesDAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Datos_laborales;

/**
 *
 * @author anton
 */
public class DatosLaboralesServicios {
    private Datos_laboralesDAO datosLaboralesDAO;

    public DatosLaboralesServicios() {
        datosLaboralesDAO= new Datos_laboralesDAO();
    }
    
    
    public List<Datos_laborales> obtenerDatosLaborales() throws SQLException {
        return datosLaboralesDAO.obtenerDatosLaborales();
    }
    
     public void insertarDatosLaborales(Datos_laborales datosL){
        datosLaboralesDAO.insertarDatosLaborales(datosL);
    }
     
    public void eliminarDatosLaborales(int noProfesor){
        datosLaboralesDAO.eliminarDatosLaborales(noProfesor);   
    }
    
    public void actualizarDatosLaborales(Datos_laborales datosL){
        datosLaboralesDAO.actualizarDatosLaborales(datosL);
    }
    
    public List<Datos_laborales> buscarDatosLaboralesPorNombre (int noProfe){
        return datosLaboralesDAO.buscarDatosLaboralesPorNombre(noProfe);
    }
    
}
