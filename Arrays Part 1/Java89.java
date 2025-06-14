// Linear Search

import java.util.*;

public class Java89 {
    public static int LinearSearch(int num[], int key){
        for(int i = 0; i < num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Enter the size of the array
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        // Array
        int num[] = new int[size];
        // Enter the elements of the array
        System.out.println("Enter the elements of the array if size " + size);
        for(int i = 0; i< size; i++){
            num[i] = sc.nextInt();
        }

        // Key Element
        System.out.println("Enter the key element");
        int key = sc.nextInt();

        // Store the result of the function in variable 'result'
        int result = LinearSearch(num, key);

        // Print the output
        if(result == -1){
            System.out.println("Key not found!");
        }else{
            System.out.println("The key is at the index: " + result);
        }
    }
}
