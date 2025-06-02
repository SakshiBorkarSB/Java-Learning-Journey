// BREAK STATEMENT

import java.util.*;
public class Java47{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        for(int i = 1; i <= 7; i++){
            System.out.println(i);
            if(i == 4){
                break;
            }
        }
        System.out.println("The loop is breaked");
    }
}
