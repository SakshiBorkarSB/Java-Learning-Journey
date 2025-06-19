// Diagonal Sum

import java.util.*;

public class Java119 {
    public static int diagonalSum(int arr[][]){  /// Brute Force - O(n^2)
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(i == j){
                    sum += arr[i][j];
                }
                else if(i + j == arr.length - 1){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static int diagonal_sum(int arr[][]){   /// O(n)
        
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            // primary diagonal
            sum += arr[i][i];
            // secondary diagonal
            if(i != arr.length - 1 - i)    // i != j
            sum += arr[i][arr.length - i - 1];
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        // System.out.println(diagonalSum(arr));
        System.out.println(diagonal_sum(arr));
    }
}
