// Area of rectangle

import java.util.*;
public class Java14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        float length = sc.nextInt();
        System.out.println("Enter the breadth");
        float breadth = sc.nextInt();
         
        float area = length * breadth;
        System.out.println("Area: " + area);
    }
}
