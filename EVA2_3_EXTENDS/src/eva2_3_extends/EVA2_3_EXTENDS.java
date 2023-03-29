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
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ESTUDIANTE obj = new ESTUDIANTE();
        obj.setNombre("Miguel");
        obj.setApellido("Herrera");
        obj.setEdad(18);
        obj.setnControl("12345566");
        
        System.out.println("Datos estudiante: " );
        System.out.println(obj.getNombre());
        System.out.println(obj.getApellido());
        System.out.println(obj.getEdad());
        System.out.println(obj.getnControl());
        
        DOCENTES profe = new DOCENTES();
        profe.setNombre("LUIS");
        profe.setApellido("Herrera");
        profe.setEdad(39);
        profe.setPlaza("HBDDAS");
        
        System.out.println("Datos docente: " );
        System.out.println(profe.getNombre());
        System.out.println(profe.getApellido());
        System.out.println(profe.getEdad());
        System.out.println(profe.getPlaza());
        
    }
    
}
