// Math class in Java

public class Java77{
    public static void main(String args[]){
        int x = 7;
        int y = 13;

        System.out.println("The maximum from" + " and " + y + " is: " + Math.max(x, y));
        System.out.println("The minimum from" + " and " + y + " is: " + Math.min(x, y));

        int squareroot = (int) Math.sqrt(16);
        System.out.println("The square root of 16 is: " + squareroot);

        int power = (int) Math.pow(10, 2);
        System.out.println("10 raised to the power 2 gives: " + power);

        int n = -2;
        System.out.println("The absolute value of -2 is: " + Math.abs(n));
    }
}
