// Minimum Subarray Sum - BRUTE FORCE METHOD

import java.util.*;

public class Java96 {
    public static void minSubarraySum(int arr[]){
        int currSum = 0;
        int minSum = Integer.MAX_VALUE;
        // LOOP 1 : To find start
        for(int i = 0; i < arr.length; i++){
            int start = i;
            // LOOP 2 : To find end
            for(int j = i; j < arr.length; j++){
                int end = j;
                currSum = 0;
                // LOOP 3 : Calculate Sum of Subarrays
                for(int k = start; k <= end; k++){
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(minSum > currSum){
                    minSum = currSum;
                }
            }
        }
        System.out.println("Minimum Sum = " + minSum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        // size
        System.out.println("Enter the size");
        int size = sc.nextInt();

        // elements
        System.out.println("Enter the elements");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // call function
        minSubarraySum(arr);
    }
}
