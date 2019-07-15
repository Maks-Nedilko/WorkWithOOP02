/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pultconsoleexamples;

/**
 *
 * @author makst
 */
public class Button {
    
    EventHandler handler;

    public Button(EventHandler handler) {
        this.handler = handler;
    }
    
    public void click(){
        handler.handle();
    }
    
}
