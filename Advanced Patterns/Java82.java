/*
    Print 0-1 Triangle Pattern
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
*/

public class Java82{
    public static void zero_one_triangle(int lines){
        int i, j;
        for(i = 1; i <= lines; i++){
            for(j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        zero_one_triangle(5);
    }
}
