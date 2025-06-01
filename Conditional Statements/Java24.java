// Print the largest of two numbers

import java.util.*;
public class Java24{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        if(a>=b){
            System.out.println(a + " is the largest number from " + a + " and " + b);
        }
        else{
            System.out.println(b + " is the largest number from " + a + " and " + b);
        }
    }
}
