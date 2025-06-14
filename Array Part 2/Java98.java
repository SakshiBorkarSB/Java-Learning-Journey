// Maximum Subarray Sum - KADANE'S METHOD


import java.util.*;

public class Java98 {
    public static void kadanes(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        boolean allNegative = true;
        int smallestNegative = Integer.MIN_VALUE; // Track the smallest negative number

        for(int i = 0; i < arr.length; i++){
            // Check if the current element is non-negative
            if(arr[i] >= 0){
                allNegative = false;
            } else {
                // Update smallest negative number
                smallestNegative = Math.max(smallestNegative, arr[i]);
            }

            currSum = currSum + arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }

        // If all elements are negative, print the smallest negative number
        if(allNegative){
            maxSum = smallestNegative;
        }

        System.out.println("Maximum Sum: " + maxSum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Size 
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        // Elements
        System.out.println("Enter the elements of the array");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // Call function
        kadanes(arr);
    }
}
