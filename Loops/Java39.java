// Print numbers from 1 to n

import java.util.*;
public class Java39{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 'n' from 1 to n");
        int n = sc.nextInt();
        int num = 1;

        while(num<=n){
            System.out.println(num);
            num++;
        }
    }
}
