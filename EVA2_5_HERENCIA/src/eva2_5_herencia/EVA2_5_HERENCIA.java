/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_5_herencia;

/**
 *
 * @author invitado
 */
public class EVA2_5_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        subClase obj = new subClase();
        obj.mensaje();
    }
} 
    class SuperClase{
        public void mensaje(){
            System.out.println("Hola!!");
        }
    }

    class subClase extends SuperClase{

    }
    

    
