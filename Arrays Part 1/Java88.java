// Arrays as function arguments

import java.util.*;

public class Java88{
    public static void update(int marks[], int noupdate){
        for(int i = 0; i < marks.length; i++){
            noupdate = 10;
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int marks[] = {99, 89, 87};
        int noupdate = 5;

        //Print before updation
        System.out.println("Before Updation");
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        System.out.println("No update: " + noupdate);

        update(marks, noupdate);

        //Print after updation
        System.out.println("After Updation");
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        System.out.println("No update: " + noupdate);

    }
}
