// Operations on bits - Update bits

import java.util.Scanner;

public class Java141 {
    public static int clearbit(int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int setbit(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int updatebit(int n, int i, int newBit){
        if(newBit == 0){
            return clearbit(n, i);
        } else {
            return setbit(n, i);
        }


        // n = clearbit(n, i);
        // int bitMask = newBit << i;
        // return n | bitMask;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the number");
        int n = sc.nextInt();

        System.err.println("Enter value of i");
        int i = sc.nextInt();

        System.err.println("Enter value of newBit... either 1 or 0");
        int newBit = sc.nextInt();

        System.err.println(updatebit(n, i, newBit));

        // n = 10,  i = 1, newBit = 1, ans = 10
        // n = 10,  i = 1, newBit = 0, ans = 8
    }
}
