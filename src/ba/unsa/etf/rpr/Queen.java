package ba.unsa.etf.rpr;

public class Queen extends Chesspiece {

    public Queen(Color boja, String pozicija){
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
