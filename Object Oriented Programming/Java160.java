// Hybrid Inheritance

public class Java160 {
    public static void main(String[] args) {
        Dog Tan = new Dog();
        Tan.eat();
    }    
}

class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Marine extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}

class Dog extends Mammal{
    void bark(){
        System.out.println("barks");
    }
}
