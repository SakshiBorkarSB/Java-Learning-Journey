// Substrings in java

public class Java128 {
    public static String Substring(String str, int startindex, int endindex){
        String substr = "";
        for(int i = startindex; i < endindex; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str = "Gojo Satoru";
        // System.out.println(Substring(str, 0, 3));

        System.out.println(str.substring(0, 5));
    }
}
