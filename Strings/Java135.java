// Anagrams example heart and earth... same alphabets different sequence

import java.util.*;
import java.util.Arrays;

public class Java135 {
    public static void main(String args[]){
        String str1 = "earth";
        String str2 = "heart";

        // Convert strings to lowecase so that we don't need to check condition for both uppecases and lowercases
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if the lengths of the strings are same or not
        if(str1.length() == str2.length()){
            // convert strings into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            // sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // if sorted arrays are same then the strings are anagrams
            boolean result = Arrays.equals(str1charArray, str2charArray);

            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other");
            } else {
                System.out.println("Not anagrams");
            }
        }
    }
}
