// CHECK IF A NUMBER IS PRIME OR NOT

import java.util.*;
public class Java52{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number n");
        int n = sc.nextInt();

        if(n ==2 ){
            System.out.println("n is a PRIME number");
        }
        else{
            for(int i = 2 ; i <= Math.sqrt(n) ; i++){
                if(n % i == 0){
                    System.out.println("n is NOT PRIME number");
                }
                else{
                    System.out.println("n is a PRIME number");
                }
            }
        }
    }
}
