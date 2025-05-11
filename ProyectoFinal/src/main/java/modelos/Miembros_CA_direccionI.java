/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author anton
 */
public class Miembros_CA_direccionI {
    private String Miembro1;
    private String Miembro2;
    private String Miembro3;
    private int Direccion_individualizada_Id_tesis;
    private String Direccion_individualizada_Profesor_CURP;

    public Miembros_CA_direccionI(String Miembro1, String Miembro2, String Miembro3, int Direccion_individualizada_Id_tesis, String Direccion_individualizada_Profesor_CURP) {
        this.Miembro1 = Miembro1;
        this.Miembro2 = Miembro2;
        this.Miembro3 = Miembro3;
        this.Direccion_individualizada_Id_tesis = Direccion_individualizada_Id_tesis;
        this.Direccion_individualizada_Profesor_CURP = Direccion_individualizada_Profesor_CURP;
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

    public int getDireccion_individualizada_Id_tesis() {
        return Direccion_individualizada_Id_tesis;
    }

    public void setDireccion_individualizada_Id_tesis(int Direccion_individualizada_Id_tesis) {
        this.Direccion_individualizada_Id_tesis = Direccion_individualizada_Id_tesis;
    }

    public String getDireccion_individualizada_Profesor_CURP() {
        return Direccion_individualizada_Profesor_CURP;
    }

    public void setDireccion_individualizada_Profesor_CURP(String Direccion_individualizada_Profesor_CURP) {
        this.Direccion_individualizada_Profesor_CURP = Direccion_individualizada_Profesor_CURP;
    }
    
    
}
