// CHECK IF A NUMBER IS PRIME OR NOT

import java.util.*;
public class Java51{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        if (n == 2){
            System.out.println("n is prime");
        }
        else{
            boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++){
            if(n % i == 0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("n is Prime");
        }
        else{
            System.out.println("n is not Prime");
        }
        }      
    }
}
