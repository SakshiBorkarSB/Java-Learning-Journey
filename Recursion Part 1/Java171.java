// Print factorial of a number n

public class Java171 {
    public static int factorial(int n){
        if(n == 0){
            return 1;   // 0! = 1
        }

        int fnm1 = factorial(n - 1);
        int fn = n * fnm1;
        return fn;
    }
    public static void main(String args[]){
        int n = 2;
        System.out.println(factorial(n));
    }
}
