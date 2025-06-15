// Insertion Sort

import java.util.*;

public class Java108 {
    public static void InsertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;

            // finding correct position to insert
            while(prev >= 0 && arr[prev] > curr){   // arr[prev] < curr for descending order
                arr[prev + 1] = arr[prev];   // pushing prev to its next element
                prev--;
            }

            // insertion
            arr[prev + 1] = curr;
        }
    }

    public static void PrintArray(int arr[]){
        System.out.println("Sorted Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // size
        System.out.println("Enter the sizeof the array");
        int size = sc.nextInt();

        // elements
        System.out.println("Enter the elements of the array");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // call functions
        InsertionSort(arr);
        PrintArray(arr);
    }
}
