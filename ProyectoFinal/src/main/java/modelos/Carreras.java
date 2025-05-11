/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author anton
 */
public class Carreras {
    private int Id_carrera;
    private String Nom_carrera;

    public Carreras(int Id_carrera, String Nom_carrera) {
        this.Id_carrera = Id_carrera;
        this.Nom_carrera = Nom_carrera;
    }
    
    public Carreras(){
        
    }

    public int getId_carrera() {
        return Id_carrera;
    }

    public void setId_carrera(int Id_carrera) {
        this.Id_carrera = Id_carrera;
    }

    public String getNom_carrera() {
        return Nom_carrera;
    }

    public void setNom_carrera(String Nom_carrera) {
        this.Nom_carrera = Nom_carrera;
    }
    
    @Override
    public String toString() {
        return "Carreras{" + "Id_carrera=" + Id_carrera + ", Nom_carrera=" + Nom_carrera + '}';
    }
}
