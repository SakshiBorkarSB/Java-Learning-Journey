/*
    Inverted Half pyramid with numbers
        1 2 3 4 5
        1 2 3 4 
        1 2 3 
        1 2
        1
*/

public class Java80{
    public static void inverted_half_number_pyramid(int lines){
        int i;    // line number
        int j;    // for numbers (here, 1 to 5)

        //outer loop
        for(i = 1; i <= lines; i++){
            for(j = 1; j <= lines - i + 1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        inverted_half_number_pyramid(5);
    }
}
