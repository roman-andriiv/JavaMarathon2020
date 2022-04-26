package day17;

public enum ChessPiece {
    KING_WHITE("♔",10),
    QUEEN_WHITE("♕",9),
    ROOK_WHITE("♖", 5),
    BISHOP_WHITE("♗",3.5),
    KNIGHT_WHITE("♘",3),
    PAWN_WHITE("♙",1),

    KING_BLACK("♚", 10),
    QUEEN_BLACK("♛", 9),
    ROOK_BLACK("♜",5),
    BISHOP_BLACK("♝",3.5),
    KNIGHT_BLACK("♞",3),
    PAWN_BLACK("♟",1);

    private String designation;
    private double value;

    ChessPiece(String designation, double value) {
        this.designation = designation;
        this.value = value;
    }

    public String getDesignation() {
        return designation;
    }

    public double getValue() {
        return value;
    }
}
