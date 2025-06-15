// Selection Sort

import java.util.*;

public class Java107 {
    public static void SelectionSort(int arr[]){
        // count turns
        for(int i = 0; i < arr.length - 2; i++){

            // min position = current position
            int MinPos = i;  
            
            // searched minimum from the further unsorted part
            for(int j = i + 1; j <= arr.length - 1; j++){
                if(arr[MinPos] > arr[j]){    // if we invert the condition we can the array in descending order
                    MinPos = j;
                }
            }
            // swap min with current position
            int temp = arr[MinPos];
            arr[MinPos] = arr[i];
            arr[i] = temp;
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
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        // elements
        System.out.println("Enter the elements of the array");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // call function
        SelectionSort(arr);
        PrintArray(arr);
    }
    
}
