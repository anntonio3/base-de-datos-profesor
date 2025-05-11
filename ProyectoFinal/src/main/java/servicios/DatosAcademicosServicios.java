/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.Datos_academicosDAO;
import dao.Datos_laboralesDAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Datos_academicos;
import modelos.Datos_laborales;

/**
 *
 * @author anton
 */
public class DatosAcademicosServicios {
    private Datos_academicosDAO datosAcademicosDAO;

    public DatosAcademicosServicios() {
        datosAcademicosDAO= new Datos_academicosDAO();
    }
    
    
    public List<Datos_academicos> obtenerDatosAcademicos() throws SQLException {
        return datosAcademicosDAO.obtenerDatosAcademicos();
    }
    
     public void insertarDatosAcademicos(Datos_academicos datosA){
        datosAcademicosDAO.insertarDatosAcademicos(datosA);
    }
     
    public void eliminarDatosAcademicos(int cedula){
        datosAcademicosDAO.eliminarDatosAcademicos(cedula);   
    }
    
    public void actualizarDatosAcademicos(Datos_academicos datosA){
        datosAcademicosDAO.actualizarDatosAcademicos(datosA);
    }
    
    public List<Datos_academicos> buscarDatosAcademicosPorNombre (int cedula){
        return datosAcademicosDAO.buscarDatosAcademicosPorNombre(cedula);
    }
}
