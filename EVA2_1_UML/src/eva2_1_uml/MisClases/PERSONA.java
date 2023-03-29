/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_1_uml.MisClases;

/**
 *
 * @author invitado
 */
public class PERSONA {
    private int id = 0000;
    private String nombre = "Miguel";
    private int edad = 18;
    
    public void imprimirDatos(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id1) {
        id = id1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre1) {
        nombre = nombre1;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad1) {
        edad = edad1;
    }
    
    
}
