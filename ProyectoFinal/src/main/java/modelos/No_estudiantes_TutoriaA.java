/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author anton
 */
public class No_estudiantes_TutoriaA {
    private int Estudiante1;
    private int Estudiante2;
    private int Estudiante3;
    private int Tutoria_Asesoria_Id_tutoria;
    private String Tutoria_Asesoria_Profesor_CURP;

    public No_estudiantes_TutoriaA(int Estudiante1, int Estudiante2, int Estudiante3, int Tutoria_Asesoria_Id_tutoria, String Tutoria_Asesoria_Profesor_CURP) {
        this.Estudiante1 = Estudiante1;
        this.Estudiante2 = Estudiante2;
        this.Estudiante3 = Estudiante3;
        this.Tutoria_Asesoria_Id_tutoria = Tutoria_Asesoria_Id_tutoria;
        this.Tutoria_Asesoria_Profesor_CURP = Tutoria_Asesoria_Profesor_CURP;
    }

    public int getEstudiante1() {
        return Estudiante1;
    }

    public void setEstudiante1(int Estudiante1) {
        this.Estudiante1 = Estudiante1;
    }

    public int getEstudiante2() {
        return Estudiante2;
    }

    public void setEstudiante2(int Estudiante2) {
        this.Estudiante2 = Estudiante2;
    }

    public int getEstudiante3() {
        return Estudiante3;
    }

    public void setEstudiante3(int Estudiante3) {
        this.Estudiante3 = Estudiante3;
    }

    public int getTutoria_Asesoria_Id_tutoria() {
        return Tutoria_Asesoria_Id_tutoria;
    }

    public void setTutoria_Asesoria_Id_tutoria(int Tutoria_Asesoria_Id_tutoria) {
        this.Tutoria_Asesoria_Id_tutoria = Tutoria_Asesoria_Id_tutoria;
    }

    public String getTutoria_Asesoria_Profesor_CURP() {
        return Tutoria_Asesoria_Profesor_CURP;
    }

    public void setTutoria_Asesoria_Profesor_CURP(String Tutoria_Asesoria_Profesor_CURP) {
        this.Tutoria_Asesoria_Profesor_CURP = Tutoria_Asesoria_Profesor_CURP;
    }
    
    
}
