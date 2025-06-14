// Maximum Subarray Sum - PREFIX SUM METHOD

import java.util.*;

public class Java97 {
    public static void maxSubarraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // Calculate prefix array
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
        // LOOP 1 : To find start
        for(int i = 0; i < arr.length; i++){
            int start = i;
            // LOOP 2 : To find end
            for(int j = i; j < arr.length; j++){
                int end = j;
                
                // Calculate Sum of Subarrays
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum = " + maxSum);
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

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
