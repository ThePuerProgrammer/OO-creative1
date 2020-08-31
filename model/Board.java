// ** This class drives the logic of chess by comparing ** //
// ** positions of a 64 index array of characters and   ** //
// ** keeping track of the math

package model;

import java.util.ArrayList;

public class Board {

    ArrayList<String> whiteCaptured = new ArrayList<String>();
    ArrayList<String> blackCaptured = new ArrayList<String>();
    ArrayList<Object[]> squares = new ArrayList<Object[]>();    

    Boolean kingInCheck = false;
    Boolean checkmate = false;
    Boolean wRrookMoved = false;
    Boolean wLrookMoved = false;
    Boolean wkingMoved = false;
    Boolean bRrookMoved = false;
    Boolean bLrookMoved = false;
    Boolean bkingMoved = false;

    int posOfWK = 4;
    int posOfBK = 60;

    String wK = "♔"; // ♖♘♗♕♔♙
    String wQ = "♕";
    String wR = "♖";
    String wB = "♗";
    String wN = "♘";
    String wP = "♙";
    String bK = "♚"; // ♟♜♞♝♛♚
    String bQ = "♛";
    String bR = "♜";
    String bB = "♝";
    String bN = "♞";
    String bP = "♟";

    public Board() {
    
        int[] rank = new int[8];
        for (int i = 0; i < 9; ++i)
            rank[i] = i + 1;
    
        char[] file = new char[8];
        file[0] = 'a';
        file[1] = 'b';
        file[2] = 'c';
        file[3] = 'd';
        file[4] = 'e';
        file[5] = 'f';
        file[6] = 'g';
        file[7] = 'h';
    
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                String s = "";
                if (i == 0) {
                    if (j == 0 || j == 7) {
                        s = wR;
                    } else if (j == 1 || j == 6) {
                        s = wN;
                    } else if (j == 2 || j == 5) {
                        s = wB;
                    } else if (j == 3) {
                        s = wQ;
                    } else {
                        s = wK;
                    }
                } else if (i == 1) {
                    s = wP;
                } else if (i == 6) {
                    s = bP;
                } else if (i == 7) {
                    if (j == 0 || j == 7) {
                        s = bR;
                    } else if (j == 1 || j == 6) {
                        s = bN;
                    } else if (j ==2 || j == 5) {
                        s = bB;
                    } else if (j == 3) {
                        s = bQ;
                    } else {
                        s = bK;
                    }
                } else {
                    s = " ";
                }

                // char, int
                Object[] fileRankPiece = new Object[3];
                
                fileRankPiece[0] = file[j];
                fileRankPiece[1] = rank[i];
                fileRankPiece[2] = s;

                squares.add(fileRankPiece);
            }
        }
    } // Board()

    public void whiteCap(String s) {
        if (s == " ") return;
        else whiteCaptured.add(s);
    } // whiteCap()

    public void blackCap(String s) {
        if (s == " ") return;
        else blackCaptured.add(s);
    } // blackCap()

    public Object[] getSquare(int n) {
        return squares.get(n);
    }

    public void update_board(int current, int next) {

        // get [file, rank, piece] from ArrayList squares
        Object[] currentSquare = squares.get(current);
        Object[] nextSquare = squares.get(next);

        // take piece from current square and put in next square
        nextSquare[2] = currentSquare[2];

        // empty piece from current square
        currentSquare[2] = " ";

        // replace updated Object[file, rank, piece] into ArrayList squares
        squares.set(next, nextSquare);
        squares.set(current, currentSquare);
    }

    public int positionOfKing(Boolean isWhite) {
        String kingColor = isWhite ? wK : bK;
        for (int i = 0; i < 64; ++i) {
            Object[] temp = squares.get(i);
            if (temp[2] == kingColor)
                return i;
        }
        return 0;
    }

}