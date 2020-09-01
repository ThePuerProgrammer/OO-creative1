// ** This class drives the logic of chess by comparing
// ** positions of a 64 index array of characters.
// ** Based on a C++ program written by myself over the summer of 2020. 
// ** Jesse Rankins
// ** August 2020

package model;

import java.util.ArrayList;

public class Board {

    static ArrayList<String> whiteCaptured = new ArrayList<String>();
    static ArrayList<String> blackCaptured = new ArrayList<String>();
    static ArrayList<Object[]> squares = new ArrayList<Object[]>();    
    static ArrayList<Integer> posOfAttackers = new ArrayList<Integer>();
    static ArrayList<Integer> activeWhite = new ArrayList<Integer>();
    static ArrayList<Integer> activeBlack = new ArrayList<Integer>();

    static Boolean kingInCheck = false;
    static Boolean checkmate = false;
    static Boolean wRrookMoved = false;
    static Boolean wLrookMoved = false;
    static Boolean wkingMoved = false;
    static Boolean bRrookMoved = false;
    static Boolean bLrookMoved = false;
    static Boolean bkingMoved = false;
    static boolean wKingside = false;
    static boolean bKingside = false;
    static boolean wQueenside = false;
    static boolean bQueenside = false;

    static int posOfWK = 4;
    static int posOfBK = 60;

    static String wK = "♔"; // ♖♘♗♕♔♙
    static String wQ = "♕";
    static String wR = "♖";
    static String wB = "♗";
    static String wN = "♘";
    static String wP = "♙";
    static String bK = "♚"; // ♟♜♞♝♛♚
    static String bQ = "♛";
    static String bR = "♜";
    static String bB = "♝";
    static String bN = "♞";
    static String bP = "♟";

