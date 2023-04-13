/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_20_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class EVA2_20_POLIMORFISMO_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   //Circulo circulo = new Circulo(5);
        //circulo.imprimirdatos();

        //FIGURA ES PADRE DE CIRCULO
        //PODEMOS ASIGNAR UN OBJETO CIRCULO A UNA VARIABLE FIGURAS
        /*Figuras figuras = circulo;
        System.out.println("USANDO FIGURAS: ");
        System.out.println("AREA: " + figuras.calcularArea());
        System.out.println("PERIMETRO: " + figuras.calcularPeri());*/

        /*int[] array = new int[10];
        //Arreglo que guarda 10 enteros, donde inicia y termina?
        //Inicia en 0 y termina en 9 (N-1, donde N es la cantidad de elementos en el arreglo)

        array[0] =100;
        System.out.println(array[0]);*/

        System.out.println("Cuantas figuras necesitas?");
        Scanner sc = new Scanner(System.in);
        int cant = sc.nextInt();
        Figuras[] figuras = new Figuras[cant];
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Que tipo de figura necesitas? 1.Circulo  2.Triangulo");
            int input = sc.nextInt();
            if (input==1){ //CIRCULO
                Circulo circulo = new Circulo();
                System.out.println("Introduce el radio: ");
                circulo.setRadio(sc.nextDouble());
                figuras[i] = circulo;
            }else { //TRIANGULO
                Triangulo triangulo = new Triangulo();
                System.out.println("Introduce la base: ");
                triangulo.setBase(sc.nextDouble());
                System.out.println("Introduce la altura: ");
                triangulo.setAltura(sc.nextDouble());
                figuras[i] = triangulo;
            }
        }
        //Imprimir resultados
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] instanceof Circulo) {
                System.out.println("Circulo: " + i);
                //CASTING_ --> CONVERSIÓN
                //EJEMPLO
                //int val = (int)(Math.random() * 100;
                Circulo circu = (Circulo)figuras[i];
                circu.imprimirdatos();
            }else {
                System.out.println("Triangulo: " + i);
                Triangulo trian = (Triangulo)figuras[i];
                trian.imprimirdatos();
           
            }
           
           // System.out.println("Area: " + figuras[i].calcularArea());
           // System.out.println("Perimetro: " + figuras[i].calcularPeri());
          
        }


        /*Circulo[] circulos = new Circulo[cant];
        for (int i = 0;i < circulos.length; i++){
            circulos[i] = new Circulo();
        }
        for (int i = 0; i < circulos.length; i++) {
            System.out.println("Circulo No. " +i);
            circulos[i].imprimirdatos();
        }*/
    }
}