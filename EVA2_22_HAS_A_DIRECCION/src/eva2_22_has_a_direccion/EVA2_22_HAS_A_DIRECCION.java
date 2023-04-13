/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_22_has_a_direccion;

/**
 *
 * @author invitado
 */
public class EVA2_22_HAS_A_DIRECCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PERSONA persona = new PERSONA();
        persona.setNombre("Juanito");
        persona.setApellido("Perez");
        persona.setEdad(23);
       /* DIRECCION direccion = new DIRECCION();
        direccion.setCalle("AV. Industrias");
        direccion.setNumero(11101);
        direccion.setColonia("Complejo Industrial");
        direccion.setCp("31305");
        direccion.setCiudad("Chihuahua");
        direccion.setEstado("Chihuahua");
        
        persona.setDireccion(direccion);*/
        persona.imprimirDatos();
    }
    
}
class DIRECCION{
    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String estado;
    private String ciudad;

    public DIRECCION() {
        this.calle = "----";
        this.numero = 0000;
        this.colonia = "----";
        this.cp = "0000";
        this.estado = "-----";
        this.ciudad = "-----";
    }

    public DIRECCION(String calle, int numero, String colonia, String cp, String estado, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.estado = estado;
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public void imprimirDatos(){
        System.out.println("Direccion: ");
        System.out.println(calle + ", " + numero + ", " + colonia + ", " + cp + ", " + ciudad + ", " + estado + ", ");
    }
    
}

class PERSONA{
    private String nombre;
    private String apellido;
    private int edad;
    private DIRECCION direccion; //PERSONA has-a (tiene-una) DIRECCION

    public PERSONA() {
        this.nombre = "----";
        this.apellido = "----";
        this.edad = 0;
        this.direccion = null;//null para cuando la variable no esta en uso
    }

    public PERSONA(String nombre, String apellido, int edad, DIRECCION direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public DIRECCION getDireccion() {
        return direccion;
    }

    public void setDireccion(DIRECCION direccion) {
        this.direccion = direccion;
    }
    
    public void imprimirDatos(){
        System.out.println("Persona: ");
        System.out.println(nombre + " " + apellido + " " + edad + " años");
        if(direccion == null){
            System.out.println("No cuenta con direccion registrada");
        }else {
        direccion.imprimirDatos();
        }
    }
    
    
}