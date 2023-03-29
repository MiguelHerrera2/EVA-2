/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_16_interfaces;

/**
 *
 * @author invitado
 */
public class Computadora extends Producto implements mostrarDatos { // HEREDAMOS CLASES, IMPLEMENTAMOS INTERFACES
   private String marca; 
   private String procesador; 

    public Computadora() {
    }

    public Computadora(String marca, String procesador, double precio, String nombre) {
        super(precio, nombre);
        this.marca = marca;
        this.procesador = procesador;
    }

    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Nombre: " + getNombre());
        System.out.println("Procesador: " + procesador);
        System.out.println("Precio: $" + getPrecio());
    
    }
   
   
}
