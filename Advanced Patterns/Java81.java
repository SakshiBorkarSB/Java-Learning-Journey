/*
    Print Floyd's Triangle Pattern
        1
        2   3
        4   5   6
        7   8   9   10
        11  12  13  14  15
*/

public class Java81{
    public static void floyd_triangle(int lines){
        int i, j;
        int counter = 1;
        for(i = 1; i <= lines; i++){
            for(j = 1; j <= i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        floyd_triangle(5);
    }
}
