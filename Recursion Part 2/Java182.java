// Binary Strings problem
// Print all Binary Strings of size n without consecutive ones

public class Java182 {
    public static void BinaryString(int n, int lastPlace, String str){

        // Base Case
        if(n == 0){
            System.out.println(str);  /// empty string
            return;
        }

        BinaryString(n - 1, 0, str + "0");
        if(lastPlace == 0){
            BinaryString(n - 1, 1, str + "1");
        }

    }
    public static void main(String args[]){
        BinaryString(3, 0, "");
    }
}
