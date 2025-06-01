// Print of the number is even or odd

import java.util.*;
public class Java25{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }
}
