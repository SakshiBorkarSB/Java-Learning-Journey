// Write a program to find the factorial of any number entered by the user 

import java.util.*;
public class Java54{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the number");
        int number = sc.nextInt();      // To hold the number

        int factorial = 1;

        for(int i = 1; i <= number; i++){
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
