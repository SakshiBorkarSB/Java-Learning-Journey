// Type Promotions of Expressions in Java

// Type promotions only occur with expressions

/* RULE 1 :
   Java automatically promotes each byte, short, char oprenad to int when evaluating an expression
*/

public class Java10{
    public static void main(String args[]){
        char b = 'a';
        char a = 'b';
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println(a);   //No type promotion will take place since type promotion only works on expressions
        System.out.println(a-b);

        // char c = a-b;  
        // Will give an error cause integer type data ko character me convert nahi kr sakte 

        short A = 5;
        byte B = 25;
        char C = 'c';
        // byte bt = A + B + C;   // ERROR
        byte bt = (byte)(A + B + C);
        System.out.println(bt);



/* RULE 2 :
   If one operand is long, float, double the whole expression is promoted to long float or double respectively
*/

        int x = 10;
        float y = 20.25f;
        long z = 25;
        double u = 30;
        double ans = x+y+z+u;
        System.out.println(ans);

        byte b1 = 5;
        // byte b1 = b1 * 2;   // ERROR
        byte b2 = (byte)(b1 * 2);
        System.out.println(b2);

    }
}
