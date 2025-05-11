/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author anton
 */
public class CA {
    private int Id_CA;
    private String Nombre_CA;
    private String LGAC_asociada;

    public CA(int Id_CA, String Nombre_CA, String LGAC_asociada) {
        this.Id_CA = Id_CA;
        this.Nombre_CA = Nombre_CA;
        this.LGAC_asociada = LGAC_asociada; 
    }
    
    public CA(){
        
    }

    public int getId_CA() {
        return Id_CA;
    }

    public void setId_CA(int Id_CA) {
        this.Id_CA = Id_CA;
    }

    public String getNombre_CA() {
        return Nombre_CA;
    }

    public void setNombre_CA(String Nombre_CA) {
        this.Nombre_CA = Nombre_CA;
    }

    public String getLGAC_asociada() {
        return LGAC_asociada;
    }

    public void setLGAC_asociada(String LGAC_asociada) {
        this.LGAC_asociada = LGAC_asociada;
    }
    
    @Override
    public String toString() {
        return "CA{" +
                "Id_CA=" + Id_CA +
                ", Nombre_CA='" + Nombre_CA + '\'' +
                ", LGAC_asociada='" + LGAC_asociada + '\'' +
                '}';
    }
    
    
}
