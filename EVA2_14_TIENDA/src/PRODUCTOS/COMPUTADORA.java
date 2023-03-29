/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRODUCTOS;

import SUPERCLASES.ELECTRONICA;

/**
 *
 * @author saulp
 */
public final class COMPUTADORA extends ELECTRONICA {
      private int memoria;
      private double tamaPantalla;
      private double discoDuro;
      private String procesador;

    public COMPUTADORA() {
                this.memoria = 0;
        this.tamaPantalla = 0;
        this.discoDuro = 0;
        this.procesador = "";
        
    }

    public COMPUTADORA(int memoria, double tamaPantalla, double discoDuro, String procesador, String fabricante, String modelo, int garantia, double precio, String nombre, String unidadVenta) {
        super(fabricante, modelo, garantia, precio, nombre, unidadVenta);
        this.memoria = memoria;
        this.tamaPantalla = tamaPantalla;
        this.discoDuro = discoDuro;
        this.procesador = procesador;
    }
    

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getTamaPantalla() {
        return tamaPantalla;
    }

    public void setTamaPantalla(double tamaPantalla) {
        this.tamaPantalla = tamaPantalla;
    }

    public double getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(double discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
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

/*
final ---> no se puede hererdar de una clase con final
class Laptop extends COMPUTADORA{
    
}
*/