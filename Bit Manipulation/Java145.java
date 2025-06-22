// Operations on bits - Count set bits

import java.util.Scanner;

public class Java145 {
    public static int countsetbits(int n){
        int count = 0;
        while (n > 0){
            if((n & 1) != 0){
                count ++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the number");
        int n = sc.nextInt();

        System.err.println(countsetbits(n));

        // n = 10, ans = 2
    }
}
