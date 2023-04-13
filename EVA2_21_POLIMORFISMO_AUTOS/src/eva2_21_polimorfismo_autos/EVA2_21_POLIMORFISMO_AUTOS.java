/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_21_polimorfismo_autos;

/**
 *
 * @author invitado
 */
public class EVA2_21_POLIMORFISMO_AUTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        automovil auto1 = new automovil("Chrysler", "Pt Cruiser GT", 2002, 120);
        auto1.tablero();
        auto1.cambiarVelocidad(100);
        auto1.tablero();
        Bicicleta bici = new Bicicleta("Montaña", "Apache", 0);
        bici.tablero();
        bici.cambiarVelocidad(10);
        bici.tablero();
    }
    
}

class Vehiculo{
    private String Marca;
    protected int velocidad;

    public Vehiculo() {
        this.Marca = "----";
        this.velocidad = 0;
        
    }

    public Vehiculo(String Marca, int velocidad) {
        this.Marca = Marca;
        this.velocidad = velocidad;
    }

    
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
}

interface controlarDatos{
    void cambiarVelocidad(int cambio);
    public abstract void tablero();
}

class automovil extends Vehiculo implements controlarDatos{
    private String modelo;
    private int año;

    public automovil() {
        super();
        this.modelo = "----";
        this.año = 0;
        
    }

    public automovil(String Marca, String modelo, int año, int velocidad) {
        super(Marca, velocidad);
        this.modelo = modelo;
        this.año = año;
    }

    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void cambiarVelocidad(int cambio) {
        int vel = velocidad + cambio;
        if(vel >= 0){
            velocidad = vel;
        }
    }

    @Override
    public void tablero() {
        System.out.println("Automovil: " + modelo);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Revoluciones: (PENDIENTE)");
        System.out.println("Combustible: (PENDIENTE)");
    }
    
    
}

class Bicicleta extends Vehiculo implements controlarDatos{
    private String tipo;

    public Bicicleta() {
        super();
        this.tipo = "---";
    }

    public Bicicleta(String tipo, String Marca, int velocidad) {
        super(Marca, velocidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void cambiarVelocidad(int cambio) {
        int vel = velocidad + cambio;
        if(vel >= 0){
            velocidad = vel;
        }
    }

    @Override
    public void tablero() {
        System.out.println("Bicicleta: ");
        System.out.println("Velocidad: " + velocidad);

        
    }
    
    
    
}
