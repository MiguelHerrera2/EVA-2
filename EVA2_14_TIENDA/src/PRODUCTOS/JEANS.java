/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PRODUCTOS;

import SUPERCLASES.ROPA;

/**
 *
 * @author invitado
 */
public abstract class JEANS extends ROPA {
    private String estilo;
    private String material;

    public JEANS() {
    }

    public JEANS(String estilo, String material, char talla, String color, String marca, double precio, String nombre, String unidadVenta) {
        super(talla, color, marca, precio, nombre, unidadVenta);
        this.estilo = estilo;
        this.material = material;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    @Override
    public double precioVenta(int cantidad) {
        
        // antes de cierta cantidad manejamos precio normal
        // despues de cierta cantidad hay un descuento
        
        if (cantidad<= 10) 
            return precio* cantidad;
        else 
            return (precio*0.8)*cantidad;
            
        
    
    
    }
    
    @Override
    public String toString(){
        String cadena = "El precio de venta es: " + precio;
        return cadena;
    }
}
