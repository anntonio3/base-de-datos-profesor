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
public class Proyectos_investigacion {
    private int Clave;
    private String Titulo_proyecto;
    private LocalDate Fecha_inicio;
    private LocalDate Fecha_fin;
    private String Rol;
    private String Descripcion_proyecto;
    private String Tipo_patrocinado;
    private String Es_CA;
    private int No_ind_CA;

    public Proyectos_investigacion(int Clave, String Titulo_proyecto, LocalDate Fecha_inicio, LocalDate Fecha_fin, String Rol, String Descripcion_proyecto, String Tipo_patrocinado, String Es_CA, int No_ind_CA) {
        this.Clave = Clave;
        this.Titulo_proyecto = Titulo_proyecto;
        this.Fecha_inicio = Fecha_inicio;
        this.Fecha_fin = Fecha_fin;
        this.Rol = Rol;
        this.Descripcion_proyecto = Descripcion_proyecto;
        this.Tipo_patrocinado = Tipo_patrocinado;
        this.Es_CA = Es_CA;
        this.No_ind_CA = No_ind_CA;
    }

    

    public int getClave() {
        return Clave;
    }

    public void setClave(int Clave) {
        this.Clave = Clave;
    }

    public String getTitulo_proyecto() {
        return Titulo_proyecto;
    }

    public void setTitulo_proyecto(String Titulo_proyecto) {
        this.Titulo_proyecto = Titulo_proyecto;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getDescripcion_proyecto() {
        return Descripcion_proyecto;
    }

    public void setDescripcion_proyecto(String Descripcion_proyecto) {
        this.Descripcion_proyecto = Descripcion_proyecto;
    }

    public String getTipo_patrocinado() {
        return Tipo_patrocinado;
    }

    public void setTipo_patrocinado(String Tipo_patrocinado) {
        this.Tipo_patrocinado = Tipo_patrocinado;
    }

    public String getEs_CA() {
        return Es_CA;
    }

    public void setEs_CA(String Es_CA) {
        this.Es_CA = Es_CA;
    }

    public int getNo_ind_CA() {
        return No_ind_CA;
    }

    public void setNo_ind_CA(int No_ind_CA) {
        this.No_ind_CA = No_ind_CA;
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
