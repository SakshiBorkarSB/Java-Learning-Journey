// Swap two numbers without using any third variable

import java.util.Scanner;

public class Java148 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.err.println("Before swap value of a = " + a + " , b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.err.println("After swap value of a = " + a + " , b = " + b);
    }
}
