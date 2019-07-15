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
public class MainApp {
    
    public static void main(String[] args) {
        
        TwoWeels tw1 = new Bycicle();
        tw1.go();
        tw1.stop();
        
        tw1 = new Moto();
        tw1.go();
        tw1.stop();
        
        Transport tr = tw1;
        tr.go();
        
    }
    
}
