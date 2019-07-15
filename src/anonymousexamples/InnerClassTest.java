/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousexamples;

/**
 *
 * @author makst
 */
public class InnerClassTest {
    
    public static void main(String[] args) {
        
        Outer2 out = new Outer2();
        Outer2 outsecond = new Outer2();
        
        Outer2.Inner2 innerFirst = out.new Inner2();
        
        innerFirst.innerMethod();
        
        System.out.println(out.a);
        System.out.println(outsecond.a);
        
        new Outer2().new Inner2().innerMethod();
        
    }
    
}
