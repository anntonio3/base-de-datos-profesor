/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author anton
 */
public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/Proyecto_final";
    private static final String USER = "root";
    private static final String PASSWORD = "password";
    

    public static Connection getConnection() throws SQLException {
        System.out.println("CONEXION REALIZADA");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    
    
}
