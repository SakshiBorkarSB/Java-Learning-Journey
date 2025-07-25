// Question 4 : We are given a string S, we need to find the count of all contiguous substrings starting and ending with the same character.

/*
    Sample Input 1 : S = "abcab"
    Sample Output 1 : 7
    There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
    Out of the above substrings, there are 7 substrings : a, abca, b, bcab, c, a and b. So, only 7 contiguous substrings start and end with the same character.

    Sample Input 2 : S = "aba"
    Sample Output 2 : 4
    The substrings are a, b, a and aba
*/

public class Java186 {
    // Function to count contiguous substrings that start and end with the same character
    public static int countSubstrings(String str, int i, int j, int n) {
        // Base Case: Single character substrings (always valid)
        if (n == 1) {
            return 1;
        }

        // Base Case: Invalid case when substring length is zero or negative
        if (n <= 0) {
            return 0;
        }

        /*
            Recursively count:
            1. Excluding the first character: countSubstrings(str, i + 1, j, n - 1)
            2. Excluding the last character: countSubstrings(str, i, j - 1, n - 1)
            3. Subtract common part counted twice: countSubstrings(str, i + 1, j - 1, n - 2)
        */
        int res = countSubstrings(str, i + 1, j, n - 1)
                + countSubstrings(str, i, j - 1, n - 1)
                - countSubstrings(str, i + 1, j - 1, n - 2);

        // If first and last characters are the same, increase the count
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }

        return res;
    }

    public static void main(String args[]) {
        String str = "abcab";
        int n = str.length();
        
        // Call the recursive function with initial parameters
        System.out.println(countSubstrings(str, 0, n - 1, n));
    }
}
