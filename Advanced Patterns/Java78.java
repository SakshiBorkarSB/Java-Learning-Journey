/* 
    Hollow Rectangle Pattern
        *  *  *  *  *
        *           *
        *           *
        *  *  *  *  *
*/

public class Java78{
    public static void hollow_rectangle(int rows, int cols){
        // outer loop
        for(int i = 1; i <= rows; i++){
            // inner loop
            for(int j = 1; j <= cols; j++){
                // cells - (i, j)
                if(i == 1 || i == rows || j == 1 || j == cols){
                    // boundary cells
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_rectangle(4, 5);
    }
}
