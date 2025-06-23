// Getters and Setters

public class Java152 {
    public static void main(String args[]){
        Pen P1 = new Pen();  

        P1.setColor("Green");
        System.err.println(P1.getColor());

        P1.setTip(7);
        System.err.println(P1.getTip());

        P1.setColor("Purple");
        System.err.println(P1.getColor());
    }
}

class Pen{
    private String Color;
    private int Tip;

    String getColor(){
        return this.Color;
    }

    int getTip(){
        return this.Tip;
    }

    void setColor(String Color){
        this.Color = Color;
    }

    void setTip(int Tip){
        this.Tip = Tip;
    }
}
