package com.company;


import java.util.Objects;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Board board = new Board();
        String ruta;
        board.print();
        ruta = "A1";

        boolean gameOn = true;
        while (gameOn) {
            ruta = scan.nextLine();
            Board.Horizontal pc = Board.Horizontal.valueOf(String.valueOf(ruta.toUpperCase().charAt(0)));
            if (Objects.equals(pc.toString(), "exit")) {
                gameOn = false;
                continue;
            }

            int pi = Integer.parseInt(String.valueOf(ruta.charAt(1)));

            ruta = scan.nextLine();
            Board.Horizontal mc = Board.Horizontal.valueOf(String.valueOf(ruta.toUpperCase().charAt(0)));

            int mi = Integer.parseInt(String.valueOf(ruta.charAt(1)));

            board.movePiece(pc, pi, mc, mi);
            board.print();
        }


    }
}

