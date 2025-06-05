// FUNCTION WITH PARAMETERS

// SUM OF TWO NUMBERS

import java.util.*;
public class Java61{
    public static void Sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is: " + sum);    
    }
    public static void main(String args[]){
        Sum();
    }
}
