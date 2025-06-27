// Tiling Problem - Given 2 x n floor... tiles are of 2 x 1... in how many number of ways can we place it... tile can be placed either horizontally or vertically

public class Java179 {
    public static int Tiling(int n){ // n is the number of tiles
        // Base Case
        if(n == 0 || n == 1){
            return 1;
        }

        // Kaam
        // Vertical choice
        int fnm1 = Tiling(n - 1); 

        // Horizontal choice
        int fnm2 = Tiling(n - 2);

        // Total ways
        int total = fnm1 + fnm2;

        return total;
    }
    public static void main(String args[]){
        System.out.println(Tiling(5));
    }
}
