// DISPLAY ALL THE NUMBERS ENTERED BY THE USER EXCEPT FOR THE MULTIPLE OF TEN

import java.util.*;
public class Java50{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        do{
            System.out.print("Enter the numnber: ");
            int num = sc.nextInt();

            if(num % 10 == 0){
                System.out.println("------- Iteration skipped -------");
                continue;
            }
            System.out.println(num + " is the number entered by the user");
        } while(true);

    }
}
