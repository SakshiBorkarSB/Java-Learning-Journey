// Polymorphism - Compile Time (Method Overriding)

public class Java162 {
    public static void main(String args[]){
        Deer d = new Deer();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Deer is eating...");
    }
}
