// ELSE IF STATEMENTS   

import java.util.*;
public class Java26{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the your age");
        int age = sc.nextInt();

        if(age<13){
            System.out.println("You are a child");
        }

        else if((age>=13) && (age<=19)){
            System.out.println("You are a teenager");
        }

        else{
            System.out.println("You are an adult");
        }
    }
}
