/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_4_formato_apa;

/**
 *
 * @author invitado
 */
public class LIBRO extends DOCUMENTO {
    private String editorial;
    private int nEdicion;

    public LIBRO() {
    }

    
    
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getnEdicion() {
        return nEdicion;
    }

    public void setnEdicion(int nEdicion) {
        this.nEdicion = nEdicion;
    }
    
    
    
}
