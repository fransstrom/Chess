package com.company;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.TerminalSize;

import com.company.Piece.Color;


import java.io.Console;
import java.util.Scanner;


public class Board {
    Scanner scan = new Scanner(System.in);
    String valLe = "";
    String moLe="";

    public enum Horizontal {
        A, B, C, D, E, F, G, H
    }

    Piece[][] board;

    Board() {
        board = new Piece[][]{
                new Piece[]{
                        new Rook(Color.WHITE), new Knight(Color.WHITE), new Bishop(Color.WHITE), new Queen(Color.WHITE), new King(Color.WHITE),
                        new Bishop(Color.WHITE), new King(Color.WHITE), new Rook(Color.WHITE)},
                new Piece[]{
                        new Pawn(Color.WHITE), new Pawn(Color.WHITE), new Pawn(Color.WHITE), new Pawn(Color.WHITE), new Pawn(Color.WHITE),
                        new Pawn(Color.WHITE), new Pawn(Color.WHITE), new Pawn(Color.WHITE)},
                new Piece[8],
                new Piece[8],
                new Piece[8],
                new Piece[8],
                new Piece[]{
                        new Pawn(Color.BLACK), new Pawn(Color.BLACK), new Pawn(Color.BLACK), new Pawn(Color.BLACK), new Pawn(Color.BLACK),
                        new Pawn(Color.BLACK), new Pawn(Color.BLACK), new Pawn(Color.BLACK)},
                new Piece[]{
                        new Rook(Color.BLACK), new Knight(Color.BLACK), new Bishop(Color.BLACK), new Queen(Color.BLACK), new King(Color.BLACK),
                        new Bishop(Color.BLACK), new King(Color.BLACK), new Rook(Color.BLACK)},
        };


    }

    public void print() {

        System.out.println(" |A |B |C |D |E |F |G |H |");
        for (int i = 0; i < board.length; i++) {
            String row = (i + 1) + "|";
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == null) {
                    row += "__|";
                    continue;
                }

                row += board[i][j].print();

            }
            System.out.println(row);
        }
        System.out.println();
    }

    public void movePiece(Horizontal pc, int pi, Horizontal mc, int mi) {




        board[mi - 1][mc.ordinal()] = board[pi - 1][pc.ordinal()];
        board[pi - 1][pc.ordinal()] = null;


    }

}
