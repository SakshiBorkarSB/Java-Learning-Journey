// String Builder

public class Java130 {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");

        // to add characters one by one we use append function
        for(char i = 'a'; i <= 'z'; i++){
            sb.append(i);   // append = ek ke piche ek judna
        }
        System.out.println(sb);
    }
}
