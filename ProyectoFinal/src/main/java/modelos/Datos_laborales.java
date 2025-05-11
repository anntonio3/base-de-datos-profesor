/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.time.LocalDate;

/**
 *
 * @author anton
 */
public class Datos_laborales {
    private int No_profesor;
    private String Nombramiento_institucional;
    private String Dedicacion;
    private String Dependencia;
    private LocalDate Inicio_contrato;
    private LocalDate Fin_contrato;
    private String Estado;
    private String Email_institucional;

    public Datos_laborales(int No_profesor, String Nombramiento_institucional, String Dedicacion, String Dependencia, LocalDate Inicio_contrato, LocalDate Fin_contrato, String Estado, String Email_institucional) {
        this.No_profesor = No_profesor;
        this.Nombramiento_institucional = Nombramiento_institucional;
        this.Dedicacion = Dedicacion;
        this.Dependencia = Dependencia;
        this.Inicio_contrato = Inicio_contrato;
        this.Fin_contrato = Fin_contrato;
        this.Estado = Estado;
        this.Email_institucional = Email_institucional;
    }
    
    public Datos_laborales(){
        
    }

    

    public int getNo_profesor() {
        return No_profesor;
    }

    public void setNo_profesor(int No_profesor) {
        this.No_profesor = No_profesor;
    }

    public String getNombramiento_institucional() {
        return Nombramiento_institucional;
    }

    public void setNombramiento_institucional(String Nombramiento_institucional) {
        this.Nombramiento_institucional = Nombramiento_institucional;
    }

    public String getDedicacion() {
        return Dedicacion;
    }

    public void setDedicacion(String Dedicacion) {
        this.Dedicacion = Dedicacion;
    }

    public String getDependencia() {
        return Dependencia;
    }

    public void setDependencia(String Dependencia) {
        this.Dependencia = Dependencia;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getEmail_institucional() {
        return Email_institucional;
    }

    public void setEmail_institucional(String Email_institucional) {
        this.Email_institucional = Email_institucional;
    }

    public LocalDate getInicio_contrato() {
        return Inicio_contrato;
    }

    public void setInicio_contrato(LocalDate Inicio_contrato) {
        this.Inicio_contrato = Inicio_contrato;
    }

    public LocalDate getFin_contrato() {
        return Fin_contrato;
    }

    public void setFin_contrato(LocalDate Fin_contrato) {
        this.Fin_contrato = Fin_contrato;
    }
    
    @Override
    public String toString() {
        return "Datos_laborales{" +
                "No_profesor=" + No_profesor +
                ", Nombramiento_institucional='" + Nombramiento_institucional + '\'' +
                ", Dedicacion='" + Dedicacion + '\'' +
                ", Dependencia='" + Dependencia + '\'' +
                ", Inicio_contrato=" + Inicio_contrato +
                ", Fin_contrato=" + Fin_contrato +
                ", Estado='" + Estado + '\'' +
                ", Email_institucional='" + Email_institucional + '\'' +
                '}';
    }
    
    
}
