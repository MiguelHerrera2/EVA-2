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
public class EVA2_16_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //mostrarDatos obj = new mostrarDatos(); no se puede instanciar
        PERSONA obj = new PERSONA("Pepito", 8);
        obj.imprimirDatos();
        Computadora obj2 = new Computadora("Huawei", "Intel I7", 25000, "D15");
        obj2.imprimirDatos();
    }
    
}
