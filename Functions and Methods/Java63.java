// CALL BY VALUE IN JAVA

// SWAPPING OF VALUES

public class Java63{
    public static void Swap(int a, int b){
        // swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("temp = " + temp);
    }
    public static void main(String args[]){
        // swap - values exchange
        int a = 5;
        int b = 10;
        Swap(a, b);
    }
}
