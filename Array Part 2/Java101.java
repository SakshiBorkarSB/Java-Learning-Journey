/* 

    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    
    CONSTRAINTS: 

        1.         1   <=   num.length   <= 10^5
        2.     -10^9   <=      num[i]    <= 10^9

    Example:
        input: nums[] = [1,2,3,1]
        output: true

*/

import java.util.*;

public class Java101 {
    public static boolean BruteForce(int nums[]){
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // size of array
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        // elements of the array
        System.out.println("Enter the elements of the array");
        int nums[] = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = sc.nextInt();
        }

        // Call function
        System.out.println(BruteForce(nums));
    }
}
