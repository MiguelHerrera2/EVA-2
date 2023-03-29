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
public class EVA2_9_SUPER2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ESTUDIANTE estudiante = new ESTUDIANTE("Miguel", "Herrera", 18, "22550318");
        estudiante.imprimirDatos();
        //System.out.println("N° Control: " + estudiante.getnControl());
        
        DOCENTES docente = new DOCENTES("Jesus", "Estrada", 39, "ojsoskjs");
        //DOCENTES docente = new DOCENTES();
        docente.imprimirDatos();
        //System.out.println("N° Plaza: " + docente.getPlaza());
        
        
    }
    
}
