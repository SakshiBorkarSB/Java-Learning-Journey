// Print numbers from 1 to n (Increasing Order)

public class Java170{
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);  // Recursive call
        System.out.print(n + " ");  // Print
    }
    public static void main(String args[]){
        int n = 10;
        printInc(n);
    }
}
