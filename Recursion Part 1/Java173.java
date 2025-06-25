// Program to print the nth Fibonacci number using recursion


public class Java173 {
    
    // Recursive function to find the nth Fibonacci number
    public static int Fib(int n) {
        // Base case: If n is 0 or 1, return n (since Fib(0) = 0, Fib(1) = 1)
        if (n == 0 || n == 1) {
            return n;
        }

        // Recursive case: Fibonacci formula -> Fib(n) = Fib(n-1) + Fib(n-2)
        int fnm1 = Fib(n - 1); // Compute Fibonacci of (n-1)
        int fnm2 = Fib(n - 2); // Compute Fibonacci of (n-2)

        int fn = fnm1 + fnm2; // Compute the nth Fibonacci number
        return fn; // Return the result
    }

    public static void main(String args[]) {
        int n = 2; // Define the value of n
        System.out.println(Fib(n)); // Call Fib function and print the nth Fibonacci number
    }
}
