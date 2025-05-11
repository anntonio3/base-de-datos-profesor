/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author anton
 */
public class Asociado {
    private String Profesor_CURP;
    private int Proyectos_investigacion_Clave;

    public Asociado(String Profesor_CURP, int Proyectos_investigacion_Clave) {
        this.Profesor_CURP = Profesor_CURP;
        this.Proyectos_investigacion_Clave = Proyectos_investigacion_Clave;
    }

    public String getProfesor_CURP() {
        return Profesor_CURP;
    }

    public void setProfesor_CURP(String Profesor_CURP) {
        this.Profesor_CURP = Profesor_CURP;
    }

    public int getProyectos_investigacion_Clave() {
        return Proyectos_investigacion_Clave;
    }

    public void setProyectos_investigacion_Clave(int Proyectos_investigacion_Clave) {
        this.Proyectos_investigacion_Clave = Proyectos_investigacion_Clave;
    }
    
    @Override
    public String toString() {
        return "Asociado{" +
                "Profesor_CURP='" + Profesor_CURP + '\'' +
                ", Proyectos_investigacion_Clave=" + Proyectos_investigacion_Clave +
                '}';
    }

}
