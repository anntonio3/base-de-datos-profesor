/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author anton
 */
public class Telefonos_profesor {
    private int Telefono1;
    private int Telefono2;
    private String Profesor_CURP;

    public Telefonos_profesor(int Telefono1, int Telefono2, String Profesor_CURP) {
        this.Telefono1 = Telefono1;
        this.Telefono2 = Telefono2;
        this.Profesor_CURP = Profesor_CURP;
    }

    public int getTelefono1() {
        return Telefono1;
    }

    public void setTelefono1(int Telefono1) {
        this.Telefono1 = Telefono1;
    }

    public int getTelefono2() {
        return Telefono2;
    }

    public void setTelefono2(int Telefono2) {
        this.Telefono2 = Telefono2;
    }

    public String getProfesor_CURP() {
        return Profesor_CURP;
    }

    public void setProfesor_CURP(String Profesor_CURP) {
        this.Profesor_CURP = Profesor_CURP;
    }
    
    @Override
    public String toString() {
        return "Telefonos_profesor{" +
                "Telefono1=" + Telefono1 +
                ", Telefono2=" + Telefono2 +
                ", Profesor_CURP='" + Profesor_CURP + '\'' +
                '}';
    }
    
}
