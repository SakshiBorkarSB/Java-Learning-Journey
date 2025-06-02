// CONTINUE STATEMENT

import java.util.*;
public class Java49{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        for(int i = 1; i <= 7; i++){
            
            if(i == 4){
                System.out.println("Iteration skipped");
                continue;
            }
            System.out.println(i);
        }
    }
}
