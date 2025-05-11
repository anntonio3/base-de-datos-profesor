/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author anton
 */
public class Miembros_CA_proyectosI {
    private String Miembro1;
    private String Miembro2;
    private String Miembro3;
    private int Proyectos_investigacion_Clave;

    public Miembros_CA_proyectosI(String Miembro1, String Miembro2, String Miembro3, int Proyectos_investigacion_Clave) {
        this.Miembro1 = Miembro1;
        this.Miembro2 = Miembro2;
        this.Miembro3 = Miembro3;
        this.Proyectos_investigacion_Clave = Proyectos_investigacion_Clave;
    }

    public String getMiembro1() {
        return Miembro1;
    }

    public void setMiembro1(String Miembro1) {
        this.Miembro1 = Miembro1;
    }

    public String getMiembro2() {
        return Miembro2;
    }

    public void setMiembro2(String Miembro2) {
        this.Miembro2 = Miembro2;
    }

    public String getMiembro3() {
        return Miembro3;
    }

    public void setMiembro3(String Miembro3) {
        this.Miembro3 = Miembro3;
    }

    public int getProyectos_investigacion_Clave() {
        return Proyectos_investigacion_Clave;
    }

    public void setProyectos_investigacion_Clave(int Proyectos_investigacion_Clave) {
        this.Proyectos_investigacion_Clave = Proyectos_investigacion_Clave;
    }
    
    
}
