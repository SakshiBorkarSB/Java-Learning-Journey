// What will be the output of the following program 

public class Java21{
    public static void main(String args[]){
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x+y);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
    }
}
