import java.util.*;

public class Java124 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // declaration
        String str = "bangtan";
        String str2 = new String ("Bangtan");

        // input/output
        String name;
        name = sc.next();
        System.out.println(name);
        name = sc.nextLine();
        System.out.println(name);

        // string length
        String fullname = "Gojo Satoru";
        System.out.println(fullname.length());

        // string concatenate
        String firstname = "Levi";
        String lastname = "Ackerman";
        String full_name = firstname + " " + lastname;
        System.out.println(full_name);

        // String charAt
        System.out.println(full_name.charAt(0));
        for(int i = 0; i < fullname.length(); i++){
            System.out.print(fullname.charAt(i) + " ");
        }
    }
}
