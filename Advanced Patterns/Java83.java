/* 
    Print Butterfly Pattern
    
        *                    *
        *  *              *  *
        *  *  *        *  *  *
        *  *  *  *  *  *  *  *
        *  *  *  *  *  *  *  *
        *  *  *        *  *  *
        *  *              *  *
        *                    *

*/

public class Java83{
    public static void butterfly(int n){
        // first half
        for(int i = 1; i <= n; i++){
            // stars - i
            for(int j = 1; j <= i; j++){
                System.out.print(" * ");
            }

            // spaces - 2 * (n - i)
            for(int j = 1; j <= (2 * (n - i)); j++){
                System.out.print("   ");
            }

            // stars - i
            for(int j = 1; j <= i; j++){
                System.out.print(" * ");
            }

            System.out.println();
        }

        // second half
        for(int i = n; i >= 1; i--){
            // stars
            for(int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            
            // spaces
            for(int j = 1; j <= (2 * (n - i)); j++){
                System.out.print("   ");
            }

            // stars
            for(int j = 1; j <= i; j++){
                System.out.print(" * ");
            }

            System.out.println();
        }
        
    }
    public static void main(String args[]){
        butterfly(7);
    }
}
