/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import modelos.Profesor;
import servicios.ProfesorServicios;

/**
 *
 * @author anton
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProfesorServicios profesorService = new ProfesorServicios();
        
        //Profesor nuevoProfesor = new Profesor("CURP97", 16, "Jose", "Almaguer", "Rosas", "RFC15", 60606, "Casado", "ricardo.flores@gmail.com", 4, 15, 5,6);
        //profesorService.insertarProfesor(nuevoProfesor);
        
        //profesorService.eliminarProfesor("CURP97");
        Profesor nuevoAutor = new Profesor("CURP96", 15, "Jose", "Flores", "Rosas", "RFC15", 60606, "Casado", "ricardo.flores@gmail.com", 4, 15, 5,6);
        profesorService.actualizarAutor(nuevoAutor);
        //profesorService.buscarProfesorPorNombre("Ariel");
        
    }
    
}
