// Multi Level Inheritance

public class Java158 {
    public static void main(String args[]){
        Dog Tan = new Dog();
        Tan.eat();
        Tan.legs = 4;
        System.out.println(Tan.legs);
    }
}

class Animals{
    String Color;

    void eat(){
        System.out.println("Eating...");
    }
}

class Mammal extends Animals{
    int legs;
}

class Dog extends Mammal {
    String breed;
}
