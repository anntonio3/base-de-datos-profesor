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
public class Direccion_individualizada {
    private int Id_tesis;
    private String Titulo_tesis;
    private String Grado_tesis;
    private LocalDate Fecha_inicio;
    private LocalDate Fecha_fin;
    private String Estado;
    private String Es_CA;
    private int No_ind_CA;
    private String Institucion_trabajo;
    private String Profesor_CURP;

    public Direccion_individualizada(int Id_tesis, String Titulo_tesis, String Grado_tesis, LocalDate Fecha_inicio, LocalDate Fecha_fin, String Estado, String Es_CA, int No_ind_CA, String Institucion_trabajo, String Profesor_CURP) {
        this.Id_tesis = Id_tesis;
        this.Titulo_tesis = Titulo_tesis;
        this.Grado_tesis = Grado_tesis;
        this.Fecha_inicio = Fecha_inicio;
        this.Fecha_fin = Fecha_fin;
        this.Estado = Estado;
        this.Es_CA = Es_CA;
        this.No_ind_CA = No_ind_CA;
        this.Institucion_trabajo = Institucion_trabajo;
        this.Profesor_CURP = Profesor_CURP;
    }
    
    public Direccion_individualizada(){
        
    }


    public int getId_tesis() {
        return Id_tesis;
    }

    public void setId_tesis(int Id_tesis) {
        this.Id_tesis = Id_tesis;
    }

    public String getTitulo_tesis() {
        return Titulo_tesis;
    }

    public void setTitulo_tesis(String Titulo_tesis) {
        this.Titulo_tesis = Titulo_tesis;
    }

    public String getGrado_tesis() {
        return Grado_tesis;
    }

    public void setGrado_tesis(String Grado_tesis) {
        this.Grado_tesis = Grado_tesis;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
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

    public String getInstitucion_trabajo() {
        return Institucion_trabajo;
    }

    public void setInstitucion_trabajo(String Institucion_trabajo) {
        this.Institucion_trabajo = Institucion_trabajo;
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
