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
public class ExampleOfInner {
    
    int a=90;
    long b=34;
    
    void m(){
        
        final double d = 45.6;
        
        class MyInner{
            String s1;
            String s2;
            
            void f(){
                a++;
                b--;
                
                System.out.println(d);
                System.out.println("Hello from f() in MyInner class");
            
        }
            
        
    }
        
        MyInner myInner = new MyInner();
        myInner.f();
        
        
    
}
    public static void main(String[] args) {
        new ExampleOfInner().m();
    }
}
