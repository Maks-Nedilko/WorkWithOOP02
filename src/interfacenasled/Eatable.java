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
public interface Eatable {
    int age=1;
    
    void eat();
    
}

class Frog implements Eatable{
    
    public void eat(){
        System.out.println("frog eating");
        
    }
}
