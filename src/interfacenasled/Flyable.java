/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacenasled;

/**
 *
 * @author makst
 */
public interface Flyable {
    
    void fly();
    
}

class Airplane implements Flyable{

    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }
}
