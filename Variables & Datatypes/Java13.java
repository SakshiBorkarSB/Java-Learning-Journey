/* 
    Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
    (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
*/

import java.util.*;
public class Java13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pencil");
        float c1 = sc.nextFloat();
        c1 = c1 + (c1 * 0.18f);
        
        System.out.println("Enter the cost of pen");
        float c2 = sc.nextFloat();
        c2 = c2 + (c2 * 0.18f);

        System.out.println("Enter the cost of eraser");
        float c3 = sc.nextFloat();
        c3 = c3 + (c3 * 0.18f);

        float total = c1 + c2 + c3;
        System.out.println("Total Bill with 18% GST = " + total);
        
    }
}
