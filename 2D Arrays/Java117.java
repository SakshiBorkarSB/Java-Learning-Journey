// 2D Arrays

import java.util.*;

public class Java117 {
    // to search any element in the matrix we can use the following function 
    public static boolean Search(int matrix[][], int key){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at index (" + i + " , " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    // Function to find the maximum element in the matrix
    public static int findMax(int matrix[][]){
        int max = matrix[0][0]; // Initialize max with the first element
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j]; // Update max if current element is larger
                }
            }
        }
        return max;
    }

    // Function to find the minimum element in the matrix
    public static int findMin(int matrix[][]){
        int min = matrix[0][0]; // Initialize min with the first element
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j]; // Update min if current element is smaller
                }
            }
        }
        return min;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // declaration
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length; 

        // input
        System.out.println("Enter the elements");
        // outer loop for rows
        for(int i = 0; i < n; i++){
            // inner loop for columns
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        System.out.println("Matrix: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the element to search");
        int key = sc.nextInt();

        // call the function
        Search(matrix, key);
        
        // Find and print the maximum and minimum elements
        int maxElement = findMax(matrix);
        int minElement = findMin(matrix);

        System.out.println("Maximum element: " + maxElement);
        System.out.println("Minimum element: " + minElement);
    }
}
