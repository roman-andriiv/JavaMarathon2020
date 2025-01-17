package day17;

import java.util.Arrays;

public class ChessBoard {
    private ChessPiece[][] chessBoard;

    public ChessBoard(ChessPiece[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public void print(){
        for (int i = 0; i < chessBoard.length ; i++) {
            for (int j = 0; j <chessBoard.length ; j++) {
                System.out.print(chessBoard[i][j].getDesignation());
            }
            System.out.println();
        }
    }
}
