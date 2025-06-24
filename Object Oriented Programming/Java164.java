// Interfaces - interface keyword

public class Java164 {
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
    }
}

interface Chessplayer{
    void moves();
}

class Queen implements Chessplayer{
    public void moves(){
        System.out.println("Queen can move in any direction");
    }
}

class Rook implements Chessplayer{
    public void moves(){
        System.out.println("Rook can move horizontally or vertically");
    }
}

class King implements Chessplayer{
    public void moves(){
        System.out.println("King can move one square in any direction");
    }
}
