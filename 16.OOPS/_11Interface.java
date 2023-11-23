
public class _11Interface {
    public static void main(String[] args){
        Pawn p =new Pawn();
        p.moves();

    }    
}

interface ChessPlayer{
    void moves();
}


class King implements ChessPlayer{
    public void moves(){
        System.out.println("r,l,t,b");
    }
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("queen moves");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Rook moves");
    }
}


class Pawn implements ChessPlayer{
    public void moves(){
        System.out.println("Pawn moves");
    }
}