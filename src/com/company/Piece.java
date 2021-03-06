package com.company;

public abstract class Piece {
    public enum Color {
        BLACK, WHITE
    }

    public enum PieceType {
        PAWN,
        KNIGHT,
        BISHOP,
        ROOK,
        QUEEN,
        KING
    }

    private Color color = Color.WHITE;


    int moveNum = 0;

    boolean alive;

    Piece() {

    }

    Piece(Color color) {

        this.color = color;

    }

    String print() {
        return color.toString().substring(0, 1) + this.getClass().getSimpleName().substring(0, 1) + "|";
    }
}
