// Income tax calculator

import java.util.*;
public class Java27{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your income");
        int income = sc.nextInt();
        int tax;

        if(income < 500000){
            tax = 0;
        }

        else if((income >= 500000) && (income <= 1000000)){
            tax = (int) (income * 0.2);
        }

        else {
            tax = (int) (income * 0.3);
        }
        
        System.out.println("The total amout of tax you need to pay is Rs. " + tax);
    }
}
