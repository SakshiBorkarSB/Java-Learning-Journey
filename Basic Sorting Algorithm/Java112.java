// Bubble sort - descending order

import java.util.*;

public class Java112 {
    public static void BubbleSort(int arr[]){
        // turns
        for(int turns = 0; turns < arr.length; turns++){
            boolean swapped = false;
            for(int j = 0; j < arr.length - 1 - turns; j++){
                // swap
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void PrintArray(int arr[]){
        System.out.println("Sorted array in descending order: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // size
        System.out.println("Enter the size");
        int size = sc.nextInt();

        // elements
        System.out.println("Enter the elements of the array");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // call function
        BubbleSort(arr);
        PrintArray(arr);
    }
}
