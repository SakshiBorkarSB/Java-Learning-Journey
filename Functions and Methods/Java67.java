// FUNCTION OVERLOADING (NUMBER OF PARAMETERS)

import java.util.*;
public class Java67{
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("a + b = " + sum(a, b));
        System.out.println("a + b + c = " + sum(a, b, c));
    }
}
