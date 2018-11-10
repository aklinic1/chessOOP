package ba.unsa.etf.rpr;

import com.sun.source.tree.WhileLoopTree;

public class Board {
    private Chesspiece [] figure = new Chesspiece[32];

    public Board() throws IllegalChessMoveException {
        int i = 0;
        char slovo = 'a';
        for(i = 0; i < 8; i++){
            figure[i] = new Pawn(Chesspiece.Color.WHITE, (char)(slovo + i) + "2");
            figure[i + 16]  = new Pawn(Chesspiece.Color.WHITE,(char)(slovo + i) + "7");
        }
        figure[i] = new Rook(Chesspiece.Color.WHITE,"a1");
        figure[i + 16] = new Rook(Chesspiece.Color.WHITE,"a8");
        i++;
        figure[i] = new Rook(Chesspiece.Color.WHITE,"h1");
        figure[i + 16] = new Rook(Chesspiece.Color.WHITE,"h8");
        i++;
        figure[i] = new Knight(Chesspiece.Color.WHITE,"b1");
        figure[i + 16] = new Knight(Chesspiece.Color.WHITE,"b8");
        i++;
        figure[i] = new Knight(Chesspiece.Color.WHITE,"g1");
        figure[i + 16] = new Knight(Chesspiece.Color.WHITE,"g8");
        i++;
        figure[i] = new Bishop(Chesspiece.Color.WHITE,"c1");
        figure[i + 16] = new Bishop(Chesspiece.Color.WHITE,"c8");
        i++;
        figure[i] = new Bishop(Chesspiece.Color.WHITE,"f1");
        figure[i + 16] = new Bishop(Chesspiece.Color.WHITE,"f8");
        i++;
        figure[i] = new Queen(Chesspiece.Color.WHITE,"d1");
        figure[i + 16] = new Queen(Chesspiece.Color.WHITE,"d8");
        i++;
        figure[i] = new King(Chesspiece.Color.WHITE,"e1");
        figure[i + 16] = new King(Chesspiece.Color.WHITE,"e8");

    }
}
