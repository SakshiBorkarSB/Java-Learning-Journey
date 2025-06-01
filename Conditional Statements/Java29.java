// TERNARY OPERATOR 

import java.util.*;
public class Java29{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int var = (a > b) ? a : b;
        System.out.println(var + " is the largest number");

        System.out.println("Enter the number");
        int num = sc.nextInt();

        String type = (num % 2 == 0) ? "EVEN" : "ODD" ;
        System.out.println(num + " is an " + type + " number");
    }
}
