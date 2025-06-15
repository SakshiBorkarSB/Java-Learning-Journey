// Inbuild Sort - For ascending Order

import java.util.*;
import java.util.Arrays;

public class Java109 {
    public static void PrintArray(int arr[]){
        System.out.println("Sorted Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // size
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        // elements 
        System.out.println("Enter the elements of the array");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        
        // inbuild function
        Arrays.sort(arr); // Arrays.sort(arr, 0, 3);
        PrintArray(arr);
    }
}
