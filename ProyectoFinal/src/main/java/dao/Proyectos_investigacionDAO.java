/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.Proyectos_investigacion;

/**
 *
 * @author anton
 */
public class Proyectos_investigacionDAO {
    
    public List<Proyectos_investigacion> obtenerProyectosInvestigacion() throws SQLException {
        List<Proyectos_investigacion> proyectosI = new ArrayList<>();
        String sql = "SELECT * FROM Proyectos_investigacion";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Proyectos_investigacion pI = new Proyectos_investigacion(
                    rs.getInt("Clave"),
                    rs.getString("Titulo_proyecto"),                                                                            
                    rs.getDate("Fecha_inicio").toLocalDate(),
                    rs.getDate("Fecha_fin").toLocalDate(),   
                    rs.getString("Rol"),
                    rs.getString("Descripcion_proyecto"),
                    rs.getString("Tipo_patrocinado"),
                    rs.getString("Es_CA"),
                    rs.getInt("No_ind_CA")
   
                );
                proyectosI.add(pI);
            }
        }

        return proyectosI;
    }
    
     public void insertarProyectosInvestigacion(Proyectos_investigacion pI){
        try{
            String sql = "INSERT INTO Proyectos_investigacion (Clave, Titulo_proyecto, Fecha_inicio, Fecha_fin, Rol"
                    + ", Descripcion_proyecto, Tipo_patrocinado, Es_CA, No_ind_CA) VALUES (?,?,?,?,?,?,?,?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, pI.getClave());
            st.setString(2, pI.getTitulo_proyecto());
            st.setDate(3, Date.valueOf(pI.getFecha_inicio()));
            st.setDate(4, Date.valueOf(pI.getFecha_fin()));
            st.setString(5, pI.getRol());
            st.setString(6, pI.getDescripcion_proyecto());
            st.setString(7, pI.getTipo_patrocinado());
            st.setString(8, pI.getEs_CA());
            st.setInt(9, pI.getNo_ind_CA());
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }

    }
     
     
    public void eliminarProyectosInvestigacion (int Clave){
        try {
            String sql = "DELETE FROM Proyectos_investigacion WHERE Clave = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, Clave);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarProyectosInvestigacion(Proyectos_investigacion pI){
        int clave = pI.getClave();
        try {
            String sql = "UPDATE Proyectos_investigacion SET Clave= ?, Titulo_proyecto= ?, Fecha_inicio= ?, Fecha_fin= ?, Rol= ?,"
                    + " Descripcion_proyecto= ?, Tipo_patrocinado= ?, Es_CA= ?, No_ind_CA= ? WHERE Clave ='"+ clave + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, clave);
            st.setString(2, pI.getTitulo_proyecto());
            st.setDate(3, Date.valueOf(pI.getFecha_inicio()));
            st.setDate(4, Date.valueOf(pI.getFecha_fin()));
            st.setString(5, pI.getRol());
            st.setString(6, pI.getDescripcion_proyecto());
            st.setString(7, pI.getTipo_patrocinado());
            st.setString(8, pI.getEs_CA());
            st.setInt(9, pI.getNo_ind_CA());
            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
    
    
    
    public List<Proyectos_investigacion> buscarProyectosInvestigacionPorNombre(String tituloProyecto) {
        List<Proyectos_investigacion> proyectosI = new ArrayList<>();
        String sql = "SELECT * FROM Proyectos_investigacion WHERE Titulo_proyecto LIKE ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {

            st.setString(1, "%" + tituloProyecto + "%");
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                Proyectos_investigacion pI = new Proyectos_investigacion(
                    resultSet.getInt("Clave"),
                    resultSet.getString("Titulo_proyecto"),                                                                            
                    resultSet.getDate("Fecha_inicio").toLocalDate(),
                    resultSet.getDate("Fecha_fin").toLocalDate(),   
                    resultSet.getString("Rol"),
                    resultSet.getString("Descripcion_proyecto"),
                    resultSet.getString("Tipo_patrocinado"),
                    resultSet.getString("Es_CA"),
                    resultSet.getInt("No_ind_CA") 
                );
                proyectosI.add(pI);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de excepciones, puede mejorarse según necesidades
        }
        return proyectosI;
    }
    
    
}
