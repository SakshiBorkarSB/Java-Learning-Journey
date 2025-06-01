/* Write a Java program that takes a year from the user and print whether that year is a leap year or not

    HINTS:
                                                   Is year divisible by 4?
                                                    |                  |
                                                    |                  |
                    Yes -> Is the year divisible____|                  |____No -> Not a Leap year
                     by 100?          
                      |               |
                      |               | 
                      |               |
      Yes -> Is the year             No -> LEAP YEAR                            
             divisible by 
             400?
            |         |
            |         | 
            |         |
Yes -> LEAP YEAR     No -> Not a Leap year

*/


import java.util.*;
public class Java36{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        boolean x = ((year % 4) == 0);
        boolean y = ((year % 100) != 0);
        boolean z = (((year % 100) == 0) && ((year % 400) == 0));

        if (x && (y || z)){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}



/*

import java.util.*;
public class Java36{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    System.out.println(year + " is a LEAP YEAR");
                }
                else
                {
                    System.out.println(year + " is NOT a leap year");
                }
            }
            else
            {
                System.out.println(year + " is a LEAP YEAR");
            }
        }
        else
        {
            System.out.println(year + " is NOT a leap year");
        }
    }
}

*/
