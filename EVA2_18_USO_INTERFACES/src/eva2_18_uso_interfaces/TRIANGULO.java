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
public class TRIANGULO implements FIGURAS, mostrarDatos{
    private double base;
    private double altura;

    public TRIANGULO() {
    }
    public TRIANGULO(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        double hip = Math.sqrt(Math.pow(base,2)+ Math.pow(altura,2));
        return base + altura + (hip);
    }

    
    
    @Override
    public void imprimirDatos() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
    
    
    
    
}
