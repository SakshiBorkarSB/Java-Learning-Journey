// Counting Sort - used when range of numbers is small... remember quantity can be large but range is small

import java.util.*;

public class Java111 {
    public static void CountingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        // count frequency = iterate on original array
        int count[] = new int[largest + 1];  // positive numbers that's why starting from 0
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;   // number = index then count me uss index pe jana hai
        }

        // sorting = iterate on frequency array (count)
        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
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
        for( int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // call function
        CountingSort(arr);
        PrintArray(arr);
    }
}
