/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author anton
 */
public class Resultados_GestionAV {
    private String Resultado1;
    private String Resultado2;
    private String Resultado3;
    private int Gestion_AV_Clave;

    public Resultados_GestionAV(String Resultado1, String Resultado2, String Resultado3, int Gestion_AV_Clave) {
        this.Resultado1 = Resultado1;
        this.Resultado2 = Resultado2;
        this.Resultado3 = Resultado3;
        this.Gestion_AV_Clave = Gestion_AV_Clave;
    }

    public String getResultado1() {
        return Resultado1;
    }

    public void setResultado1(String Resultado1) {
        this.Resultado1 = Resultado1;
    }

    public String getResultado2() {
        return Resultado2;
    }

    public void setResultado2(String Resultado2) {
        this.Resultado2 = Resultado2;
    }

    public String getResultado3() {
        return Resultado3;
    }

    public void setResultado3(String Resultado3) {
        this.Resultado3 = Resultado3;
    }

    public int getGestion_AV_Clave() {
        return Gestion_AV_Clave;
    }

    public void setGestion_AV_Clave(int Gestion_AV_Clave) {
        this.Gestion_AV_Clave = Gestion_AV_Clave;
    }
    
    
}
