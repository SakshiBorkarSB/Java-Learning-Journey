// Input in Java

import java.util.*;

public class Java4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);   // Scanner object

        System.out.println("Enter a word");
        String first_name = sc.next();
        System.out.println(first_name);

        System.out.println("Enter a line or paragraph");
        String full_name = sc.nextLine();
        System.out.println(full_name);

        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println(number);

        System.out.println("Enter a decimal number");
        float decimal = sc.nextFloat();
        System.out.println(decimal);

        System.out.println("Enter a big number");
        long large_no = sc.nextLong();
        System.out.println(large_no);

        System.out.println("Enter a big decimal number");
        double large_decimal = sc.nextDouble();
        System.out.println(large_decimal);

        System.out.println("Enter a byte value");
        byte byte_no = sc.nextByte();
        System.out.println(byte_no);

        System.out.println("Enter a boolean value");
        boolean boolean_value = sc.nextBoolean();
        System.out.println(boolean_value);

        System.out.println("Enter a short number");
        short short_no = sc.nextShort();
        System.out.println(short_no);
    }
}
