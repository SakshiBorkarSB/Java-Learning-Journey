/*
    Inverted and rotated half pyramid
                 
                 *
              *  *
           *  *  *
        *  *  *  *
*/

public class Java79{
    public static void inverted_rotated_half_pyramid(int lines){   
        int i;  // line number
        int j;  // spaces + stars

        // outer loop
        for(i = 1; i <= lines; i++){

            // spaces
            for(j = 1; j <= lines - i; j++){
                System.out.print("   ");
            }

            //stars
            for(j = 1; j <= i; j++){
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
    public static void main(String args[]){
        inverted_rotated_half_pyramid(4);
    }
}
