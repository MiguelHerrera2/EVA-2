/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_herencias;

/**
 *
 * @author invitado
 */
public class ESTUDIANTE {
    private String nombre;
    private String apellido;
    private int edad;
    private String nControl;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getnControl() {
        return nControl;
    }

    public void setnControl(String nControl) {
        this.nControl = nControl;
    }

    public ESTUDIANTE() {
        
    }

    public ESTUDIANTE(String nombre, String apellido, int edad, String nControl) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nControl = nControl;
    }
    
    
}
