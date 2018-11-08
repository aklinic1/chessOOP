package ba.unsa.etf.rpr;

public class Pawn extends Chesspiece {

    public Pawn(Color boja, String pozicija){
        super(boja,pozicija);
    }
    @Override
    public String getPosition(){
        return pozicija;
    }

    @Override
    public Color getColor() {
        return boja;
    }
}
