package day17;
/*Add a new "piece" to enum ChessPiece, which will be called EMPTY. This "piece" will represent the empty space on the
chessboard. The value of this piece is "-1", and the string notation is an underscore ("_"). Then create a Chessboard
class. This class must take a two-dimensional array of chess pieces as input in the only constructor argument. This
two-dimensional array defines the configuration of the pieces on the chessboard. The empty space on the chessboard is
specified using the EMPTY value. Also, the ChessBoard class must implement the print() method, which prints the
chessboard to the console. In the main() method of the Task2 class, create a new object of the ChessBoard class,
passing it a two-dimensional array as an argument with the arrangement of the pieces as in the picture below. Then,
using the print() method, print the chessboard to the console using string notation for the chess pieces.

The console output should look like this:
                                    ♜____♜♚_
                                    _♖__♟♟_♟
                                    ♟_♞___♟_
                                    ♛__♗____
                                    ___♝♙___
                                    ____♗♙__
                                    ♙__♕_♙_♙
                                    _____♖♔_
*/
public class Task2 {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard(new ChessPiece[][]{
                {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
                {ChessPiece.EMPTY,ChessPiece.QUEEN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.PAWN_WHITE},
                {ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.KNIGHT_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY},
                {ChessPiece.QUEEN_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_BLACK,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.QUEEN_WHITE,ChessPiece.EMPTY,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.PAWN_WHITE},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ROOK_WHITE,ChessPiece.KING_WHITE,ChessPiece.EMPTY},
        });

        chessBoard.print();
    }
}
