// Write a program that reads a set of integers, and then prints the sum of the even and odd integers

import java.util.*;
public class Java53{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.println("Enter the number");
            number = sc.nextInt();

            if(number % 2 == 0){
                evenSum += number;
            }
            else{
                oddSum += number;
            }

            System.out.println("Do you want to continue? Press 1 for YES and 0 for NO");
            choice = sc.nextInt();

        } while(choice == 1);

        System.out.println("Sum of Even numbers: " + evenSum);
        System.out.println("Sum of Odd numbers: " + oddSum);
    }
}
