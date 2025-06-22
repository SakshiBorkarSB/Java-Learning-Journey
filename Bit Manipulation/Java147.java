// Operations on bits - Moderate Exponentiation

import java.util.Scanner;

public class Java147 {
    public static int modExpo(int a, int n, int m) {
        int ans = 1;
        a = a % m; // Reduce 'a' initially in case it's greater than 'm'
        // Ensures a is within the range of m from the start.
    
        while (n > 0) {
            if ((n & 1) != 0) { // If n is odd
                ans = (ans * a) % m;
            }
            a = (a * a) % m; // Square the base and take mod
            n = n >> 1; // Reduce exponent by half
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter value of a");
        int a = sc.nextInt();

        System.err.println("Enter the power n");
        int n = sc.nextInt();

        System.err.println("Enter the mod m");
        int m = sc.nextInt();

        System.err.println(modExpo(a, n, m));

        // a = 2, n = 3, m = 5
    }
}
