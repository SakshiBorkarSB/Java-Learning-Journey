// Check if the number is odd or even

import java.util.Scanner;

public class Java137 {
    public static void OddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            // even number
            System.err.println("Even Number");
        } else {
            System.err.println("Odd Number");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the number");
        int n = sc.nextInt();

        OddOrEven(n);
    }
}
