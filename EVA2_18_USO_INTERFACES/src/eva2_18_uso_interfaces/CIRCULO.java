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
public class CIRCULO implements FIGURAS, mostrarDatos{
    private double Radio;

    
    public CIRCULO() {
    }
    public CIRCULO(double Radio) {
        this.Radio = Radio;
    }
    

    public double getRadio() {
        return Radio;
    }
    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    
    //LA INTERFAZ ES COMO UN CONTRATO TE OBLIGA A SEGUIR CIERTO COMPORTAMIENTO
    
    
    @Override
    public double calcularArea() {
      return Math.PI * Math.pow(Radio, 2);  
    
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * (Radio * 2);
    
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Radio: " + Radio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    
    }
    
    
}
