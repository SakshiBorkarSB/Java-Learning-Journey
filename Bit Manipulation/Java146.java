// Operations on bits - Fast Exponentiation

import java.util.Scanner;

public class Java146 {
    public static int fastexpo(int a, int n){
        int ans = 1;
        while (n > 0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter value of a");
        int a = sc.nextInt();

        System.err.println("Enter the power n");
        int n = sc.nextInt();

        System.err.println(fastexpo(a, n));

        // a = 3, n = 5
    }
}
