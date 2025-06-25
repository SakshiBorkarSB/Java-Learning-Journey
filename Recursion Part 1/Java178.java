// Print x^n with O(log n) complexity

public class Java178 {
    public static int poweropt(int a, int n){
        if(n == 0){
            return 1;
        }

        int halfPow = poweropt(a, n/2);
        int halfPowSq = halfPow * halfPow;

        // n is odd
        if (n % 2 == 1) {
            halfPowSq = a * halfPowSq;
        }

        return halfPowSq;
    }
    public static void main(String args[]){
        System.out.println(poweropt(2, 2));
    }
}
