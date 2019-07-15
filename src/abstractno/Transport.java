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
public abstract class Transport {
    
    private String name;
    
    
    public abstract void go();
    public abstract void stop();

    public Transport(String name) {
        this.name = name;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static void main(String[] args) {
       // new Transport();eror
    }
    
}
