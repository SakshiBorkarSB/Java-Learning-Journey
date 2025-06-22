// Operations on bits - Power of 2 

import java.util.Scanner;

public class Java144 {
    public static boolean powerof2(int n){
        return (n & (n - 1)) == 0;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the number");
        int n = sc.nextInt();

        System.err.println(powerof2(n));

        // n = 4, ans = true
        // n = 5, ans = false
    }
}
