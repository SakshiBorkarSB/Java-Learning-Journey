// Operations on bits - set

import java.util.Scanner;

public class Java139 {
    public static int setbit(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the number");
        int n = sc.nextInt();

        System.err.println("Enter value of i");
        int i = sc.nextInt();

        System.err.println(setbit(n, i));

        // n = 10, i = 2, ans = 14
    }
}
