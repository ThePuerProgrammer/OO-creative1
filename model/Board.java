// ** This class drives the logic of chess by comparing
// ** positions of a 64 index array of characters.
// ** Based on a C++ program written by myself over the summer of 2020. 
// ** Jesse Rankins
// ** August 2020

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

    public int selectedSquare(int square) {

        Object[] temp = squares.get(square);
        String s = (String)temp[2];
        // white pieces
        if (s == wK) return 1;
        else if (s == wQ) return 2;
        else if (s == wR) return 3;
        else if (s == wB) return 4;
        else if (s == wN) return 5;
        else if (s == wP) return 6;
    
        // black pieces
        else if (s == bK) return -1;
        else if (s == bQ) return -2;
        else if (s == bR) return -3;
        else if (s == bB) return -4;
        else if (s == bN) return -5;
        else if (s == bP) return -6;
    
        return 0;
    }

    public Boolean validMove(int cur, int next) {
        int piece = selectedSquare(cur);
        switch (piece) {
            case 1: return validKMove(cur, next);
            case 2: return validQMove(cur, next);
            case 3: return validRMove(cur, next);
            case 4: return validBMove(cur, next);
            case 5: return validNMove(cur, next);
            case 6: return validPMove(cur, next);
            case -1: return validKMove(cur, next);
            case -2: return validQMove(cur, next);
            case -3: return validRMove(cur, next);
            case -4: return validBMove(cur, next);
            case -5: return validNMove(cur, next);
            case -6: return validPMove(cur, next);
            default: return false;
        }
    }

    public boolean validKMove(int cur, int next) {
        boolean kingMoved;
        boolean lRookMoved;
        boolean rRookMoved;

        // collect [file,rank,piece] for current and next square
        Object[] objNext = squares.get(next);
        char fileNext = (char)objNext[0];
        int rankNext = (int)objNext[1];
        String pieceNext = (String)objNext[2];

        Object[] objCur  = squares.get(cur);
        char fileCur = (char)objCur[0];
        int rankCur = (int)objCur[1];
        String pieceCur = (String)objCur[2];

        // if theres a white piece on the chosen square to move to
        if (selectedSquare(next) > 0 && selectedSquare(cur) > 0) return false;
        if (selectedSquare(next) < 0 && selectedSquare(cur) < 0) return false;
        // tries to wrap board
        if (isEdgeOfBoard(cur))
            if ((fileCur == 'a' && fileNext == 'h') ||
                (fileCur == 'h' && fileNext == 'a'))
                return false;
    
        if (isWhite(cur)) {
            kingMoved = wkingMoved;
            lRookMoved = wLrookMoved;
            rRookMoved = wRrookMoved;
        } else {
            kingMoved = bkingMoved;
            lRookMoved = bLrookMoved;
            rRookMoved = bRrookMoved;
        }
    
        // Castling queenside
        if ((!kingMoved && !lRookMoved) && ((cur == 4 && next == 2) ||
                                          (cur == 60 && next == 58))
            ) {
            if (next == 58) {
                for (int i = cur - 1; i > 56; --i)
                    if (selectedSquare(i) != 0)
                        return false;

                Object[] fifty6 = squares.get(56);
                String tS = (String)fifty6[2];
                Object[] fifty9 = squares.get(59);
                fifty9[2] = tS;
                squares.set(59, fifty9);
                // squares[59].second = squares[56].second; // REMNANTS OF MY C++ PROGRAM FOR REFERENCE
                fifty6[2] = " ";
                squares.set(56, fifty6);
                // squares[56].second = " ";
                posOfBK = next;
                bkingMoved = true;
                bLrookMoved = true;
                return true;
            } else {
                for (int i = cur - 1; i > 0; --i)
                    if (selectedSquare(i) != 0)
                        return false;

                Object[] zero = squares.get(0);
                String tS = (String)zero[2];
                Object[] three = squares.get(3);
                three[2] = tS;
                squares.set(3, three);
                // squares[3].second = squares[0].second;
                zero[2] = " ";
                squares.set(0, zero);
                // squares[0].second = " ";
                posOfWK = next;
                wkingMoved = true;
                wLrookMoved = true;
                return true;
            }
        } else if ((!kingMoved && !rRookMoved) && ((cur == 4 && next == 6) ||
                                                 (cur == 60 && next == 62))
            ) { // Castling Kingside
            if (next == 62) {
                for (int i = cur + 1; i < 63; ++i)
                    if (selectedSquare(i) != 0)
                        return false;

                Object[] sixty3 = squares.get(63);
                String tS = (String)sixty3[2];
                Object[] sixty1 = squares.get(61);
                sixty1[2] = tS;
                squares.set(61, sixty1);
                // squares[61].second = squares[63].second;
                sixty3[2] = " ";
                squares.set(63, sixty3);
                // squares[63].second = " ";
                posOfBK = next;
                bkingMoved = true;
                bRrookMoved = true;
                return true;
            } else {
                for (int i = cur + 1; i < 7; ++i)
                    if (selectedSquare(i) != 0)
                        return false;

                Object[] seven = squares.get(7);
                String tS = (String)seven[2];
                Object[] five = squares.get(5);
                five[2] = tS;
                squares.set(5, five);
                // squares[5].second = squares[7].second;
                seven[2] = " ";
                squares.set(7, seven);
                // squares[7].second = " ";
                posOfWK = next;
                wkingMoved = true;
                wRrookMoved = true;
                return true;
            }
        } else if ((kingMoved || lRookMoved) && ((cur == 4 && next == 2) ||
                                          (cur == 60 && next == 58))
            ) {
                return false;
        } else if ((kingMoved || rRookMoved) && ((cur == 4 && next == 6) ||
                                                 (cur == 60 && next == 62))
            ) {
                return false;
        }
    
        // singe direction allowed for king
        if (next != cur + 1 && next != cur - 1 && next != cur + 7 &&
            next != cur + 8 && next != cur + 9 && next != cur - 9 &&
            next != cur - 8 && next != cur - 7)
            return false;
    
        if (isWhite(cur)) {
            posOfWK = next;
            wkingMoved = true;
        } else {
            posOfBK = next;
            bkingMoved = true;
        }
        return true;
    }

    public boolean validQMove(int cur, int next) {
        // if theres a piece of same color on the chosen square to move to
        if (selectedSquare(next) < 0 && selectedSquare(cur) < 0) return false;
        if (selectedSquare(next) > 0 && selectedSquare(cur) > 0) return false;
    
        // figure out distance between squares
        int dif = java.lang.Math.abs(next - cur);
        // check for piece in between move
        // and cover directionality
        // moving diagonally positive slope
        if (dif % 9 == 0) {
            // top right
            if (next > cur) {
                for (int i = cur + 9; i < next; i += 9)
                    if (selectedSquare(i) != 0) return false;
            } else { // bottom left
                for (int i = cur - 9; i > next; i -= 9)
                    if (selectedSquare(i) != 0) return false;
            }
        } else if (dif % 7 == 0) { // diagonally negative slope
            // top left
            if (next > cur) {
                for (int i = cur + 7; i < next; i += 7)
                    if (selectedSquare(i) != 0) return false;
            } else { // bottom right
                for (int i = cur - 7; i > next; i -= 7)
                    if (selectedSquare(i) != 0) return false;
            }
        } else if (dif % 8 == 0) { // vertical
            // above
            if (next > cur) {
                for (int i = cur + 8; i < next; i += 8)
                    if (selectedSquare(i) != 0) return false;
            } else { // below
                for (int i = cur - 8; i > next; i -= 8)
                    if (selectedSquare(i) != 0) return false;
            }
        } else if (dif > 9) {
            return false;
        } else {
            // right
            if (next > cur) {
                for (int i = cur + 1; i < next; ++i) {
                    if (selectedSquare(i) != 0) return false;
                    if  (isEdgeOfBoard(i)) return false;
                }
            } else { // left
                for (int i = cur - 1; i > next; --i) {
                    if (selectedSquare(i) != 0) return false;
                    if  (isEdgeOfBoard(i)) return false;
                }
            }
        }
        return true;
    }

    public boolean validRMove(int cur, int next) {
        // if theres a piece of same color on the chosen square to move to
        if (selectedSquare(next) < 0 && selectedSquare(cur) < 0) return false;
        if (selectedSquare(next) > 0 && selectedSquare(cur) > 0) return false;
    
        int dif = java.lang.Math.abs(cur - next);
        if (dif % 8 != 0 && dif > 7) {
            return false;
        } else if (dif % 8 == 0) {
            if (next > cur) {
                for (int i = cur + 8; i < next; i += 8)
                    if (selectedSquare(i) != 0) return false;
            } else {
                for (int i = cur - 8; i > next; i -= 8)
                    if (selectedSquare(i) != 0) return false;
            } 
        } else {
            // right
            if (next > cur) {
                for (int i = cur + 1; i < next; ++i) {
                    if (selectedSquare(i) != 0) return false;
                    if  (isEdgeOfBoard(i)) return false;
                }
            } else { // left
                for (int i = cur - 1; i > next; --i) {
                    if (selectedSquare(i) != 0) return false;
                    if  (isEdgeOfBoard(i)) return false;
                }
            }
        }
        if (cur == 0) wLrookMoved = true;
        else if (cur == 7) wRrookMoved = true;
        else if (cur == 56) bLrookMoved = true;
        else if (cur == 63) bRrookMoved = true;
        return true;
    }

    public boolean validBMove(int cur, int next) {
        if (selectedSquare(next) < 0 && selectedSquare(cur) < 0) return false;
        if (selectedSquare(next) > 0 && selectedSquare(cur) > 0) return false;
    
        int dif = java.lang.Math.abs(cur - next);
        // checks for diagonal movement
        if (dif % 7 != 0 && dif % 9 != 0) return false;
    
        // checks for piece in path of movement
        if (dif % 7 == 0) {
            if (next > cur) {
                for (int i = cur + 7; i < next; i += 7)
                    if (selectedSquare(i) != 0) return false;
            } else {
                for (int i = cur - 7; i > next; i -= 7)
                    if (selectedSquare(i) != 0) return false;
            }
        } else {
            if (next > cur) {
                for (int i = cur + 9; i < next; i += 9)
                    if (selectedSquare(i) != 0) return false;
            } else {
                for (int i = cur - 9; i > next; i -= 9)
                    if (selectedSquare(i) != 0) return false;
            }
        }
        return true;
    }

    public boolean validNMove(int cur, int next) {
        // if theres a piece of same color on the chosen square to move to
        if (selectedSquare(next) < 0 && selectedSquare(cur) < 0) return false;
        if (selectedSquare(next) > 0 && selectedSquare(cur) > 0) return false;
    
        int dif = java.lang.Math.abs(cur - next);
        // the only possible moves for a knight
        if (dif != 6 && dif != 10 && dif != 15 && dif != 17) return false;
        
        Object[] objNext = squares.get(next);
        char fileNext = (char)objNext[0];

        Object[] objCur  = squares.get(cur);
        char fileCur = (char)objCur[0];

        if ((fileCur == 'b' && fileNext == 'h') ||
            (fileCur == 'a' && fileNext > 'c')  ||
            (fileCur == 'g' && fileNext == 'a') ||
            (fileCur == 'h' && fileNext < 'f'))
            return false;
    
        return true;
    }

    public boolean validPMove(int cur, int next) {
        // if theres a piece of same color on the chosen square to move to
        if (selectedSquare(next) < 0 && selectedSquare(cur) < 0) return false;
        if (selectedSquare(next) > 0 && selectedSquare(cur) > 0) return false;
    
        // cant go back
        if (selectedSquare(cur) > 0) {
            if (next < cur) return false;
        } else {
            if (next > cur) return false;
        }
    
        // find int distance between squares
        int dif = java.lang.Math.abs(cur - next);
        // quickly rule out any invalid move
        if (dif != 7 && dif != 8 && dif != 9 && dif != 16) return false;

        // edges of board, wrapping is false
        Object[] objNext = squares.get(next);
        char fileNext = (char)objNext[0];

        Object[] objCur  = squares.get(cur);
        char fileCur = (char)objCur[0];

        if ((fileCur == 'a' && fileNext == 'h') ||
            (fileCur == 'h' && fileNext == 'a'))
            return false;
        // can ony move diagonally to capture
        if ((dif == 7 || dif == 9) && selectedSquare(next) == 0) return false;
        // can only move two squares on first move
        if (isWhite(cur)) {
            if (dif == 16 && (cur > 15 || selectedSquare(next) != 0)) return false;
        } else {
            if (dif == 16 && (cur < 48 || selectedSquare(next) != 0)) return false;
        }
        // cant capture vertically 
        if (dif == 8 && selectedSquare(next) != 0) return false; 
        return true;
    }

    public boolean isEdgeOfBoard(int square) {
        return square == 0 || square == 7 || square == 8 || square == 15 ||
               square == 16 || square == 23 || square == 24 || square == 31 ||
               square == 32 || square == 39 || square == 40 || square == 47 ||
               square == 48 || square == 55 || square == 56 || square == 63;
    }

    public int notationToInteger(String s) {
        String square = s.toLowerCase(); 

        
        if (square.charAt(0) == 'a') {
            if (square == "a1") return 0;
            else if (square == "a2") return 8;
            else if (square == "a3") return 16;
            else if (square == "a4") return 24;
            else if (square == "a5") return 32;
            else if (square == "a6") return 40;
            else if (square == "a7") return 48;
            else if (square == "a8") return 56;
        } else if (square.charAt(0) == 'b') {
            if (square == "b1") return 1;
            else if (square == "b2") return 9;
            else if (square == "b3") return 17;
            else if (square == "b4") return 25;
            else if (square == "b5") return 33;
            else if (square == "b6") return 41;
            else if (square == "b7") return 49;
            else if (square == "b8") return 57;
        } else if (square.charAt(0) == 'c') {
            if (square == "c1") return 2;
            else if (square == "c2") return 10;
            else if (square == "c3") return 18;
            else if (square == "c4") return 26;
            else if (square == "c5") return 34;
            else if (square == "c6") return 42;
            else if (square == "c7") return 50;
            else if (square == "c8") return 58;
        } else if (square.charAt(0) == 'd') {
            if (square == "d1") return 3;
            else if (square == "d2") return 11;
            else if (square == "d3") return 19;
            else if (square == "d4") return 27;
            else if (square == "d5") return 35;
            else if (square == "d6") return 43;
            else if (square == "d7") return 51;
            else if (square == "d8") return 59;
        } else if (square.charAt(0) == 'e') {
            if (square == "e1") return 4;
            else if (square == "e2") return 12;
            else if (square == "e3") return 20;
            else if (square == "e4") return 28;
            else if (square == "e5") return 36;
            else if (square == "e6") return 44;
            else if (square == "e7") return 52;
            else if (square == "e8") return 60;
        } else if (square.charAt(0) == 'f') {
            if (square == "f1") return 5;
            else if (square == "f2") return 13;
            else if (square == "f3") return 21;
            else if (square == "f4") return 29;
            else if (square == "f5") return 37;
            else if (square == "f6") return 45;
            else if (square == "f7") return 53;
            else if (square == "f8") return 61;
        } else if (square.charAt(0) == 'g') {
            if (square == "g1") return 6;
            else if (square == "g2") return 14;
            else if (square == "g3") return 22;
            else if (square == "g4") return 30;
            else if (square == "g5") return 38;
            else if (square == "g6") return 46;
            else if (square == "g7") return 54;
            else if (square == "g8") return 62;
        } else if (square.charAt(0) == 'h') {
            if (square == "h1") return 7;
            else if (square == "h2") return 15;
            else if (square == "h3") return 23;
            else if (square == "h4") return 31;
            else if (square == "h5") return 39;
            else if (square == "h6") return 47;
            else if (square == "h7") return 55;
            else if (square == "h8") return 63;
        }
    
        return -1;
    }

    public boolean isWhite(int square) {
        Object[] temp = squares.get(square);
        String s = (String)temp[2];
        return s == wR || s == wN || s == wB || s == wQ || s == wK || s == wP;
    }

    public boolean isBlack(int square) {
        Object[] temp = squares.get(square);
        String s = (String)temp[2];
        return s == bR || s == bN || s == bB || s == bQ || s == bK || s == bP;
    }
}