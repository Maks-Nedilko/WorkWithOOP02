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
public class Bycicle extends TwoWeels{
    
    public Bycicle(){
        super("Velos");
    }

    @Override
    public void go() {
        System.out.println("go to bicycle");
    }

    @Override
    public void stop() {
        System.out.println("not do to bycicle");   
    }
    
    
}
