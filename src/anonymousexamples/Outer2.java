
package anonymousexamples;

public class Outer2 {
    
    int a=5;
    long l =1567;
    
    void h(){
        System.out.println("h in outer2");
    }
    
    
    class Inner2{
        
        double d = 1.34;
        
        void innerMethod(){
            System.out.println("Hello from non=static inner class");
            a++;
            System.out.println(a);
            h();
        }
        
    }
    
}
