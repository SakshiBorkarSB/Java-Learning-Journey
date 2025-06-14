/*
    Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining

        Example 1:
            Input: height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
            Output: 6
            Explanation: The above elevation map (black section) is represented by array
            [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped
 */

 
import java.util.*;

public class Java104 {
    public static int Trap(int height[]){
        int n = height.length;
        int res = 0, l = 0, r = n - l;
        int rMax = height[r], lMax = height[l];

        while(l < r){
            if(lMax < rMax){
                l++;
                lMax = Math.max(lMax, height[l]);
                res += lMax - height[l];
            } else {
                r--;
                rMax = Math.max(rMax, height[r]);
                res += rMax - height[r];
            }
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // size
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        // elements
        System.out.println("Enter the elements of the array");
        int height[] = new int[size];
        for(int i = 0; i < size; i++){
            height[i] = sc.nextInt();
        }

        // call the function
        System.out.println(Trap(height));
    }
    
}
