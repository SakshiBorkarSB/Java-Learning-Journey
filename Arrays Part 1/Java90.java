// Find the largest and smallest element in an array

import java.util.*;

public class Java90 {
    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int smallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }   
        return smallest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // size of array
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        // elements of array
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // largest element of array
        System.out.println("The largest element of the array is: " + (largest(arr)));

        // smallest element of array
        System.out.println("The smallest element of the array is: " + (smallest(arr)));

    }
}
