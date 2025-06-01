// CALCULATOR USING SWITCH CASES

import java.util.*;
public class Java32{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter two numbers");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.println("Enter the operator");
        char operator = sc.next().charAt(0);  //for single character

        switch(operator){
            case '+':
                System.out.println("Addition: " + (a+b));
                break;
            case '-':
                System.out.println("Subtraction: " + (a-b));
                break;
            case '*':
                System.out.println("Multiplication: " + (a*b));
                break;
            case '/':
                System.out.println("DivisionL: " + (a/b));
                break;
            case '%':
                System.out.println("Modulo: " + (a%b));
                break;
            default:
                System.out.println("Give a valid input");
        }
    }
}
