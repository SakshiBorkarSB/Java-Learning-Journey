// Type Casting in Java

// Byte -> Short -> Int -> Float -> Long -> Double

import java.util.*;
public class Java9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Converting float to int will give error
        float a = 13.9f;
        // int b = a;
        int b = (int)a;
        System.out.println(b);

        char ch = 's';
        int num = ch;
        System.out.println(num);
    }
}
