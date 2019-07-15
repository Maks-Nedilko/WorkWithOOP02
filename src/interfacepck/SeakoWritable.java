/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepck;

/**
 *
 * @author makst
 */
public interface SeakoWritable extends Seakable,Writable{
    
    
}

class PPP implements SeakoWritable{

    @Override
    public boolean seak(Object obj) {
        System.out.println("!!!!!!!");
        return true;
    }

    @Override
    public void write(Object obj) {
        System.out.println(obj);
    }
    
    public static void main(String[] args) {
        
        PPP ppp = new PPP();
        
        SeakoWritable sw = ppp;
        Seakable sb = ppp;
        Writable wr = ppp;
        
        sw = (SeakoWritable)sb;
        
        
    }
    
}
