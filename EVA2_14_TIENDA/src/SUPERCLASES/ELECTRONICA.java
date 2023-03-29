/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SUPERCLASES;

/**
 *
 * @author saulp
 */
public abstract class ELECTRONICA extends PRODUCTOS {
    
    private String fabricante;
    private String modelo;
    private int garantia;

    public ELECTRONICA() {
        super();
         this.fabricante = "";
        this.modelo = "";
        this.garantia = 0;
        
        
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public ELECTRONICA(String fabricante, String modelo, int garantia, double precio, String nombre, String unidadVenta) {
        super(precio, nombre, unidadVenta);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.garantia = garantia;
    }
    
    
    
    
}
