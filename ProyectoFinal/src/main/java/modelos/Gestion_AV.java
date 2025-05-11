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
public class Gestion_AV {
    private int Clave;
    private String Tipo;
    private String Descripcion;
    private String Funcion_encomendada;
    private LocalDate Fecha_inicio;
    private LocalDate Fecha_fin;
    private int No_horas_semana;
    private String Estado;
    private String Institucion_gestion;

    public Gestion_AV(int Clave, String Tipo, String Descripcion, String Funcion_encomendada, LocalDate Fecha_inicio, LocalDate Fecha_fin, int No_horas_semana, String Estado, String Institucion_gestion) {
        this.Clave = Clave;
        this.Tipo = Tipo;
        this.Descripcion = Descripcion;
        this.Funcion_encomendada = Funcion_encomendada;
        this.Fecha_inicio = Fecha_inicio;
        this.Fecha_fin = Fecha_fin;
        this.No_horas_semana = No_horas_semana;
        this.Estado = Estado;
        this.Institucion_gestion = Institucion_gestion;
    }

    

    public int getClave() {
        return Clave;
    }

    public void setClave(int Clave) {
        this.Clave = Clave;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFuncion_encomendada() {
        return Funcion_encomendada;
    }

    public void setFuncion_encomendada(String Funcion_encomendada) {
        this.Funcion_encomendada = Funcion_encomendada;
    }

    public int getNo_horas_semana() {
        return No_horas_semana;
    }

    public void setNo_horas_semana(int No_horas_semana) {
        this.No_horas_semana = No_horas_semana;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getInstitucion_gestion() {
        return Institucion_gestion;
    }

    public void setInstitucion_gestion(String Institucion_gestion) {
        this.Institucion_gestion = Institucion_gestion;
    }

    public LocalDate getFecha_inicio() {
        return Fecha_inicio;
    }

    public void setFecha_inicio(LocalDate Fecha_inicio) {
        this.Fecha_inicio = Fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return Fecha_fin;
    }

    public void setFecha_fin(LocalDate Fecha_fin) {
        this.Fecha_fin = Fecha_fin;
    }
    
   
    
}
