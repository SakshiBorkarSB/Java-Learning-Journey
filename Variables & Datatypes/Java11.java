// In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.

import java.util.*;
public class Java11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        float a = sc.nextFloat();
        System.out.println("Enter the second number");
        float b = sc.nextFloat();
        System.out.println("Enter the three number");
        float c = sc.nextFloat();

        float average = (a + b + c) / 3;
        System.out.println("The average of three numbers is " + average);
    }
}
