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
public class AUTOMOVIL {
    private String marca = "Chrysler";
    private String modelo = "Pt Cruiser GT";
    private int año = 2002;

    public void imprimirDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
    
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca1) {
        marca = marca1;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo1) {
        modelo = modelo1;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año1) {
        año = año1;
    }
    
    
}
