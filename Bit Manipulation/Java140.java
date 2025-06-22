// Operations on bits - clear

import java.util.Scanner;

public class Java140 {
    public static int clearbit(int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the number");
        int n = sc.nextInt();

        System.err.println("Enter value of i");
        int i = sc.nextInt();

        System.err.println(clearbit(n, i));

        // n = 10, i = 1, ans = 8
    }
}
