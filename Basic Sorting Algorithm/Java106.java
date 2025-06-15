// Bubble Sort

import java.util.*;

public class Java106 {
    public static void BubbleSort(int arr[]){
        // turns
        for(int turn = 0; turn < arr.length; turn++){
            int swap = 0;
            boolean swapped = false;  // flag to check if any swap happened
            for(int j = 0; j < arr.length - 1 - turn; j++){
                // swap
                if(arr[j] > arr[j + 1]){  // check if the current element is greater than next element or not
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            System.out.println("Swaps = " + swap);
        }
    }
    public static void printArray(int arr[]){
        System.out.print("Sorted Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // size
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        // elements of array
        System.out.println("Enter the elements of the array");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // call function
        BubbleSort(arr);
        printArray(arr);
    }
}
