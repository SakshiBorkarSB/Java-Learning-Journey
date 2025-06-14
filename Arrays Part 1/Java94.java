// Print all subarrays of an array

import java.util.*;

public class Java94 {
    public static void Subarrays(int arr[]){
        int total_sa = 0;
        // LOOP 1 : To find start
        for(int i = 0; i < arr.length; i++){
            int start = i;
            // LOOP 2 : To find end
            for(int j = i; j < arr.length; j++){
                int end = j;
                // LOOP 3 : To print elements
                for(int k = start; k <= end; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                total_sa++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + total_sa);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        // size
        System.out.println("Enter the size");
        int size = sc.nextInt();

        // elements
        System.out.println("Enter the elements");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // call function
        Subarrays(arr);
    }
}
