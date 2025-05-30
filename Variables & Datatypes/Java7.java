// Area of Circle

import java.util.*;
public class Java7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println(area);
    }
}
