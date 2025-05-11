/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.Produccion_academicaDAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Produccion_academica;


/**
 *
 * @author anton
 */
public class ProduccionAcademicaServicios {
    private Produccion_academicaDAO produccionADAO;

    public ProduccionAcademicaServicios() {
        produccionADAO = new Produccion_academicaDAO();
    }
    
    
    public List<Produccion_academica> obtenerProduccionAcademica() throws SQLException {
        return produccionADAO.obtenerProduccionAcademica();
    }
    
     public void insertarProduccionAcademica (Produccion_academica produA){
        produccionADAO.insertarProduccionAcademica(produA);
    }
     
    public void eliminarProduccionAcademica(int idProduccion){
        produccionADAO.eliminarProduccionAcademica(idProduccion);   
    }
    
    public void actualizarProduccionAcademica(Produccion_academica produA){
        produccionADAO.actualizarProduccionAcademica(produA);
    }
    
    public List<Produccion_academica> buscarProduccionAcademicaPorNombre (String titulo){
        return produccionADAO.buscarProduccionAcademicaPorNombre(titulo);
    }
    
}
