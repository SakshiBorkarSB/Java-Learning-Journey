// All possible pairs in an array

import java.util.*;

public class Java93 {
    public static void pairs(int arr[]){
        int total_pairs = 0;
        for(int i = 0; i < arr.length; i++){
            int curr = arr[i];   // cureent number from the array
            for(int j = i + 1; j < arr.length; j++){ 
                System.out.print("(" + curr + "," + arr[j] + ")");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + total_pairs);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // size
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        // elements
        System.out.println("Enter the elements");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // call function
        pairs(arr);


    }
}
