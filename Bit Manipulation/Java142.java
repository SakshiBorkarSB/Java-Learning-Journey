// Operations on bits - Clear last i bits

import java.util.Scanner;

public class Java142 {
    public static int clearlastbits(int n, int i){
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the number");
        int n = sc.nextInt();

        System.err.println("Enter value of i");
        int i = sc.nextInt();

        System.err.println(clearlastbits(n, i));

        // n = 15, i = 2, ans = 12
    }
}
