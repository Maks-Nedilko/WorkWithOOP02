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
public class Marshrut {
    
    private double [] commands=new double[1000];
    private int counter=0;
    
    public void addCommand(int i){
        
        commands[counter]=i;
        counter++;
        
    }
    
    public void addForward(double path){
        
        commands[counter]=1;
        counter++;
        commands[counter]=path;
        counter++;
        
    }

    public double[] getCommands() {
        return commands;
    }

    public void setCommands(double[] commands) {
        this.commands = commands;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    
    
}
