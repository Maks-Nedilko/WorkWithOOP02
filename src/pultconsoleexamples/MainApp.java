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
public class MainApp {
    
    public static void main(String[] args) {
        
        EventHandler handler1 =new ButtonPushHandler1();
        EventHandler handler2 = new ButtonPushHandler2();
        
        Button button1 = new Button(handler1);
        Button button2 = new Button(handler2);
        
        button1.click();
        button1.click();
        button2.click();
        
        new Button(new EventHandler() {
            int a = 7;
            int b=19;
            
            
            @Override
            public void handle() {
                int c = a + b;
                System.out.println("anonymous inner class");
            }
        }).click();
        
        Button tvbutton = new Button(new EventHandler() {
             boolean a = false;
            @Override
           
            public void handle() {
                if(a){
                    a = false;
                    System.out.println("Vkl");
                }
                else{
                    a=true;
                    System.out.println("vk");
                }
                
            }
        });
        tvbutton.click();
        tvbutton.click();
        tvbutton.click();
    }
    
}
