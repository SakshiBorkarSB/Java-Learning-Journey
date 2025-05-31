// Logical Operators

import java.util.*;
public class Java18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("----AND OPERATOR----");
        System.out.println((13>9) && (6<7));
        System.out.println((13<9) && (6<7));
        System.out.println((13>9) && (6>7));
        System.out.println((13<9) && (6>7));

        System.out.println("----OR OPERATOR----");
        System.out.println((13>9) || (6<7));
        System.out.println((13<9) || (6<7));
        System.out.println((13>9) || (6>7));
        System.out.println((13<9) || (6>7));

        System.out.println("----NOT OPERATOR----");
        System.out.println( !(13>9) );
        System.out.println( !(13<9) );
    }
}
