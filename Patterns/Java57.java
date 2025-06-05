/* 
        Print the given star Pattern
        * * * *
        * * *
        * *
        * 
*/

import java.util.*;
public class Java57{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        for (int line = 1; line <= 4; line++){
            for (int star = line; star <= 4; star++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
