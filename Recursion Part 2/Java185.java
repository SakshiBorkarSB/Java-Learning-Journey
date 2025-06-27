// Write a program to find Length of a String using Recursion

public class Java185 {
    public static int length(String str){
        if(str.length() == 0) {  /// Base Case
            return 0;
        }

        return length(str.substring(1)) + 1;
    }
    public static void main(String args[]){
        String str = "abcde";
        System.out.println(length(str));
    }
} 
