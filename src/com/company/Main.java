package com.company;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Board board = new Board();

        boolean gameon = true;
        while (gameon) {
            Board.Horizontal pc = Board.Horizontal.valueOf(scan.nextLine());
            if(pc.toString() == "exit")
            {
                gameon  = false;
                continue;
            }

            int pi = Integer.parseInt(scan.nextLine());

            Board.Horizontal mc = Board.Horizontal.valueOf(scan.nextLine());

            int mi =  Integer.parseInt(scan.nextLine());

            board.movePiece(pc,pi, mc,mi);
            board.print();
        }


        board.print();

        board.movePiece(Board.Horizontal.D, 2, Board.Horizontal.D, 4);

        board.print();


    }
}

