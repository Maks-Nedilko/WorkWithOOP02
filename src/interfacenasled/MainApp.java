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
public class MainApp {
    
    public static void main(String[] args) {
        
        Frog frog = new Frog();
        Airplane airplane = new Airplane();
        Butterfly butterfly = new Butterfly();
        Insect insect = new Insect();
        
        Eatable eat;
        Flyable fly;
        
        eat = frog;
        eat = butterfly;
        
        fly = butterfly;
        eat = (Eatable)fly;
        
        eat.eat();
        
        fly = (Flyable)eat;
        fly.fly();
        
        fly = airplane;
        fly.fly();
        
        if(fly instanceof Eatable){
        eat = (Eatable)fly;
    }else{
            System.out.println("Error");
            }
        
        fly = butterfly;
        insect = butterfly;
        insect = (Insect)fly;
        
    }
    
}
