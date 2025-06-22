// Operations on bits - get

import java.util.Scanner;

public class Java138 {
    public static int getbit(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the number");
        int n = sc.nextInt();

        System.err.println("Enter value of i");
        int i = sc.nextInt();

        System.err.println(getbit(n, i));

        // n = 15, i = 2, ans = 1
    }
}
