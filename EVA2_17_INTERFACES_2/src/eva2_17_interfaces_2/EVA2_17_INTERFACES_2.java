/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_17_interfaces_2;

/**
 *
 * @author invitado
 */
public class EVA2_17_INTERFACES_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
interface IntA{
    void A(); //Es equivalente a public abstract void A();
}

interface IntB{
    public abstract void B(); //Es equivalente a void A();
}

interface IntC extends IntA, IntB{
    public abstract void C();
}



class Prueba implements IntC{

    @Override
    public void A() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void B() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void C() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
