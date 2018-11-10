package ba.unsa.etf.rpr;


public abstract class ChessPiece {
    public enum Color {BLACK, WHITE};
    protected Color boja;
    protected String pozicija;

    public ChessPiece(Color boja, String pozicija) throws IllegalChessMoveException{
        this.boja = boja;
        this.pozicija = pozicija;
    };
    public boolean provjeriPoziciju(String pozicija){

        if(pozicija.length() > 2) return false;

        int broj = pozicija.charAt(1) - '0';
        if(broj < 1 || broj > 8) {

            return false;
        }
        char slovo = pozicija.charAt(0);
        if(((int)slovo < 65 || (int)slovo > 72) || ((int)slovo < 97 || (int)slovo > 104 )) {
            return false;
        }

        return true;
    }
    public abstract String getPosition();

    public abstract Color getColor();

    public abstract void move(String position) throws IllegalChessMoveException;

}
