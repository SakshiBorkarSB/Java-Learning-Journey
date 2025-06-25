// Find first occurance of an element in an array

public class Java175 {
    public static int firstOcc(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return firstOcc(arr, key, i + 1);
    }
    public static void main(String args[]){
        int arr[] = {1, 4, 2, 3, 7, 5, 6};
        System.out.println(firstOcc(arr, 7, 0));
    }
}
