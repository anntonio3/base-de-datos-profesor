/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.Carreras;
import modelos.Profesor;

/**
 *
 * @author anton
 */
public class CarrerasDAO {
    
    public List<Carreras> obtenerCarreras() throws SQLException {
        List<Carreras> carreras = new ArrayList<>();
        String sql = "SELECT * FROM Carreras";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Carreras cra = new Carreras(
                    rs.getInt("Id_carrera"),
                    rs.getString("Nom_carrera")                                                                                           
                );
                carreras.add(cra);
            }
        }

        return carreras;
        
    }
    
     public void insertarCarrera(Carreras cra){
        try{
            String sql = "INSERT INTO Carreras (Id_carrera, Nom_carrera) VALUES (?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, cra.getId_carrera());
            st.setString(2, cra.getNom_carrera());
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
        }

    }
     
     
    public void eliminarCarrera (int Id_carrera){
        try {
            String sql = "DELETE FROM Carreras WHERE Id_carrera = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, Id_carrera);
            st.executeUpdate();
            System.out.println("Eliminado correctamente");
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
    
    public void actualizarCarrera(Carreras cra){
        int idCarrera = cra.getId_carrera();
        try {
            String sql = "UPDATE Carreras SET Id_carrera= ?, Nom_carrera= ? WHERE Id_carrera ='"+ idCarrera + "'";
            Connection conn = Conexion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setInt(1, idCarrera);
            st.setString(2, cra.getNom_carrera());

            
            st.execute();
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("No se realizo actualizacion"+ex.getMessage());
        }
    }
    
    public List<Carreras> buscarCarreraPorNombre(int idCarrera) {
        List<Carreras> carrera = new ArrayList<>();
        String sql = "SELECT * FROM Carreras WHERE Id_carrera LIKE ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {

            st.setString(1, "%" + idCarrera + "%");
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                Carreras cra = new Carreras(
                    resultSet.getInt("Id_carrera"),
                    resultSet.getString("Nom_carrera")                                         
                );
                carrera.add(cra);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de excepciones, puede mejorarse según necesidades
        }
        return carrera;
    }
    
}
