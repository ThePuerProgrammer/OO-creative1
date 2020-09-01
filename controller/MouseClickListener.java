package controller;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import model.Board;
import view.GameBoard;

import java.awt.Color;

// I DID IT!!! JAVA
public class MouseClickListener implements MouseInputListener {
    static ArrayList<String> moves = new ArrayList<String>();
    static ImageIcon temp;
    String square = "";

    Color prev = new Color(0,0,0,0);

    JPanel panel = new JPanel();

    public MouseClickListener(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        prev = panel.getBackground();
        JLabel temp = (JLabel)panel.getComponent(0);
        if (moves.size() < 2) {
            panel.setBackground(new Color(255, 195, 45, 200));
        }
        if (!Board.gameOver()) {
            if (panel.getClientProperty(panel) == "a8") {
                moves.add("a8");
            } else if (panel.getClientProperty(panel) == "b8") {
                moves.add("b8");
            } else if (panel.getClientProperty(panel) == "c8") {
                moves.add("c8");
            } else if (panel.getClientProperty(panel) == "d8") {
                moves.add("d8");
            } else if (panel.getClientProperty(panel) == "e8") {
                moves.add("e8");
            } else if (panel.getClientProperty(panel) == "f8") {
                moves.add("f8");
            } else if (panel.getClientProperty(panel) == "g8") {
                moves.add("g8");
            } else if (panel.getClientProperty(panel) == "h8") {
                moves.add("h8");
            } else if (panel.getClientProperty(panel) == "a7") {
                moves.add("a7");
            } else if (panel.getClientProperty(panel) == "b7") {
                moves.add("b7");
            } else if (panel.getClientProperty(panel) == "c7") {
                moves.add("c7");
            } else if (panel.getClientProperty(panel) == "d7") {
                moves.add("d7");
            } else if (panel.getClientProperty(panel) == "e7") {
                moves.add("e7");
            } else if (panel.getClientProperty(panel) == "f7") {
                moves.add("f7");
            } else if (panel.getClientProperty(panel) == "g7") {
                moves.add("g7");
            } else if (panel.getClientProperty(panel) == "h7") {
                moves.add("h7");
            } else if (panel.getClientProperty(panel) == "a6") {
                moves.add("a6");
            } else if (panel.getClientProperty(panel) == "b6") {
                moves.add("b6");
            } else if (panel.getClientProperty(panel) == "c6") {
                moves.add("c6");
            } else if (panel.getClientProperty(panel) == "d6") {
                moves.add("d6");
            } else if (panel.getClientProperty(panel) == "e6") {
                moves.add("e6");
            } else if (panel.getClientProperty(panel) == "f6") {
                moves.add("f6");
            } else if (panel.getClientProperty(panel) == "g6") {
                moves.add("g6");
            } else if (panel.getClientProperty(panel) == "h6") {
                moves.add("h6");
            } else if (panel.getClientProperty(panel) == "a5") {
                moves.add("a5");
            } else if (panel.getClientProperty(panel) == "b5") {
                moves.add("b5");
            } else if (panel.getClientProperty(panel) == "c5") {
                moves.add("c5");
            } else if (panel.getClientProperty(panel) == "d5") {
                moves.add("d5");
            } else if (panel.getClientProperty(panel) == "e5") {
                moves.add("e5");
            } else if (panel.getClientProperty(panel) == "f5") {
                moves.add("f5");
            } else if (panel.getClientProperty(panel) == "g5") {
                moves.add("g5");
            } else if (panel.getClientProperty(panel) == "h5") {
                moves.add("h5");
            } else if (panel.getClientProperty(panel) == "a4") {
                moves.add("a4");
            } else if (panel.getClientProperty(panel) == "b4") {
                moves.add("b4");
            } else if (panel.getClientProperty(panel) == "c4") {
                moves.add("c4");
            } else if (panel.getClientProperty(panel) == "d4") {
                moves.add("d4");
            } else if (panel.getClientProperty(panel) == "e4") {
                moves.add("e4");
            } else if (panel.getClientProperty(panel) == "f4") {
                moves.add("f4");
            } else if (panel.getClientProperty(panel) == "g4") {
                moves.add("g4");
            } else if (panel.getClientProperty(panel) == "h4") {
                moves.add("h4");
            } else if (panel.getClientProperty(panel) == "a3") {
                moves.add("a3");
            } else if (panel.getClientProperty(panel) == "b3") {
                moves.add("b3");
            } else if (panel.getClientProperty(panel) == "c3") {
                moves.add("c3");
            } else if (panel.getClientProperty(panel) == "d3") {
                moves.add("d3");
            } else if (panel.getClientProperty(panel) == "e3") {
                moves.add("e3");
            } else if (panel.getClientProperty(panel) == "f3") {
                moves.add("f3");
            } else if (panel.getClientProperty(panel) == "g3") {
                moves.add("g3");
            } else if (panel.getClientProperty(panel) == "h3") {
                moves.add("h3");
            } else if (panel.getClientProperty(panel) == "a2") {
                moves.add("a2");
            } else if (panel.getClientProperty(panel) == "b2") {
                moves.add("b2");
            } else if (panel.getClientProperty(panel) == "c2") {
                moves.add("c2");
            } else if (panel.getClientProperty(panel) == "d2") {
                moves.add("d2");
            } else if (panel.getClientProperty(panel) == "e2") {
                moves.add("e2");
            } else if (panel.getClientProperty(panel) == "f2") {
                moves.add("f2");
            } else if (panel.getClientProperty(panel) == "g2") {
                moves.add("g2");
            } else if (panel.getClientProperty(panel) == "h2") {
                moves.add("h2");
            } else if (panel.getClientProperty(panel) == "a1") {
                moves.add("a1");
            } else if (panel.getClientProperty(panel) == "b1") {
                moves.add("b1");
            } else if (panel.getClientProperty(panel) == "c1") {
                moves.add("c1");
            } else if (panel.getClientProperty(panel) == "d1") {
                moves.add("d1");
            } else if (panel.getClientProperty(panel) == "e1") {
                moves.add("e1");
            } else if (panel.getClientProperty(panel) == "f1") {
                moves.add("f1");
            } else if (panel.getClientProperty(panel) == "g1") {
                moves.add("g1");
            } else if (panel.getClientProperty(panel) == "h1") {
                moves.add("h1");
            }

            if (moves.size() > 1) {
                GameBoard.advanceTurnCounter();
                Boolean rightPiece = true;
                String current = moves.get(0);
                int cur = Board.notationToInteger(current);
                if (GameBoard.getWhitesTurn()) {
                    rightPiece = Board.isWhite(cur);
                } else {
                    rightPiece = Board.isBlack(cur);
                }
                if (!rightPiece) {
                    GameBoard.write(GameBoard.read() + "\nINVALID SELCETION");
                    moves.clear();
                    return;
                }
                boolean valid = false;
                String next = moves.get(1);
                int nx = Board.notationToInteger(next);
                valid = Board.validMove(cur, nx);
                if (!valid) {
                    GameBoard.write(GameBoard.read() + "\nINVALID MOVE");
                    moves.clear();
                    return;
                }
                ArrayList<Object[]> snap = Board.snapshot();
                Board.updateBoard(cur, nx);
                int posOfKing = Board.positionOfKing(GameBoard.getWhitesTurn());
                if (GameBoard.getWhitesTurn()) {
                    if (Board.kInCheck(posOfKing)) {
                        Board.resetMove(snap);
                        GameBoard.write(GameBoard.read() + "\nInvalid Move! King in check!");
                        return;
                    }
                    Board.blackCap((String)snap.get(nx)[2]);
                    GameBoard.setWhitesTurn(false);
                } else {
                    if (Board.kInCheck(posOfKing)) {
                        Board.resetMove(snap);
                        GameBoard.write(GameBoard.read() + "\nInvalid Move! King in check!");
                        return;
                    }
                    Board.whiteCap((String)snap.get(nx)[2]);
                    GameBoard.setWhitesTurn(true);
                }
                GameBoard.write(GameBoard.read() + "\n" + moves.get(0) + " -> " + moves.get(1));
                GameBoard.addMoves(moves);
                // GameBoard.updateBoard();
                posOfKing = Board.positionOfKing(GameBoard.getWhitesTurn());
                if (GameBoard.getWhitesTurn()) { // white's turn
                    if (Board.kInCheck(posOfKing)) {
                        if (Board.inCheckmate(posOfKing, Board.getAttackers())) {
                            GameBoard.write(GameBoard.read() + "\nCheckmate! Black Wins!");
                            return;
                        } else { 
                            GameBoard.write(GameBoard.read() + "\nWhite King in check!");
                        }
                    }
                    GameBoard.write(GameBoard.read() + "\nWhite's Turn");
                } else { // blacks turn
                    if (Board.kInCheck(posOfKing)) {
                        if (Board.inCheckmate(posOfKing, Board.getAttackers())) {
                            GameBoard.write(GameBoard.read() + "\nCheckmate! White Wins!");
                            return;
                        } else {
                            GameBoard.write(GameBoard.read() + "\nBlack King in check!");
                        }
                    }
                    GameBoard.write(GameBoard.read() + "\nBlack's Turn");
                }
                moves.clear();
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        // extract JLabel from JPanel using a cast
        // solution source https://stackoverflow.com/questions/35872196/java-accessing-jlabel-inside-jpanel
        JLabel jL = (JLabel)panel.getComponent(0);

        // test if jL is empty square
        // reset color if true
        panel.setBackground(prev);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    
}