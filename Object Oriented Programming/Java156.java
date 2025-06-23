// Inheritance

public class Java156 {
    public static void main(String args[]){
        Fish tuna = new Fish();
        tuna.eat();
    }
}

// Base Class
class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathes(){
        System.out.println("breathes");
    }
}

// Derived Class
class Fish extends Animal {
    int fins;

    void swim(){
        System.out.println("swims");
    }
}
