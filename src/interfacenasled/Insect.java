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
public class Insect {
    
}

class Butterfly extends Insect implements Eatable,Flyable{

    @Override
    public void eat() {
        System.out.println("Butterfly is eating");
    }

    @Override
    public void fly() {
        System.out.println("Butterfly is flying");
    }
    
    
}
