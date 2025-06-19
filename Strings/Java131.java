// Convert first letter of each word into uppercase

public class Java131 {
    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder();

        // Convert the first character to uppercase
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++){
            // If we encounter a space, capitalize the next character
            if(str.charAt(i) == ' ' && i < str.length()){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
    public static void main(String args[]){
        String str = "dazai is a genius";

        System.out.println(toUppercase(str));
    }
}
