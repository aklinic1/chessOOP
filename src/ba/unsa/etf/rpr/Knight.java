package ba.unsa.etf.rpr;

public class Knight extends Chesspiece{

    public Knight(Color boja, String pozicija){
        super(boja,pozicija);
    }
    @Override
    public String getPosition(){
        return pozicija;
    }

    @Override
    public Color getColor(){
        return boja;
    }
}
