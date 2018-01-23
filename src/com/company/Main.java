package com.company;


import java.util.Objects;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Board board = new Board();
        String square;
        boolean gameOn = true;


        board.print();
        while (gameOn) {
            square = scan.nextLine();
            Board.Horizontal pc = Board.Horizontal.valueOf(String.valueOf(square.toUpperCase().charAt(0)));

            if (square.equalsIgnoreCase("exit")) {
                gameOn = false;
                continue;
            }

            int pi = Integer.parseInt(String.valueOf(square.charAt(1)));

            square = scan.nextLine();
            Board.Horizontal mc = Board.Horizontal.valueOf(String.valueOf(square.toUpperCase().charAt(0)));

            int mi = Integer.parseInt(String.valueOf(square.charAt(1)));

            board.movePiece(pc, pi, mc, mi);
            System.out.flush();
            board.print();
        }


    }
}

