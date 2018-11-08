package ba.unsa.etf.rpr;

public class Bishop extends Chesspiece {

    public Bishop(Color boja, String pozicija){
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
