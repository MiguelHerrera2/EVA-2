/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_6_herencias_constructores;

/**
 *
 * @author invitado
 */
public class EVA2_6_HERENCIAS_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CLASE ANIMAL");
        ANIMAL animal = new ANIMAL();
        animal.comer();
        animal.respirar();
        
        System.out.println("CLASE MAMIFERO");
        MAMIFERO mamifero = new MAMIFERO();
        mamifero.respirar();
        mamifero.comer();
        mamifero.tenerPelo();
    }
    
}
