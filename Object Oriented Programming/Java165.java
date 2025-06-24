// Multiple inheritance in Java using interafaces

public class Java165 {
    public static void main(String args[]){
        Bear b = new Bear();
        b.eatGrass();
        b.eatMeat();
    }
}

interface herbivorous{
    void eatGrass();
}

interface carnivorous{
    void eatMeat();
}

class Bear implements herbivorous,carnivorous{
    public void eatGrass(){
        System.out.println("Eating grass");
    }

    public void eatMeat(){
        System.out.println("Eating meat");
    }
}