    public Board() {
    
        int[] rank = new int[9];
        for (int i = 0; i < 9; i++)
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

    static public void whiteCap(String s) {
        if (s == " ") return;
        else whiteCaptured.add(s);
    } // whiteCap()

    static public void blackCap(String s) {
        if (s == " ") return;
        else blackCaptured.add(s);
    } // blackCap()

    static public Object[] getSquare(int n) {
        return squares.get(n);
    }

    static public void updateBoard(int current, int next) {

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

    static public int positionOfKing(Boolean isWhite) {
        String kingColor = isWhite ? wK : bK;
        for (int i = 0; i < 64; ++i) {
            Object[] temp = squares.get(i);
            if (temp[2] == kingColor)
                return i;
        }
        return 0;
    }

    static public int selectedSquare(int square) {

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

    static public Boolean validMove(int cur, int next) {
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

    static public boolean validKMove(int cur, int next) {
        boolean kingMoved;
        boolean lRookMoved;
        boolean rRookMoved;

        // collect [file,rank,piece] for current and next square
        Object[] objNext = squares.get(next);
        char fileNext = (char)objNext[0];

        Object[] objCur  = squares.get(cur);
        char fileCur = (char)objCur[0];

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
                bQueenside = true;
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
                wQueenside = true;
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
                bKingside = true;
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
                wKingside = true;
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

    static public boolean validQMove(int cur, int next) {
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

    static public boolean validRMove(int cur, int next) {
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

    static public boolean validBMove(int cur, int next) {
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

    static public boolean validNMove(int cur, int next) {
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

    static public boolean validPMove(int cur, int next) {
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

    static public boolean isEdgeOfBoard(int square) {
        return square == 0 || square == 7 || square == 8 || square == 15 ||
               square == 16 || square == 23 || square == 24 || square == 31 ||
               square == 32 || square == 39 || square == 40 || square == 47 ||
               square == 48 || square == 55 || square == 56 || square == 63;
    }

    // returns true if k in check (can be used when moving K, hense "next"
    // or when attacking K)
    static public boolean kInCheck(int king) {
        boolean check = false;
        String K;
        String Q;
        String R;
        String B;
        String N;
        String P;
        String eK;
        String eQ;
        String eR;
        String eB;
        String eN;
        String eP;

        // make universal for black and white. 
        // white king
        if (selectedSquare(king) > 0) {
            K = wK;
            Q = wQ;
            R = wR;
            B = wB;
            N = wN;
            P = wP;
            eK = bK;
            eQ = bQ;
            eR = bR;
            eB = bB;
            eN = bN;
            eP = bP;
        } else if (selectedSquare(king) < 0){ // king is black
            K = bK;
            Q = bQ;
            R = bR;
            B = bB;
            N = bN;
            P = bP;
            eK = wK;
            eQ = wQ;
            eR = wR;
            eB = wB;
            eN = wN;
            eP = wP;
        } else { // king not on square
            System.out.println("King not found in pos.");
            return false;
        }

        // the knight conditions controlling for board wraps
        Object[] kingObject = squares.get(king);
        char c = (char)kingObject[0];
        int i = (int)kingObject[1];
        String s = (String)kingObject[2];

        if (c == 'a') {
            // if king is on A file
            // no left side knight attacks possible
            // if value is valid board position and contains a knight. simple
            if (king - 15 >= 0) if (squares.get(king - 15)[2] == eN) {
                check = true;
                posOfAttackers.add(king - 15);
            }
            if (king -  6 >= 0) if (squares.get(king - 6)[2] == eN) {
                check = true;
                posOfAttackers.add(king - 6);
            }
            if (king + 10 < 64) if (squares.get(king + 10)[2] == eN) {
                check = true;
                posOfAttackers.add(king + 10);
            }
            if (king + 17 < 64) if (squares.get(king + 17)[2] == eN) {
                check = true;
                posOfAttackers.add(king + 17);
            }
        } else if (c == 'b') { 
            // king on B file
            if (king - 15 >= 0) if (squares.get(king - 15)[2] == eN) {
                check = true;
                posOfAttackers.add(king - 15);
            }
            if (king -  6 >= 0) if (squares.get(king - 6)[2] == eN) {
                check = true;
                posOfAttackers.add(king - 6);
            }
            if (king + 10 < 64) if (squares.get(king + 10)[2] == eN) {
                check = true;
                posOfAttackers.add(king + 10);
            }
            if (king + 17 < 64) if (squares.get(king + 17)[2] == eN) {
                check = true;
                posOfAttackers.add(king + 17);
            }

            if (king - 17 >= 0) if (squares.get(king - 17)[2] == eN) {
                check = true;
                posOfAttackers.add(king - 17);
            }
            if (king + 15 < 64) if (squares.get(king + 15)[2] == eN) {
                check = true;
                posOfAttackers.add(king + 15);
            }
        } else if (c == 'h') {
            // no right side knight attacks possible
            if (king - 17 >= 0) if (squares.get(king - 17)[2] == eN) {
                check = true;
                posOfAttackers.add(king - 17);
            }
            if (king - 10 >= 0) if (squares.get(king - 10)[2] == eN) {
                check = true;
                posOfAttackers.add(king - 10);
            }
            if (king +  6 < 64) if (squares.get(king + 6)[2] == eN) {
                check = true;
                posOfAttackers.add(king + 6);
            }
            if (king + 15 < 64) if (squares.get(king + 15)[2] == eN) {
                check = true;
                posOfAttackers.add(king + 15);
            }
        } else if (c == 'g') { 
            // king on G file
            if (king - 17 >= 0) if (squares.get(king - 17)[2] == eN) {
                check = true;
                posOfAttackers.add(king - 17);
            }
            if (king - 10 >= 0) if (squares.get(king - 10)[2] == eN) {
                check = true;
                posOfAttackers.add(king - 10);
            }
            if (king +  6 < 64) if (squares.get(king + 6)[2] == eN) {
                check = true;
                posOfAttackers.add(king + 6);
            }
            if (king + 15 < 64) if (squares.get(king + 15)[2] == eN) {
                check = true;
                posOfAttackers.add(king + 15);
            }
            if (king - 15 >= 0) if (squares.get(king - 15)[2] == eN) {
                check = true;
                posOfAttackers.add(king - 15);
            }
            if (king + 17 < 64) if (squares.get(king + 17)[2] == eN) {
                check = true;
                posOfAttackers.add(king + 17);
            }
        } else {
            if (king - 15 >= 0) if (squares.get(king - 15)[2] == eN) {
                check = true;
                posOfAttackers.add(king - 15);
            }
            if (king -  6 >= 0) if (squares.get(king - 6)[2] == eN) {
                check = true;
                posOfAttackers.add(king - 6);
            }
            if (king + 10 < 64) if (squares.get(king + 10)[2] == eN) {
                check = true;
                posOfAttackers.add(king + 10);
            }
            if (king + 17 < 64) if (squares.get(king + 17)[2] == eN) {
                check = true;
                posOfAttackers.add(king + 17);
            }
            if (king - 17 >= 0) if (squares.get(king - 17)[2] == eN) {
                check = true;
                posOfAttackers.add(king - 17);
            }
            if (king - 10 >= 0) if (squares.get(king - 10)[2] == eN) {
                check = true;
                posOfAttackers.add(king - 10);
            }
            if (king +  6 < 64) if (squares.get(king + 6)[2] == eN) {
                check = true;
                posOfAttackers.add(king + 6);
            }
            if (king + 15 < 64) if (squares.get(king + 15)[2] == eN) {
                check = true;
                posOfAttackers.add(king + 15);
            }
        }

        int temp = king + 1;
        int searchLength = 0;

        String sTemp = " ";

        // in check from the right
        while (!isEdgeOfBoard(temp - 1) && temp < 64) {
            sTemp = (String)squares.get(temp)[2]; 
            ++searchLength;
            // square has white piece in path or non-attacking black piece
            if (sTemp == K || sTemp == Q || 
                sTemp == R || sTemp == B ||
                sTemp == N || sTemp == P ||
                sTemp == eP || sTemp == eN ||
                sTemp == eB) 
                break;
            if (sTemp == eQ || sTemp == eR) {
                check = true;
                posOfAttackers.add(temp);
            }
            if (searchLength == 1 && sTemp == eK) {
                check = true;
                posOfAttackers.add(temp);
            }
            ++temp;
        }

        searchLength = 0;
        temp = king + 9;

        // in check from top-right-diagonal
        while ((!isEdgeOfBoard(temp - 1) ||
                isEdgeOfBoard(king)) && temp < 64) {
            sTemp = (String)squares.get(temp)[2];
            ++searchLength;
            if (sTemp == K || sTemp == Q || 
                sTemp == R || sTemp == B ||
                sTemp == N || sTemp == P ||
                sTemp == eR || sTemp == eN)
                break;
            if (sTemp == eQ || sTemp == eB) {
                posOfAttackers.add(temp);
                check = true;
            }
            if (searchLength == 1 && 
            (sTemp == eK || sTemp == eP)) {
                posOfAttackers.add(temp);
                check = true; 
            }
            temp += 9;
        }

        // in check from above
        searchLength = 0;
        temp = king + 8;

        while (temp < 64) {
            sTemp = (String)squares.get(temp)[2];
            ++searchLength;
            if (sTemp == K || sTemp == Q || 
                sTemp == R || sTemp == B ||
                sTemp == N || sTemp == P ||
                sTemp == eP || sTemp == eN ||
                sTemp == eB)
                break;
            if (sTemp == eQ || sTemp == eR) {
                posOfAttackers.add(temp);
                check = true;
            }
            if (searchLength == 1 && sTemp == eK) {
                posOfAttackers.add(temp);
                check = true; 
            }
            temp += 8;
        }

        searchLength = 0;
        temp = king + 7;

        // in check from top-left-diagonal
        while ((!isEdgeOfBoard(temp + 1) ||
                isEdgeOfBoard(king)) && temp < 64) {
            sTemp = (String)squares.get(temp)[2];
            ++searchLength;
            if (sTemp == K || sTemp == Q || 
                sTemp == R || sTemp == B ||
                sTemp == N || sTemp == P || 
                sTemp == eR || sTemp == eN)
                break;
            if (sTemp == eQ || sTemp == eB) {
                posOfAttackers.add(temp);
                check = true;
            }
            if (searchLength == 1 && 
            (sTemp == eK || sTemp == eP)) {
                posOfAttackers.add(temp);
                check = true; 
            }
            temp += 7;
        }

        searchLength = 0;
        temp = king - 1;

        // in check from the left
        while (!isEdgeOfBoard(temp + 1) && temp >= 0) {
            sTemp = (String)squares.get(temp)[2];
            ++searchLength;
            // square has white piece in path or non-attacking black piece
            if (sTemp == K || sTemp == Q || 
                sTemp == R || sTemp == B ||
                sTemp == N || sTemp == P ||
                sTemp == eP || sTemp == eN ||
                sTemp == eB) 
                break;
            if (sTemp == eQ || sTemp == eR) {
                posOfAttackers.add(temp);
                check = true;
            }
            if (searchLength == 1 && sTemp == eK) {
                posOfAttackers.add(temp);
                check = true; 
            }
            --temp;
        }

        searchLength = 0;
        temp = king - 9;

        // in check from bottom-left-diagonal
        while ((!isEdgeOfBoard(temp + 1) ||
                isEdgeOfBoard(king)) && temp >= 0) {
            sTemp = (String)squares.get(temp)[2];
            ++searchLength;
            // again, first condition checks for white piece
            if (sTemp == K || sTemp == Q || 
                sTemp == R || sTemp == B ||
                sTemp == N || sTemp == P || 
                sTemp == eR || sTemp == eN)
                break;
            if (sTemp == eQ || sTemp == eB) {
                posOfAttackers.add(temp);
                check = true;
            }
            if (searchLength == 1 && 
                    (sTemp == eK || sTemp == eP)) {
                posOfAttackers.add(temp);
                check = true; 
            }
            temp -= 9;
        }

        searchLength = 0;
        temp = king - 8;

        // in check from bottom
        while (temp >= 0) {
            sTemp = (String)squares.get(temp)[2];
            ++searchLength;
            if (sTemp == K || sTemp == Q || 
                sTemp == R || sTemp == B ||
                sTemp == N || sTemp == P || 
                sTemp == eP || sTemp == eN || 
                sTemp == eB)
                break;
            if (sTemp == eQ || sTemp == eR) {
                posOfAttackers.add(temp);
                check = true;
            }
            if (searchLength == 1 && sTemp == eK) {
                posOfAttackers.add(temp);
                check = true; 
            }
            temp -= 8;
        }

        searchLength = 0;
        temp = king - 7;

        // in check from bottom-right-diagonal
        while ((!isEdgeOfBoard(temp - 1) ||
                isEdgeOfBoard(king)) && temp >= 0) {
            sTemp = (String)squares.get(temp)[2];
            ++searchLength;
            // again, first condition checks for same color piece
            if (sTemp == K || sTemp == Q || 
                sTemp == R || sTemp == B ||
                sTemp == N || sTemp == P || 
                sTemp == eR || sTemp == eN) {

                break;
            }
            if (sTemp == eQ || sTemp == eB) {
                posOfAttackers.add(temp);
                check = true;
            }
            if (searchLength == 1 &&
            (sTemp == eK || sTemp == eP)) {
                posOfAttackers.add(temp);
                check = true; 
            }
            temp -= 7;
        }

        return check;
    }

    static public boolean inCheckmate(int posOfKing, ArrayList<Integer> attackers) {
        int tempWK = posOfWK;
        int tempBK = posOfBK;
        // reset all active pieces on board
        isActive(); // all pieces currently on board

        boolean w; // white

        boolean inCM = true; // assumes yes first
        ArrayList<Integer> active; // place for all current players on defenders side

        // assign active to team in check for all pieces to be tested
        if (isWhite(posOfKing)) {
            active = activeWhite;
            w = true;
        } else {
            w = false;
            active = activeBlack;
        }

        for (int k = 0; k < attackers.size(); ++k) { // based off all attackers
            
            int val = 0;
            int dif = java.lang.Math.abs(attackers.get(k) - posOfKing);
            // neg slope diagonal
            if (dif % 7 == 0) {
                val = 7;
            } else if (dif % 9 == 0) {
                val = 9;
            } else if (dif % 8 == 0) {
                val = 8;
            } else {
                val = 1;
            }
            // we need something that tracks which pieces are still active
            // then we can test moving each piece to every square in between 
            // every attacker. 
            // If the move takes player out of CM, inCM = false and break;
            if (attackers.get(k) > posOfKing) {
                // to check every square in between attackers
                for (int i = attackers.get(k); i > posOfKing; i -= val) {
                    for (int j = 0; j < active.size(); ++j) {
                        ArrayList<Object[]> temp; // vector not string!
                        if (validMove(active.get(j), i)) {
                            temp = squares;
                            updateBoard(active.get(j), i); 
                        } else continue;

                        if (!kInCheck(w ? posOfWK : posOfBK)) {
                            inCM = false;
                        }
                        squares = temp;
                        posOfBK = tempBK;
                        posOfWK = tempWK;
                        if (!inCM) break;
                    }
                    if (!inCM) break;
                }
            } else {
                // checking every square in between attackers
                for (int i = attackers.get(k); i < posOfKing; i += val) {
                    for (int j = 0; j < active.size(); ++j) {
                        ArrayList<Object[]> temp; // vector not string!
                        if (validMove(active.get(j), i)) {
                            temp = squares;
                            updateBoard(active.get(j), i); 
                        } else continue;

                        if (!kInCheck(w ? posOfWK : posOfBK)) {
                            inCM = false;
                        }
                        squares = temp;
                        posOfBK = tempBK;
                        posOfWK = tempWK;
                        if (!inCM) break;
                    }
                    if (!inCM) break;
                }
            }
            if (!inCM) break;
        }

        if (inCM) {
            checkmate = true;
            return true;
        } else return inCM;
    }

    static public int notationToInteger(String s) {
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

    static public boolean isWhite(int square) {
        Object[] temp = squares.get(square);
        String s = (String)temp[2];
        return s == wR || s == wN || s == wB || s == wQ || s == wK || s == wP;
    }

    static public boolean isBlack(int square) {
        Object[] temp = squares.get(square);
        String s = (String)temp[2];
        return s == bR || s == bN || s == bB || s == bQ || s == bK || s == bP;
    }

    static public ArrayList<Integer> getAttackers() {
        return posOfAttackers;
    }
    
    static public void resetAttackers() {
        posOfAttackers.clear();
    }
    
    static public void isActive() {
        activeWhite.clear();
        activeBlack.clear();
        for (int i = 0; i < 64; ++i) {
            int selected = selectedSquare(i);
            if (selected == 0) continue;
            else if (selected > 0) activeWhite.add(i);
            else activeBlack.add(i);
        }
    }

    static public boolean gameOver() {
        return checkmate;
    }
    
    static public ArrayList<Object[]> snapshot() {
        return squares;
    }
    
    static public void resetMove(ArrayList<Object[]> previous) {
        squares = previous;
    }

    static public void setWKingsideToFalse() {
        wKingside = false;
    }
    static public void setBKingsideToFalse() {
        wKingside = false;
    }
    static public void setWQueensideToFalse() {
        wKingside = false;
    }
    static public void setBQueensideToFalse() {
        wKingside = false;
    }

    static public boolean validWKingside() {
        return wKingside;
    }

    static public boolean validWQueenside() {
        return wQueenside;
    }

    static public boolean validBKingside() {
        return bKingside;
    }

    static public boolean validBQueenside() {
        return bQueenside;
    }
}
