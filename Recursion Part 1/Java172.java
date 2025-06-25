// Print sum of first n natural numbers

public class Java172 {
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        int fnm1 = sum(n - 1);
        int fn = n + fnm1;
        return fn;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(sum(n));
    }
}
