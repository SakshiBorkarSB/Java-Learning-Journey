// Check if the string is palindorme or not

public class Java125 {
    public static boolean isPalindrome(String str){
        for(int i = 0; i < str.length()/2; i++){   // half length
            int n = str.length();
            if(str.charAt(i) != str.charAt(n - 1 - i)){
                // not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "racecar";

        // call function
        System.out.println(isPalindrome(str));
    }
}
