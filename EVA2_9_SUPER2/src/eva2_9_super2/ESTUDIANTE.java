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

//CLASE DERIVADA extends CLASE BASE
//CALSE HIJO extends CLASE PADRE
//SUBCLASE extends SUPERCLASE

public class ESTUDIANTE extends PERSONA {
    public String nControl;

    public ESTUDIANTE() { //Constructor default
        super();//invocar el constructor de la super clase, en este caso la super clase es persona
        this.nControl = "-----";
    }

    public ESTUDIANTE(String nombre, String apellido, int edad, String nControl) {
        super(nombre, apellido, edad);
        this.nControl = nControl;
    }
    
   
    
    public String getnControl() {
        return nControl;
    }

    public void setnControl(String nControl) {
        this.nControl = nControl;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("N° Control: " + nControl);
    }
    
    
}
