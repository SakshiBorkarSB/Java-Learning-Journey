// Hierarchial Inheritance

public class Java159 {
    public static void main(String args[]){
        Bird bird = new Bird();
        bird.eat();
        bird.fly();
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("Eating...");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walking...");
    }
}

class Marine extends Animal{
    void swim(){
        System.out.println("Swimming...");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Flying...");
    }
}
