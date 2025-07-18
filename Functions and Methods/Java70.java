// Print the prime numbers in the given range

import java.util.*;
public class Java70{
    public static boolean isPrime(int n){

        if(n == 2){
            return true;
        }
        
        for (int i = 2; i <= (n - 1); i++){
            if(n % i == 0){  
                return false;
            }
        }
        return true;
    }

    public static void range(int n){
        for (int i = 2; i <= n; i++){
            if(isPrime(i)){   // true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        range(n);
    }
}
