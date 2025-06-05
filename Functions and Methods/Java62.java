// SUM OF TWO NUMBERS USING FUNCTIONS WITH PARAMETERS

import java.util.*;
public class Java62{
    public static int Sum(int num1 , int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = Sum(a, b);
        System.out.println("Sum is: " + sum);
    }
}
