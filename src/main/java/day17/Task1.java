package day17;

import java.io.Console;
import java.util.Arrays;

/*Create an Enum "ChessPiece". In total there are 6 different chess pieces: king, queen, rook, bishop, knight and pawn.
    In our program, each chess piece has the following characteristics:
 - Figure value - real number;
 - String designation of a figure
    In our enumeration, you need to create 12 figures - 6 white and 6 black. The names of the figures in the enumeration
should look like this:
KING_WHITE, KING_BLACK, QUEEN_WHITE, QUEEN_BLACK, ect.
    Each figure must have two characteristics - its value and string designation.
    The values of chess pieces are shown in the table:
    Pawn        1
    Knight      3
    Bishop      3.5
    Rook        5
    Queen       9
    King        10

    Using the generated enum, in the main() method of the Task1 class, create an array containing 4 white pawns and
4 black rooks. Print the contents of this array to the screen using string notation for chess pieces.

    The console output should be like this:
    ♙ ♙ ♙ ♙ ♜ ♜ ♜ ♜
*/
public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] array = new ChessPiece[]{
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK,
        };

        for (ChessPiece chessPiece : array) {
            System.out.print(chessPiece.getDesignation()+" ");
        }
    }
}