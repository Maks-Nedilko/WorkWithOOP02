/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author makst
 */
public class Person {

    public Person(String firstname, StringBuilder secondname, int age) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.age = age;
    }
    
    public Person(){
        
    }
    
    public static void main(String[] args) {
        
        Person p1 = new Person();
        p1.setFirstname("Nastya");
        p1.setSecondname(new StringBuilder("Valoi"));
        p1.setAge(25);
        p1.setColorHair("black");
        
          Person p2 = new Person();
        p2.setFirstname("Kostya");
        p2.setSecondname(new StringBuilder("Valoi"));
        p2.setAge(35);
        p2.setColorHair("white");
        
          Person p3 = new Person();
        p3.setFirstname("Nastya");
        p3.setSecondname(new StringBuilder("Valoi"));
        p3.setAge(25);
        p3.setColorHair("white");
        
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));
        System.out.println("****");
        System.out.println(p1.equals(p3));
        System.out.println(p3.equals(p1));
        
    }

    public String getFirstname() {
        return firstname;
    }

    public StringBuilder getSecondname() {
        return secondname;
    }

    public int getAge() {
        return age;
    }

    public String getColorHair() {
        return colorHair;
    }

    
    private String firstname;
    private StringBuilder secondname;
    private int age;
    private String colorHair;
    
    @Override
    public boolean equals(Object obj){
        
        if(obj==null){
            return false;
        }
        
        if(!(obj instanceof Person)){
            return false;
        }else{
            Person p = (Person)obj;
            
            if(firstname.equals(p.firstname)&& (secondname.toString().equals(p.secondname.toString())) && (age==p.age)){
                return true;
            }else{
                return false;
            }
        }
            
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSecondname(StringBuilder secondname) {
        this.secondname = secondname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColorHair(String colorHair) {
        this.colorHair = colorHair;
    }
    
//    public Person getCopy(){
//        
//        firstname=this.firstname;
//        secondname=this.secondname;
//        age=this.age;
//        
//        return ;
//    }
    
}
