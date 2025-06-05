// Find product of the given two numbers using function... a = 3, b = 5

public class Java64{
    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String args[]){
        int a = 3;
        int b = 5;
        int multi = multiply(a,b);
        System.out.println("3 * 5 = " + multi);

        multi = multiply(10,20);
        System.out.println("10 * 20 = " + multi);
    }
}
