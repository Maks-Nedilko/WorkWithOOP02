/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractno;

/**
 *
 * @author makst
 */
public class Moto extends TwoWeels{
    
    public Moto(){
        super("Moto");
    }

    @Override
    public void go() {
        System.out.println("Moto go ");   
    }

    @Override
    public void stop() {
        System.out.println("Moto not go"); 
    }
    
}
