// Find factorial of a given number n = 4 using functions

public class Java65{
    public static int factorial(int num){
        int f = 1;
        for (int i = 1; i <= num; i++){
            f *= i;
        }
        return f;     // factorial
    }
    public static void main(String args[]){
        int num = 4;
        int fact = factorial(4);
        System.out.println(fact);
    }
}
