/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_18_uso_interfaces;

/**
 *
 * @author invitado
 */
public class EVA2_18_USO_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //FIGURAS figu = new FIGURAS();
        //mostrarDatos mostrar = new mostrarDatos();
        TRIANGULO triangulo = new TRIANGULO(21, 29);
        CIRCULO circulo = new CIRCULO();
        
        //triangulo.setBase(21);
        //triangulo.setAltura(29);
        triangulo.imprimirDatos();
        
        circulo.setRadio(35);
        circulo.imprimirDatos();
    }
    
}
