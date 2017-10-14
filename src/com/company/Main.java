package com.company;



import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Board board=new Board();


        board.print();

        System.out.println(Board.Horizontal.D.ordinal());

        board.movePiece(Board.Horizontal.D,2, Board.Horizontal.D,4);

        board.print();
        System.out.println();

        board.movePiece(Board.Horizontal.B,7, Board.Horizontal.B,6);



        board.print();


        board.movePiece(Board.Horizontal.A,1, Board.Horizontal.H,8);
        board.print();

        board.movePiece(Board.Horizontal.A,8, Board.Horizontal.D,4);
        board.print();
    }
    }

