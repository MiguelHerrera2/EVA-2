/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_1_uml;

import eva2_1_uml.MisClases.AUTOMOVIL;
import eva2_1_uml.MisClases.PERSONA;
import eva2_1_uml.MisClases.TELEVISION;

/**
 *
 * @author invitado
 */
public class EVA2_1_UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PERSONA imprPer = new PERSONA();
        TELEVISION imprTV = new TELEVISION();
        AUTOMOVIL imprAuto = new AUTOMOVIL();
        
        imprPer.imprimirDatos();
        imprTV.imprimirDatos();
        imprAuto.imprimirDatos();
        
    }
    
}
