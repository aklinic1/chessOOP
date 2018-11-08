package ba.unsa.etf.rpr;

public class Rook extends Chesspiece{

    public Rook(Color boja, String pozicija){
        super(boja,pozicija);
    }
    @Override
    public String getPosition(){
        return boja;
    }

    @Override
    public Color getColor() {
        return boja;
    }
}
