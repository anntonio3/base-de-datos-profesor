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
public class Tutoria_Asesoria {
    private int Id_tutoria;
    private String Tipo_tutoria;
    private String Nivel;
    private String Programa_educativo;
    private String Estudiante_nom_pila;
    private String Estudiante_apellido_pat;
    private String Estudiante_apellido_mat;
    private LocalDate Fecha_inicio;
    private LocalDate Fecha_fin;
    private int Tiempo_minutos;
    private String Tipo_guia;
    private String Estado;
    private String Profesor_CURP;

    public Tutoria_Asesoria(int Id_tutoria, String Tipo_tutoria, String Nivel, String Programa_educativo, String Estudiante_nom_pila, String Estudiante_apellido_pat, String Estudiante_apellido_mat, LocalDate Fecha_inicio, LocalDate Fecha_fin, int Tiempo_minutos, String Tipo_guia, String Estado, String Profesor_CURP) {
        this.Id_tutoria = Id_tutoria;
        this.Tipo_tutoria = Tipo_tutoria;
        this.Nivel = Nivel;
        this.Programa_educativo = Programa_educativo;
        this.Estudiante_nom_pila = Estudiante_nom_pila;
        this.Estudiante_apellido_pat = Estudiante_apellido_pat;
        this.Estudiante_apellido_mat = Estudiante_apellido_mat;
        this.Fecha_inicio = Fecha_inicio;
        this.Fecha_fin = Fecha_fin;
        this.Tiempo_minutos = Tiempo_minutos;
        this.Tipo_guia = Tipo_guia;
        this.Estado = Estado;
        this.Profesor_CURP = Profesor_CURP;
    }

    

    public int getId_tutoria() {
        return Id_tutoria;
    }

    public void setId_tutoria(int Id_tutoria) {
        this.Id_tutoria = Id_tutoria;
    }

    public String getTipo_tutoria() {
        return Tipo_tutoria;
    }

    public void setTipo_tutoria(String Tipo_tutoria) {
        this.Tipo_tutoria = Tipo_tutoria;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    public String getPrograma_educativo() {
        return Programa_educativo;
    }

    public void setPrograma_educativo(String Programa_educativo) {
        this.Programa_educativo = Programa_educativo;
    }

    public String getEstudiante_nom_pila() {
        return Estudiante_nom_pila;
    }

    public void setEstudiante_nom_pila(String Estudiante_nom_pila) {
        this.Estudiante_nom_pila = Estudiante_nom_pila;
    }

    public String getEstudiante_apellido_pat() {
        return Estudiante_apellido_pat;
    }

    public void setEstudiante_apellido_pat(String Estudiante_apellido_pat) {
        this.Estudiante_apellido_pat = Estudiante_apellido_pat;
    }

    public String getEstudiante_apellido_mat() {
        return Estudiante_apellido_mat;
    }

    public void setEstudiante_apellido_mat(String Estudiante_apellido_mat) {
        this.Estudiante_apellido_mat = Estudiante_apellido_mat;
    }

    public int getTiempo_minutos() {
        return Tiempo_minutos;
    }

    public void setTiempo_minutos(int Tiempo_minutos) {
        this.Tiempo_minutos = Tiempo_minutos;
    }

    public String getTipo_guia() {
        return Tipo_guia;
    }

    public void setTipo_guia(String Tipo_guia) {
        this.Tipo_guia = Tipo_guia;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getProfesor_CURP() {
        return Profesor_CURP;
    }

    public void setProfesor_CURP(String Profesor_CURP) {
        this.Profesor_CURP = Profesor_CURP;
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
