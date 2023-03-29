/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_extends;

/**
 *
 * @author invitado
 */

//CLASE DERIVADA extends CLASE BASE
//CALSE HIJO extends CLASE PADRE
//SUBCLASE extends SUPERCLASE

public class ESTUDIANTE extends PERSONA {
    public String nControl;
    
    
    
    public String getnControl() {
        return nControl;
    }

    public void setnControl(String nControl) {
        this.nControl = nControl;
    }
    
    
}
