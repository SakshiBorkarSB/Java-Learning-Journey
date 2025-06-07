// Convert Decimal to Binary Number

import java.util.*;
public class Java72{
    public static void DecToBin(int DecNum){
        int myNum = DecNum;
        int pow = 0;
        int BiNum = 0;

        while(DecNum > 0){
            int remainder = DecNum % 2;
            BiNum = BiNum + (remainder * (int)Math.pow(10, pow));
            
            pow++;
            DecNum = DecNum / 2;
        }
        System.out.println("The Binary Number for " + myNum + " is: " + BiNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Decimal Number");
        int DecNum = sc.nextInt();
        DecToBin(DecNum);
    }
}
