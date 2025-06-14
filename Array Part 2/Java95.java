// Print all subarrays of an array... also find the sum of each subarray and print the maximum and minimum sum
// Maximum Subarray Sum - BRUTE FORCE METHOD


import java.util.*;

public class Java95 {
    public static void maxSubarraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
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
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum = " + maxSum);
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
        maxSubarraySum(arr);
    }
}
