// Conditional Statements

// IF - ELSE STATEMENTS

import java.util.*;
public class Java23{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the your age");
        int age = sc.nextInt();

        if(age<13){
            System.out.println("You are a child");
        }

        if((age>=13) && (age<=19)){
            System.out.println("You are a teenager");
        }

        else{
            System.out.println("You are an adult");
        }
    }
}
