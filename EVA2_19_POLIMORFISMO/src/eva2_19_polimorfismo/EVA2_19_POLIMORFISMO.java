/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_polimorfismo;

/**
 *
 * @author Miguel
 */
public class EVA2_19_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante = new Estudiante("Miguel","Herrera",18,"22550318");
        //estudiante.imprimirDatos();
        Docente docente = new Docente("Ruben","Hernandez",42,"Tiempo completo");
        //docente.imprimirDatos();

        //EN RESUMEN ESTO ES POLIMORFISMO
        Persona persona = docente;
        persona.imprimirDatos();
        Persona persona1 = estudiante;
        persona1.imprimirDatos();

        //AHORA AL REVES
        // NO SE PUEDE HACER CONVERSION DE SUPER CLASE A SUBCLASE
        // EN ESTE CASO, NO EXISTE LA PLAZA
        //Docente docente1 = persona;
    }
    
}
