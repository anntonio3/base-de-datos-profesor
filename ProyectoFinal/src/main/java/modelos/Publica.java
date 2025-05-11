/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author anton
 */
public class Publica {
    private String Profesor_CURP;
    private String Produccion_academica_Id_produccion;

    public Publica(String Profesor_CURP, String Produccion_academica_Id_produccion) {
        this.Profesor_CURP = Profesor_CURP;
        this.Produccion_academica_Id_produccion = Produccion_academica_Id_produccion;
    }

    public String getProfesor_CURP() {
        return Profesor_CURP;
    }

    public void setProfesor_CURP(String Profesor_CURP) {
        this.Profesor_CURP = Profesor_CURP;
    }

    public String getProduccion_academica_Id_produccion() {
        return Produccion_academica_Id_produccion;
    }

    public void setProduccion_academica_Id_produccion(String Produccion_academica_Id_produccion) {
        this.Produccion_academica_Id_produccion = Produccion_academica_Id_produccion;
    }
    
    @Override
    public String toString() {
        return "Publica{" +
                "Profesor_CURP=" + Profesor_CURP +
                ", Produccion_academica_Id_produccion='" + Produccion_academica_Id_produccion + '\'' +
                '}';
    }

}
