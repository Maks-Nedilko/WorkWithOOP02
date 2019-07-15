package anonymousexamples;

public class Outer {

    int a = 78;
    double d = 3.14;

    static String s = "Hello world";
    
    static void f(){
        
    }
    
    void mm(){
      Inner inner =  new Inner();
      inner.m();
    }
    
    public static void main(String[] args) {
        
        Outer outer = new Outer();
        
        outer.mm();
        
        Outer.Inner inner2=new Outer.Inner();
        inner2.m();
        
    }
    
    static class Inner{
        int pole1=54;
        
        void m(){
            s="Hello JAVA";
            System.out.println(s);
            System.out.println("Hello from nested class");
        f();
        
        }
        
    }

}
