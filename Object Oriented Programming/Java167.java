// Super Keyword

public class Java167 {
    public static void main(String args[]){
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;
    Animal(){
        System.out.println("Animal constructor called");
    }
}

class Horse extends Animal {
    Horse(){
        super();   /// Animal constructor will be called i.e., immediate parent class constructor
        // even if we don't write super here, still answer will be the same as it is default

        super.color = "brown";
        System.out.println("Horse constructor called");
    }
}
