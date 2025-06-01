// Check if the student will pass or fail

import java.util.*;
public class Java30{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        float marks = sc.nextFloat();

        String result = (marks >=35) ? "PASS" : "FAIL";
        System.out.println("You are " + result);
    }
}
