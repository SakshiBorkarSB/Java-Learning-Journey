/*
    Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not) A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321
*/

import java.util.*;
public class Java75{
    public static boolean palindrome(int num){
        int palindrome = num;  // copied the number into palindrome
        int reverse = 0;
        
        while(palindrome > 0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        // If original number = palindrome then it is a palindrome number
        if(num == reverse){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        System.out.println(num + " is palindrome: " + palindrome(num));
    }
}
