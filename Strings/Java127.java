// .equal function

public class Java127 {
    public static void main(String args[]){
        String s1 = "Levi";
        String s2 = "Levi";
        String s3 = new String("Levi");

        if(s1 == s3){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
