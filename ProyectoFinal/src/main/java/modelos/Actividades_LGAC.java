/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author anton
 */
public class Actividades_LGAC {
    private String Actividad1;
    private String Actividad2;
    private int LGAC_Id_LGAC;
    private String LGAC_Profesor_CURP;

    public Actividades_LGAC(String Actividad1, String Actividad2, int LGAC_Id_LGAC, String LGAC_Profesor_CURP) {
        this.Actividad1 = Actividad1;
        this.Actividad2 = Actividad2;
        this.LGAC_Id_LGAC = LGAC_Id_LGAC;
        this.LGAC_Profesor_CURP = LGAC_Profesor_CURP;
    }

    public String getActividad1() {
        return Actividad1;
    }

    public void setActividad1(String Actividad1) {
        this.Actividad1 = Actividad1;
    }

    public String getActividad2() {
        return Actividad2;
    }

    public void setActividad2(String Actividad2) {
        this.Actividad2 = Actividad2;
    }

    public int getLGAC_Id_LGAC() {
        return LGAC_Id_LGAC;
    }

    public void setLGAC_Id_LGAC(int LGAC_Id_LGAC) {
        this.LGAC_Id_LGAC = LGAC_Id_LGAC;
    }

    public String getLGAC_Profesor_CURP() {
        return LGAC_Profesor_CURP;
    }

    public void setLGAC_Profesor_CURP(String LGAC_Profesor_CURP) {
        this.LGAC_Profesor_CURP = LGAC_Profesor_CURP;
    }
    
    @Override
    public String toString() {
        return "Actividades_LGAC{" +
                "Actividad1='" + Actividad1 + '\'' +
                ", Actividad2='" + Actividad2 + '\'' +
                ", LGAC_Id_LGAC=" + LGAC_Id_LGAC +
                ", LGAC_Profesor_CURP='" + LGAC_Profesor_CURP + '\'' +
                '}';
    }

    
}
