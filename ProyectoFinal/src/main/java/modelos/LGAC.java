/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author anton
 */
public class LGAC {
    private int Id_LGAC;
    private String Nombre_LGAC;
    private int No_horas_semanas;
    private String Profesor_CURP;

    public LGAC(int Id_LGAC, String Nombre_LGAC, int No_horas_semanas, String Profesor_CURP) {
        this.Id_LGAC = Id_LGAC;
        this.Nombre_LGAC = Nombre_LGAC;
        this.No_horas_semanas = No_horas_semanas;
        this.Profesor_CURP = Profesor_CURP;
    }
    
    public LGAC(){
        
    }

    public int getId_LGAC() {
        return Id_LGAC;
    }

    public void setId_LGAC(int Id_LGAC) {
        this.Id_LGAC = Id_LGAC;
    }

    public String getNombre_LGAC() {
        return Nombre_LGAC;
    }

    public void setNombre_LGAC(String Nombre_LGAC) {
        this.Nombre_LGAC = Nombre_LGAC;
    }

    public int getNo_horas_semanas() {
        return No_horas_semanas;
    }

    public void setNo_horas_semanas(int No_horas_semanas) {
        this.No_horas_semanas = No_horas_semanas;
    }

    public String getProfesor_CURP() {
        return Profesor_CURP;
    }

    public void setProfesor_CURP(String Profesor_CURP) {
        this.Profesor_CURP = Profesor_CURP;
    }
    
    
}
