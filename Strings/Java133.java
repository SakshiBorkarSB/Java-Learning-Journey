// count vowels

import java.util.*;
import java.util.Arrays;

public class Java133 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string");
        String str = sc.nextLine();

        int count = 0;
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count ++;
            }
        }
        System.out.println("The number of vowels in the above string are: " + count);
    }
}
