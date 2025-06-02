// KEEP ENTERING THE NUMBER TILL THE USER ENTERS A MULTIPLE OF TEN

import java.util.*;
public class Java48{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        do{
            System.out.print("Enter the number: ");
            int num = sc.nextInt();

            if(num % 10 == 0){
                System.out.println("Loop Ends");
                break;
            }

            System.out.println(num + " is the number entered");
        } while(true);
    }
}
