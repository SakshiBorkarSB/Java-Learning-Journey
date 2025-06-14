// TRAPPED RAINWATER PROBLEM

// AUXILLARY ARRAY - helping arrays for left and right max boundary 

// tc is proportional to the number of the bars i.e., the numbre of elements present in the height array O(n)

import java.util.*;

public class Java99 {
    public static int TrappingRainwater(int height[]){
        int n = height.length;

        // calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i] , leftMax[i - 1]);
        }

        // calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int TrappedWater = 0;
        // loop
        for(int i = 0; i < n; i++){
            // calculate Water Level
            int WaterLevel = Math.min(leftMax[i], rightMax[i]);

            // calculate Trapped water
            TrappedWater += WaterLevel - height[i];
        }
        return TrappedWater;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // number of bars
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        // heights of bar
        System.out.println("Enter the heights of the bars");
        int height[] = new int[size];
        for(int i = 0; i < size; i++){
            height[i] = sc.nextInt();
        }

        // call function
        System.out.println("Trapped rainwater: " + TrappingRainwater(height));
    }
}
