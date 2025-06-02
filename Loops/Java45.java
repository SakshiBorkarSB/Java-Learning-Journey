// Reverse the given number

import java.util.*;
public class Java45{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = 201004;
        int rev = 0;

        while (n > 0){
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
