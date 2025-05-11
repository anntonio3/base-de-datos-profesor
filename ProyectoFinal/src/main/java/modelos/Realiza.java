/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author anton
 */
public class Realiza {
    private int Gestion_AV_Clave;
    private String Profesor_CURP;

    public Realiza(int Gestion_AV_Clave, String Profesor_CURP) {
        this.Gestion_AV_Clave = Gestion_AV_Clave;
        this.Profesor_CURP = Profesor_CURP;
    }

    public int getGestion_AV_Clave() {
        return Gestion_AV_Clave;
    }

    public void setGestion_AV_Clave(int Gestion_AV_Clave) {
        this.Gestion_AV_Clave = Gestion_AV_Clave;
    }

    public String getProfesor_CURP() {
        return Profesor_CURP;
    }

    public void setProfesor_CURP(String Profesor_CURP) {
        this.Profesor_CURP = Profesor_CURP;
    }
    
    
}
