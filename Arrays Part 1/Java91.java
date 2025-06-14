// Binary Search


import java.util.*;

public class Java91 {
    public static int BinarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // find mid
            int mid = (start + end) / 2;

            // comparisons
            if(arr[mid] == key){
                return mid;
            }
            
            if(arr[mid] > key){ // left
                end = mid - 1;
            } else {  // right
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // size of array
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        //  elements of array
        System.out.println("Enter the elements of the array");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // enter key
        System.out.println("Enter the key element");
        int key = sc.nextInt();

        // call function
        System.out.println("The key is found at the index: " + BinarySearch(arr, size));


    }
}
