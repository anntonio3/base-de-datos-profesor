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
public class Asignaturas {
    private String Nombre_curso;
    private String DES;
    private String Nivel;
    private String Programa_educativo;
    private LocalDate Fecha_inicio_curso;
    private int No_alumnos_inscritos;
    private int No_duracion_semanas;
    private String Profesor_CURP;

    public Asignaturas(String Nombre_curso, String DES, String Nivel, String Programa_educativo, LocalDate Fecha_inicio_curso, int No_alumnos_inscritos, int No_duracion_semanas, String Profesor_CURP) {
        this.Nombre_curso = Nombre_curso;
        this.DES = DES;
        this.Nivel = Nivel;
        this.Programa_educativo = Programa_educativo;
        this.Fecha_inicio_curso = Fecha_inicio_curso;
        this.No_alumnos_inscritos = No_alumnos_inscritos;
        this.No_duracion_semanas = No_duracion_semanas;
        this.Profesor_CURP = Profesor_CURP;
    }

    public Asignaturas(){
        
    }

    public String getNombre_curso() {
        return Nombre_curso;
    }

    public void setNombre_curso(String Nombre_curso) {
        this.Nombre_curso = Nombre_curso;
    }

    public String getDES() {
        return DES;
    }

    public void setDES(String DES) {
        this.DES = DES;
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

    public int getNo_alumnos_inscritos() {
        return No_alumnos_inscritos;
    }

    public void setNo_alumnos_inscritos(int No_alumnos_inscritos) {
        this.No_alumnos_inscritos = No_alumnos_inscritos;
    }

    public int getNo_duracion_semanas() {
        return No_duracion_semanas;
    }

    public void setNo_duracion_semanas(int No_duracion_semanas) {
        this.No_duracion_semanas = No_duracion_semanas;
    }

    public String getProfesor_CURP() {
        return Profesor_CURP;
    }

    public void setProfesor_CURP(String Profesor_CURP) {
        this.Profesor_CURP = Profesor_CURP;
    }

    public LocalDate getFecha_inicio_curso() {
        return Fecha_inicio_curso;
    }

    public void setFecha_inicio_curso(LocalDate Fecha_inicio_curso) {
        this.Fecha_inicio_curso = Fecha_inicio_curso;
    }
    
    @Override
    public String toString() {
        return "Asignaturas{" +
                "Nombre_curso='" + Nombre_curso + '\'' +
                ", DES='" + DES + '\'' +
                ", Nivel='" + Nivel + '\'' +
                ", Programa_educativo='" + Programa_educativo + '\'' +
                ", Fecha_inicio_curso=" + Fecha_inicio_curso +
                ", No_alumnos_inscritos=" + No_alumnos_inscritos +
                ", No_duracion_semanas=" + No_duracion_semanas +
                ", Profesor_CURP='" + Profesor_CURP + '\'' +
                '}';
    }

    
    
}
