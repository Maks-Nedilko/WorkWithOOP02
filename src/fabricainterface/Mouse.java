/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricainterface;

/**
 *
 * @author makst
 */
public interface Mouse {
    
    void click();
    void dbclick();
    
    
}

interface Keyboard{
    
    void print (String s);
    
}

interface AbstractFactory{
    
    Mouse getMouse();
    Keyboard getKeyboard();
    
}
