// Find the last occurrence of an element in an array using recursion
public class Java176 {

    // Recursive function to find the last occurrence of 'key' in the array
    public static int lastOcc(int arr[], int key, int i) {
        // Base Case: If index reaches the end of the array, return -1 (not found)
        if (i == arr.length) {   
            return -1;
        }

        // Recursive call to check for the key in the rest of the array
        int isFound = lastOcc(arr, key, i + 1);

        // If the key is not found in the remaining array and the current element matches the key, return the index
        if (isFound == -1 && arr[i] == key) {
            return i; 
        }

        // Otherwise, return the index found in the recursive call (if any)
        return isFound;
    }

    public static void main(String args[]) {
        int arr[] = {2, 7, 1, 3, 7, 4, 9}; // Sample array
        System.out.println(lastOcc(arr, 7, 0)); // Find the last occurrence of 7
    }
}
