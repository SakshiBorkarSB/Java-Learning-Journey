// Inbuild Sort - For descending Order

import java.util.*;
import java.util.Collections;

public class Java110 {
    public static void PrintArray(Integer arr[]){
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
        Integer arr[] = new Integer[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // inbuild function
        Arrays.sort(arr,Collections.reverseOrder()); // Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        PrintArray(arr);
    }
}
