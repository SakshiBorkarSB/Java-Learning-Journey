// FUNCTION OVERLOADING (TYPE OF PARAMETERS)

import java.util.*;
public class Java68{
    public static int product(int a, int b){
        return a * b;
    }

    public static float product(float a, float b){
        return a * b;
    }

    public static void main(String args[]){
        System.out.println("a * b = " + product(5, 2));
        System.out.println("a * b = " + product(3.0f, 4.0f));
    }
}
