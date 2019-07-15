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
public class MouseUSB implements Mouse{

    @Override
    public void click() {
        System.out.println("USB click");
    }

    @Override
    public void dbclick() {
        System.out.println("USB dbclicl");
    }
    
}

class KeyboardUSB implements Keyboard{

    @Override
    public void print(String s) {
        System.out.println("USB print" + s);
    }
    
    
    
}

class USBFactory implements AbstractFactory{

    @Override
    public Mouse getMouse() {
     return new MouseUSB(); 
    }

    @Override
    public Keyboard getKeyboard() {
       return new KeyboardUSB();
    }    
    
    
    
}

class Factory {
    
    public static AbstractFactory getFactory(String s){
        
        if(s.equals("USB")){
            return new USBFactory();
        }
        
        throw new IllegalArgumentException("This Factory is not realized yet");
    }
    
}

class MainApp{
    
    public static void main(String[] args) {
        AbstractFactory factory = Factory.getFactory("USB");
        factory.getMouse().dbclick();
        factory.getKeyboard().print(" Hello abstract factory");
    }
    
}
