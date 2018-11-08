package ba.unsa.etf.rpr;


public abstract class Chesspiece {
    public enum Color {BLACK, WHITE};
    protected Color boja;
    protected String pozicija;

    public Chesspiece(Color boja, String pozicija){
        this.boja = boja;
        this.pozicija = pozicija;
    }
    public abstract String getPosition();

    public abstract Color getColor();

    public abstract void move(String position);

}
