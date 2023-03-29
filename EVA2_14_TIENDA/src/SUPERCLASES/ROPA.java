/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SUPERCLASES;

/**
 *
 * @author invitado
 */
public abstract class ROPA extends PRODUCTOS{
    private char talla;
    private String color;
    private String marca;

    public ROPA() {
    }

    public ROPA(char talla, String color, String marca, double precio, String nombre, String unidadVenta) {
        super(precio, nombre, unidadVenta);
        this.talla = talla;
        this.color = color;
        this.marca = marca;
    }
    
    

    public char getTalla() {
        return talla;
    }

    public void setTalla(char talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


}
