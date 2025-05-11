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
public class Datos_academicos {
    private int Cedula;
    private String Institucion_estudio;
    private String Grado_estudio;
    private String Pais;
    private LocalDate Fecha_inicio_estudios;
    private LocalDate Fecha_fin_estudios;
    private LocalDate Fecha_obtencion_titulo;
    private String Dedica_area;
    private String Dedica_disiplina;
    private String Distinciones_academicas;

    public Datos_academicos(int Cedula, String Institucion_estudio, String Pais, String Grado_estudio, LocalDate Fecha_inicio_estudios, LocalDate Fecha_fin_estudios, LocalDate Fecha_obtencion_titulo, String Dedica_area, String Dedica_disiplina, String Distinciones_academicas) {
        this.Cedula = Cedula;
        this.Institucion_estudio = Institucion_estudio;
        this.Grado_estudio = Grado_estudio;
        this.Pais = Pais;
        this.Fecha_inicio_estudios = Fecha_inicio_estudios;
        this.Fecha_fin_estudios = Fecha_fin_estudios;
        this.Fecha_obtencion_titulo = Fecha_obtencion_titulo;
        this.Dedica_area = Dedica_area;
        this.Dedica_disiplina = Dedica_disiplina;
        this.Distinciones_academicas = Distinciones_academicas;
    }

    public Datos_academicos(){
        
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getInstitucion_estudio() {
        return Institucion_estudio;
    }

    public void setInstitucion_estudio(String Institucion_estudio) {
        this.Institucion_estudio = Institucion_estudio;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getGrado_estudio() {
        return Grado_estudio;
    }

    public void setGrado_estudio(String Grado_estudio) {
        this.Grado_estudio = Grado_estudio;
    }

    public String getDedica_area() {
        return Dedica_area;
    }

    public void setDedica_area(String Dedica_area) {
        this.Dedica_area = Dedica_area;
    }

    public String getDedica_disiplina() {
        return Dedica_disiplina;
    }

    public void setDedica_disiplina(String Dedica_disiplina) {
        this.Dedica_disiplina = Dedica_disiplina;
    }

    public String getDistinciones_academicas() {
        return Distinciones_academicas;
    }

    public void setDistinciones_academicas(String Distinciones_academicas) {
        this.Distinciones_academicas = Distinciones_academicas;
    }

    public LocalDate getFecha_inicio_estudios() {
        return Fecha_inicio_estudios;
    }

    public void setFecha_inicio_estudios(LocalDate Fecha_inicio_estudios) {
        this.Fecha_inicio_estudios = Fecha_inicio_estudios;
    }

    public LocalDate getFecha_fin_estudios() {
        return Fecha_fin_estudios;
    }

    public void setFecha_fin_estudios(LocalDate Fecha_fin_estudios) {
        this.Fecha_fin_estudios = Fecha_fin_estudios;
    }

    public LocalDate getFecha_obtencion_titulo() {
        return Fecha_obtencion_titulo;
    }

    public void setFecha_obtencion_titulo(LocalDate Fecha_obtencion_titulo) {
        this.Fecha_obtencion_titulo = Fecha_obtencion_titulo;
    }
    
    @Override
    public String toString() {
        return "Datos_academicos{" +
                "Cedula=" + Cedula +
                ", Institucion_estudio='" + Institucion_estudio + '\'' +
                ", Pais='" + Pais + '\'' +
                ", Grado_estudio='" + Grado_estudio + '\'' +
                ", Fecha_inicio_estudios=" + Fecha_inicio_estudios +
                ", Fecha_fin_estudios=" + Fecha_fin_estudios +
                ", Fecha_obtencion_titulo=" + Fecha_obtencion_titulo +
                ", Dedica_area='" + Dedica_area + '\'' +
                ", Dedica_disiplina='" + Dedica_disiplina + '\'' +
                ", Distinciones_academicas='" + Distinciones_academicas + '\'' +
                '}';
    }

    
    
}
