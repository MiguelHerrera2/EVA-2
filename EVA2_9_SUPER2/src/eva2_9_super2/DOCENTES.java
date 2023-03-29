/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_9_super2;

/**
 *
 * @author invitado
 */
public class DOCENTES extends PERSONA {
    private String plaza;

    public DOCENTES() {
        super();
    }

    public DOCENTES(String nombre, String apellido, int edad, String plaza) {
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }
    
    
    
    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("N° Plaza: " + plaza);
    }
    
}
