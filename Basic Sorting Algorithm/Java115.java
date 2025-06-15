// Counting Sort - descending order

import java.util.*;

public class Java115 {
    public static void CountingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        // count frequency = iterate on original array
        int count[] = new int[largest + 1];  // positive numbers, starting from 0
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;   // increment the count of each element
        }

        // sorting = iterate on frequency array (count) in reverse for descending order
        int j = 0;
        for(int i = count.length - 1; i >= 0; i--){  // start from the largest value
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void PrintArray(int arr[]){
        System.out.println("Sorted Array (Descending Order): ");
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
        for( int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // call function
        CountingSort(arr);
        PrintArray(arr);
    }
}
