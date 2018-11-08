package ba.unsa.etf.rpr;

public class King extends Chesspiece{

    public King(Color boja, String pozicija){
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
