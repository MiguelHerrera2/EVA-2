/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_1_uml.MisClases;

/**
 *
 * @author invitado
 */
public class TELEVISION {
    private int canales = 5;
    private int volumen = 56;
    private boolean power = true;

    public void imprimirDatos(){
        System.out.println("Canal: " + canales);
        System.out.println("Volumen: " + volumen);
        System.out.println("Power: " + power);
    }
    
    public int getCanales() {
        return canales;
    }

    public void setCanales(int canales) {
        this.canales = canales;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }
    
    
}
