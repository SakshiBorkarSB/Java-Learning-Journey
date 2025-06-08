// Create, Input, Output, Update and Length in Arrays

import java.util.*;
public class Java87 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];

        //input
        System.out.println("Enter maths marks");
        marks[0] = sc.nextInt();
        System.out.println("Enter physics marks");
        marks[1] = sc.nextInt();
        System.out.println("Enter chemistry marks");
        marks[2] = sc.nextInt();

        //output
        System.out.println("Maths: " + marks[0]);
        System.out.println("Physics: " + marks[1]);
        System.out.println("Chemistry: " + marks[2]);

        //update
        marks[2] = 100;
        System.out.println("Updated Chemistry: " + marks[2]);

        //length
        System.out.println("Length of marks: " + (marks.length));
    }
}
