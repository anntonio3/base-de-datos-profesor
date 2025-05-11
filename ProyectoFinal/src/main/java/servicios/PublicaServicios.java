/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.CarrerasDAO;
import dao.PublicaDAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Carreras;
import modelos.Publica;

/**
 *
 * @author anton
 */
public class PublicaServicios {
    private PublicaDAO publicaDAO;

    public PublicaServicios() {
        publicaDAO= new PublicaDAO();
    }
    
    
    public List<Publica> obtenerPublica() throws SQLException {
        return publicaDAO.obtenerPublica();
    }
    
     public void insertarPublica(Publica p){
        publicaDAO.insertarPublica(p);
    }
     
    public void eliminarPublica(String idProfesor){
        publicaDAO.eliminarPublica(idProfesor);   
    }
    
    public void actualizarPublica(Publica p){
        publicaDAO.actualizarPublica(p);
    }
    
}
