/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigator;

/**
 *
 * @author makst
 */
public class NavigatorApp {
    
    public static void main(String[] args) {
        
        Navigable nav = new Robot();
        Navigable nav2 = new Avto();
        
        Marshrut marshrut = new Marshrut();
        marshrut.addForward(3.5);
        marshrut.addCommand(Navigable.TURN_LEFT);
        marshrut.addForward(8.8);
        marshrut.addCommand(Navigable.TURN_RIGTH);
        marshrut.addForward(1.0);
        marshrut.addCommand(Navigable.STOP);
        
        Navigator navigator = new Navigator(nav2,marshrut);
        navigator.navigate();
        
        
        
    }
    
}
