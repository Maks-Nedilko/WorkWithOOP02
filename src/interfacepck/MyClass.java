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
public class MyClass implements Seakable,Writable{

    @Override
    public boolean seak(Object obj) {
        System.out.println("seal() ii my class");
        return false;
    }

    @Override
    public void write(Object obj) {
        System.out.println("write() in MyClass");
    }
    
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        Seakable sc = mc;
        Writable wr = mc;
        
        if(mc instanceof SeakoWritable){
           SeakoWritable sw = (SeakoWritable)mc; 
        }else {
            System.out.println("Error");
        }
        
    }
}
