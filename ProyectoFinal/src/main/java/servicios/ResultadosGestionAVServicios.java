/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.Resultados_GestionAV_DAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Resultados_GestionAV;


/**
 *
 * @author anton
 */
public class ResultadosGestionAVServicios {
    
    private Resultados_GestionAV_DAO resultadosGDAO;

    public ResultadosGestionAVServicios() {
        resultadosGDAO= new Resultados_GestionAV_DAO();
    }
    
    
    public List<Resultados_GestionAV> obtenerResultadosGestionAV() throws SQLException {
        return resultadosGDAO.obtenerResultadosGestionAV();
    }
    
     public void insertarResultadosGestionAV(Resultados_GestionAV rG){
        resultadosGDAO.insertarResultadosGestionAV(rG);
    }
     
    public void eliminarResultadosGestionAV(int clave){
        resultadosGDAO.eliminarResultadosGestionAV(clave);   
    }
    
    public void actualizarResultadosGestionAV(Resultados_GestionAV rG){
        resultadosGDAO.actualizarResultadosGestionAV(rG);
    }
}
