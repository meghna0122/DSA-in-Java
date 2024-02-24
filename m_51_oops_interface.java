public class m_51_oops_interface {
    public static void main(String[] args) {
        queen q =new queen();
        q.moves();
        
    }
}

interface chessplayer{
    void moves();
}
class queen implements chessplayer{
    public void moves(){
System.out.println("up,down,left,right,diagnol");
    }
}

class rook implements chessplayer{
    public void moves(){
System.out.println("up,down,left,right");
    }
}

class king implements chessplayer{
    public void moves(){
System.out.println("up,down,left,right,diagnol by 1 place");
    }
}