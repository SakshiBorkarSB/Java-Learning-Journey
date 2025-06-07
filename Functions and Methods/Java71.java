// Convert from Binary to Decimal

import java.util.*;
public class Java71{
    public static void BinToDec(int biNum){
        int myNum = biNum;
        int pow = 0;
        int decNum = 0;

        while(biNum > 0){
            int lastDigit = biNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            biNum = biNum / 10;
        }
        System.out.println("The decimal number for " + myNum + " is: " + decNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary Number");
        int biNum = sc.nextInt();
        BinToDec(biNum);
    }
}
