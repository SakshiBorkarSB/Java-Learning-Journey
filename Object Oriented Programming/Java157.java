// Single Level Inheritance

public class Java157 {
    public static void main(String args[]){
        Fish tuna = new Fish();
        tuna.eat();
    }
}

class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathes(){
        System.out.println("breathes");
    }
}

class Fish extends Animal {
    int fins;

    void swim(){
        System.out.println("swims");
    }
}
