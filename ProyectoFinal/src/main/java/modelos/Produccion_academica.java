/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author anton
 */
public class Produccion_academica {
    private int Id_produccion;
    private String Titulo;
    private String Link_detalles;
    private int Anio_publicado;
    private int No_citas_producto;
    private String Tipo_produccion;
    private String Es_CA;
    private int Miembros_CA;
    private int No_ind_LGAC;
    private int No_CA_LGAC;

    public Produccion_academica(int Id_produccion, String Titulo, String Link_detalles, int Anio_publicado, int No_citas_producto, String Tipo_produccion, String Es_CA, int Miembros_CA, int No_ind_LGAC, int No_CA_LGAC) {
        this.Id_produccion = Id_produccion;
        this.Titulo = Titulo;
        this.Link_detalles = Link_detalles;
        this.Anio_publicado = Anio_publicado;
        this.No_citas_producto = No_citas_producto;
        this.Tipo_produccion = Tipo_produccion;
        this.Es_CA = Es_CA;
        this.Miembros_CA = Miembros_CA;
        this.No_ind_LGAC = No_ind_LGAC;
        this.No_CA_LGAC = No_CA_LGAC;
    }

    

    public int getId_produccion() {
        return Id_produccion;
    }

    public void setId_produccion(int Id_produccion) {
        this.Id_produccion = Id_produccion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getLink_detalles() {
        return Link_detalles;
    }

    public void setLink_detalles(String Link_detalles) {
        this.Link_detalles = Link_detalles;
    }

    public int getAnio_publicado() {
        return Anio_publicado;
    }

    public void setAnio_publicado(int Anio_publicado) {
        this.Anio_publicado = Anio_publicado;
    }

    public int getNo_citas_producto() {
        return No_citas_producto;
    }

    public void setNo_citas_producto(int No_citas_producto) {
        this.No_citas_producto = No_citas_producto;
    }

    public String getTipo_produccion() {
        return Tipo_produccion;
    }

    public void setTipo_produccion(String Tipo_produccion) {
        this.Tipo_produccion = Tipo_produccion;
    }

    public String getEs_CA() {
        return Es_CA;
    }

    public void setEs_CA(String Es_CA) {
        this.Es_CA = Es_CA;
    }

    public int getNo_ind_LGAC() {
        return No_ind_LGAC;
    }

    public void setNo_ind_LGAC(int No_ind_LGAC) {
        this.No_ind_LGAC = No_ind_LGAC;
    }

    public int getNo_CA_LGAC() {
        return No_CA_LGAC;
    }

    public void setNo_CA_LGAC(int No_CA_LGAC) {
        this.No_CA_LGAC = No_CA_LGAC;
    }

    public int getMiembros_CA() {
        return Miembros_CA;
    }

    public void setMiembros_CA(int Miembros_CA) {
        this.Miembros_CA = Miembros_CA;
    }
    
    
    @Override
    public String toString() {
        return "Produccion_academica{" +
                "Id_produccion=" + Id_produccion +
                ", Titulo='" + Titulo + '\'' +
                ", Link_detalles='" + Link_detalles + '\'' +
                ", Anio_publicado=" + Anio_publicado +
                ", No_citas_producto=" + No_citas_producto +
                ", Tipo_produccion='" + Tipo_produccion + '\'' +
                ", Es_CA='" + Es_CA + '\'' +
                ", Miembros_CA=" + Miembros_CA +
                ", No_ind_LGAC=" + No_ind_LGAC +
                ", No_CA_LGAC=" + No_CA_LGAC +
                '}';
    }

    
}
