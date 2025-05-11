/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author anton
 */
public class Profesor {
    private String CURP;
    private int No_trabajador;
    private String Nom_pila;
    private String Apellido_pat;
    private String Apellido_mat;
    private String RFC;
    private int No_IMSS;
    private String Estado_civil;
    private String Email_personal;
    private int Carreras_Id_carrera;
    private int Datos_laborales_No_profesor;
    private int Datos_academicos_Cedula;
    private int CA_Id_CA;

    public Profesor(String CURP, int No_trabajador, String Nom_pila, String Apellido_pat, String Apellido_mat, String RFC, int No_IMSS, String Estado_civil, String Email_personal, int Carreras_Id_carrera, int Datos_laborales_No_profesor, int Datos_academicos_Cedula, int CA_Id_CA) {
        this.CURP = CURP;
        this.No_trabajador = No_trabajador;
        this.Nom_pila = Nom_pila;
        this.Apellido_pat = Apellido_pat;
        this.Apellido_mat = Apellido_mat;
        this.RFC = RFC;
        this.No_IMSS = No_IMSS;
        this.Estado_civil = Estado_civil;
        this.Email_personal = Email_personal;
        this.Carreras_Id_carrera = Carreras_Id_carrera;
        this.Datos_laborales_No_profesor = Datos_laborales_No_profesor;
        this.Datos_academicos_Cedula = Datos_academicos_Cedula;
        this.CA_Id_CA = CA_Id_CA;
    }
    
    public Profesor() {
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public int getNo_trabajador() {
        return No_trabajador;
    }

    public void setNo_trabajador(int No_trabajador) {
        this.No_trabajador = No_trabajador;
    }

    public String getNom_pila() {
        return Nom_pila;
    }

    public void setNom_pila(String Nom_pila) {
        this.Nom_pila = Nom_pila;
    }

    public String getApellido_pat() {
        return Apellido_pat;
    }

    public void setApellido_pat(String Apellido_pat) {
        this.Apellido_pat = Apellido_pat;
    }

    public String getApellido_mat() {
        return Apellido_mat;
    }

    public void setApellido_mat(String Apellido_mat) {
        this.Apellido_mat = Apellido_mat;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public int getNo_IMSS() {
        return No_IMSS;
    }

    public void setNo_IMSS(int No_IMSS) {
        this.No_IMSS = No_IMSS;
    }

    public String getEstado_civil() {
        return Estado_civil;
    }

    public void setEstado_civil(String Estado_civil) {
        this.Estado_civil = Estado_civil;
    }

    public String getEmail_personal() {
        return Email_personal;
    }

    public void setEmail_personal(String Email_personal) {
        this.Email_personal = Email_personal;
    }

    public int getCarreras_Id_carrera() {
        return Carreras_Id_carrera;
    }

    public void setCarreras_Id_carrera(int Carreras_Id_carrera) {
        this.Carreras_Id_carrera = Carreras_Id_carrera;
    }

    public int getDatos_laborales_No_profesor() {
        return Datos_laborales_No_profesor;
    }

    public void setDatos_laborales_No_profesor(int Datos_laborales_No_profesor) {
        this.Datos_laborales_No_profesor = Datos_laborales_No_profesor;
    }

    public int getDatos_academicos_Cedula() {
        return Datos_academicos_Cedula;
    }

    public void setDatos_academicos_Cedula(int Datos_academicos_Cedula) {
        this.Datos_academicos_Cedula = Datos_academicos_Cedula;
    }

    public int getCA_Id_CA() {
        return CA_Id_CA;
    }

    public void setCA_Id_CA(int CA_Id_CA) {
        this.CA_Id_CA = CA_Id_CA;
    }
    
    @Override
public String toString() {
    return "Profesor{" +
            "CURP='" + CURP + '\'' +
            ", No_trabajador=" + No_trabajador +
            ", Nom_pila='" + Nom_pila + '\'' +
            ", Apellido_pat='" + Apellido_pat + '\'' +
            ", Apellido_mat='" + Apellido_mat + '\'' +
            ", RFC='" + RFC + '\'' +
            ", No_IMSS=" + No_IMSS +
            ", Estado_civil='" + Estado_civil + '\'' +
            ", Email_personal='" + Email_personal + '\'' +
            ", Carreras_Id_carrera=" + Carreras_Id_carrera +
            ", Datos_laborales_No_profesor=" + Datos_laborales_No_profesor +
            ", Datos_academicos_Cedula=" + Datos_academicos_Cedula +
            ", Ca_Id_Ca=" + CA_Id_CA +
            '}';
}
    
   
}



