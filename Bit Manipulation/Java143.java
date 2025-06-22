// Operations on bits - Clear range of bits

import java.util.Scanner;

public class Java143 {
    public static int clearrangeofbits(int n, int i, int j){
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the number");
        int n = sc.nextInt();

        System.err.println("Enter value of i");
        int i = sc.nextInt();

        System.err.println("Enter value of j");
        int j = sc.nextInt();
        System.err.println(clearrangeofbits(n, i, j));

        // n = 10, i = 2, j = 4,  ans = 2
    }
}
