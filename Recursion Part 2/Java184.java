// You are given a number (eg - 2019), convert it into a String of english like 'two zero one nine' Use a recursive function to solve this problem.
// NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number can’t be 0

// example: 2004 will give two zero zero four

public class Java184 {
    static String digits[] = {"zero", "one", "two", "three", "four" ,"five", "six", "seven", "eight", "nine"};
     
    public static void printDigits(int number){
        if(number == 0){  // Base Case
            return;
        }
        int lastDigit = number % 10;
        printDigits(number / 10);
        System.out.print(digits[lastDigit] + " ");

    }
    public static void main(String args[]){
        printDigits(2004);
    } 
}
