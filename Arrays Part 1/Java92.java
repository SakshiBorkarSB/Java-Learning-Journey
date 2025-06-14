// Reverse the array

import java.util.*;

public class Java92 {
    public static void reverse(int arr[]){
        int first = 0;
        int last = arr.length - 1;

        while(first < last){
            // swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // size
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        // elements 
        System.out.println("Enter the elements");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        //call function
        reverse(arr);

        // print array
        System.out.println("Reverse of the array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
