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
public interface Navigable {
    
    void go(double path);
    void stop();
    void turnLeft();
    void turnRight();
    void turnRound();
    
    int FORWARD=1;
    int STOP=2;
    int TURN_LEFT=3;
    int TURN_RIGTH=4;
    int TURN_ROUND=5;
    
}

class Robot implements Navigable{

    @Override
    public void go(double path) {
        System.out.println("Robor go " + path + " km");  
    }

    @Override
    public void stop() {
        System.out.println("Robot stop");  
    }

    @Override
    public void turnLeft() {
        System.out.println("Robot turn left");
    }

    @Override
    public void turnRight() {
        System.out.println("Robot turn right");
    }

    @Override
    public void turnRound() {
        System.out.println("Robot turn round");
    }
    
}

class Avto implements Navigable{
    
       @Override
    public void go(double path) {
        System.out.println("Avto go " + path + " km");  
    }

    @Override
    public void stop() {
        System.out.println("Avto stop");  
    }

    @Override
    public void turnLeft() {
        System.out.println("Avto turn left");
    }

    @Override
    public void turnRight() {
        System.out.println("Avto turn right");
    }

    @Override
    public void turnRound() {
        System.out.println("Avto turn round");
    }
    
}
