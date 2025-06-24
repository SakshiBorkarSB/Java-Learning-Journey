// Abstract Class - Abstract keyword

public class Java163 {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);    

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // Animal a = new Animal();  /// can't create instance(object)

        Mustang m = new Mustang();
        // Animal -> Horse -> Mustang
        /*
            A - Base Class
            B - Child Class

            When we make object of B, constructor of A will be called then constructor of B
         */
    }
}

abstract class Animal{
    String color;

    Animal(){   // Constructor
        color = "purple";
        System.out.println("Animal constructor called...");
    }

    void eat(){
        System.out.println("Eating");
    }

    abstract void walk();   // only idea is given ki walk naam ka function hai... no implementation
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called...");
    }

    void changecolor(){
        color = "brown";
    }

    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called...");
    }
}

class Chicken extends Animal{
    void changecolor(){
        color = "yellow";
    }
    
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
