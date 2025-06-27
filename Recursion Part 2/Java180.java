// Remove Duplicates

public class Java180 {
    public static void RemoveDuplicates(String str, int index, StringBuilder newStr, boolean map[]){
        
        // Base Case - when we reach at the end of the string
        if(index == str.length()){  
            System.out.println(newStr);
            return;
        }

        // Get the current character at the given index
        char CurrChar = str.charAt(index);   // Character jis index pe hai uska index
        
        // Check if the character exists in the map arr[] or not
        if(map[CurrChar - 'a'] == true){     // map[CurrChar - 'a'] = map ka index
            // Current character is a duplicate
            RemoveDuplicates(str, index + 1, newStr, map);
        } else {
            // Current character is not a duplicate
            map[CurrChar - 'a'] = true;

            // Append the current character to newStr and move to the next index
            RemoveDuplicates(str, index + 1, newStr.append(CurrChar), map);   // newStr.append(CurrChar) - new String ke piche current character jud jayega
        }
    }

    public static void main(String args[]){
        String str = "geeksforgeeks";
        RemoveDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        str = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz";
        RemoveDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
