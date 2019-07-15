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
public class PersonWithAddress extends Person {
    
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
        
        Address ad1 = new Address();
        ad1.setCountry("Ua");
        ad1.setCity("Ki");
        ad1.setStreet("Met");
        ad1.setHouse(5);
        
        Address ad2 = new Address();
        ad2.setCountry("Ua");
        ad2.setCity("Ki");
        ad2.setStreet("Met");
        ad2.setHouse(5);
        
         Address ad3 = new Address();
        ad3.setCountry("Usa");
        ad3.setCity("Kiev");
        ad3.setStreet("Metal");
        ad3.setHouse(6);
        
        PersonWithAddress pa1 = new PersonWithAddress(p1,ad1);
        PersonWithAddress pa2 = new PersonWithAddress(p3,ad1);
        PersonWithAddress pa3 = new PersonWithAddress(p2,ad1);
        PersonWithAddress pa4 = new PersonWithAddress(p2,ad3);
        
        System.out.println(pa1.equals(pa2));
        System.out.println(pa2.equals(pa4));
        
    }

    Address address;

    PersonWithAddress(Person p, Address address) {
        super(p.getFirstname(), p.getSecondname(), p.getAge());
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof PersonWithAddress)) {
            return false;
        } else {
            PersonWithAddress pa = (PersonWithAddress) obj;
            if (super.equals(pa) && address.equals(pa.address)) {
                return true;
            } else {
                return false;
            }
        }

    }

}
