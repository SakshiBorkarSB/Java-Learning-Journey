// Objects and Classes

public class Java150 {
    public static void main(String args[]){
        Pen P1 = new Pen();  // Created a pen object called P1

        P1.setColor("Green");
        System.err.println(P1.color);

        P1.setTip(7);
        System.err.println(P1.tip);

        P1.color = "Purple";
        System.err.println(P1.color);
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int rollno;
    float percent;

    void calculatepercent(int maths, int phy, int chem){
        percent = (maths + phy + chem)/3;
    }
}
