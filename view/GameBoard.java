package view;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import controller.MouseClickListener;
import model.Board;
import model.Clock;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;

public class GameBoard {

    static private String colorTheme = "marble";
    JFrame window = new JFrame();
    Clock clock;
    static int turnCounter = 0;
    static boolean whitesTurn = true;
    static JTextArea moveList = new JTextArea();
    static ArrayList<String> moves = new ArrayList<String>();
    static JPanel a8 = new JPanel();
    static JPanel b8 = new JPanel();
    static JPanel c8 = new JPanel();
    static JPanel d8 = new JPanel();
    static JPanel e8 = new JPanel();
    static JPanel f8 = new JPanel();
    static JPanel g8 = new JPanel();
    static JPanel h8 = new JPanel();
    static JPanel a7 = new JPanel();
    static JPanel b7 = new JPanel();
    static JPanel c7 = new JPanel();
    static JPanel d7 = new JPanel();
    static JPanel e7 = new JPanel();
    static JPanel f7 = new JPanel();
    static JPanel g7 = new JPanel();
    static JPanel h7 = new JPanel();
    static JPanel a6 = new JPanel();
    static JPanel b6 = new JPanel();
    static JPanel c6 = new JPanel();
    static JPanel d6 = new JPanel();
    static JPanel e6 = new JPanel();
    static JPanel f6 = new JPanel();
    static JPanel g6 = new JPanel();
    static JPanel h6 = new JPanel();
    static JPanel a5 = new JPanel();
    static JPanel b5 = new JPanel();
    static JPanel c5 = new JPanel();
    static JPanel d5 = new JPanel();
    static JPanel e5 = new JPanel();
    static JPanel f5 = new JPanel();
    static JPanel g5 = new JPanel();
    static JPanel h5 = new JPanel();
    static JPanel a4 = new JPanel();
    static JPanel b4 = new JPanel();
    static JPanel c4 = new JPanel();
    static JPanel d4 = new JPanel();
    static JPanel e4 = new JPanel();
    static JPanel f4 = new JPanel();
    static JPanel g4 = new JPanel();
    static JPanel h4 = new JPanel();
    static JPanel a3 = new JPanel();
    static JPanel b3 = new JPanel();
    static JPanel c3 = new JPanel();
    static JPanel d3 = new JPanel();
    static JPanel e3 = new JPanel();
    static JPanel f3 = new JPanel();
    static JPanel g3 = new JPanel();
    static JPanel h3 = new JPanel();
    static JPanel a2 = new JPanel();
    static JPanel b2 = new JPanel();
    static JPanel c2 = new JPanel();
    static JPanel d2 = new JPanel();
    static JPanel e2 = new JPanel();
    static JPanel f2 = new JPanel();
    static JPanel g2 = new JPanel();
    static JPanel h2 = new JPanel();
    static JPanel a1 = new JPanel();
    static JPanel b1 = new JPanel();
    static JPanel c1 = new JPanel();
    static JPanel d1 = new JPanel();
    static JPanel e1 = new JPanel();
    static JPanel f1 = new JPanel();
    static JPanel g1 = new JPanel();
    static JPanel h1 = new JPanel();

    static JLabel aEight = new JLabel();
    static JLabel bEight = new JLabel();
    static JLabel cEight = new JLabel();
    static JLabel dEight = new JLabel();
    static JLabel eEight = new JLabel();
    static JLabel fEight = new JLabel();
    static JLabel gEight = new JLabel();
    static JLabel hEight = new JLabel();
    static JLabel aSeven = new JLabel();
    static JLabel bSeven = new JLabel();
    static JLabel cSeven = new JLabel();
    static JLabel dSeven = new JLabel();
    static JLabel eSeven = new JLabel();
    static JLabel fSeven = new JLabel();
    static JLabel gSeven = new JLabel();
    static JLabel hSeven = new JLabel();
    static JLabel aSix = new JLabel();
    static JLabel bSix = new JLabel();
    static JLabel cSix = new JLabel();
    static JLabel dSix = new JLabel();
    static JLabel eSix = new JLabel();
    static JLabel fSix = new JLabel();
    static JLabel gSix = new JLabel();
    static JLabel hSix = new JLabel();
    static JLabel aFive = new JLabel();
    static JLabel bFive = new JLabel();
    static JLabel cFive = new JLabel();
    static JLabel dFive = new JLabel();
    static JLabel eFive = new JLabel();
    static JLabel fFive = new JLabel();
    static JLabel gFive = new JLabel();
    static JLabel hFive = new JLabel();
    static JLabel aFour = new JLabel();
    static JLabel bFour = new JLabel();
    static JLabel cFour = new JLabel();
    static JLabel dFour = new JLabel();
    static JLabel eFour = new JLabel();
    static JLabel fFour = new JLabel();
    static JLabel gFour = new JLabel();
    static JLabel hFour = new JLabel();
    static JLabel aThree = new JLabel();
    static JLabel bThree = new JLabel();
    static JLabel cThree = new JLabel();
    static JLabel dThree = new JLabel();
    static JLabel eThree = new JLabel();
    static JLabel fThree = new JLabel();
    static JLabel gThree = new JLabel();
    static JLabel hThree = new JLabel();
    static JLabel aTwo = new JLabel();
    static JLabel bTwo = new JLabel();
    static JLabel cTwo = new JLabel();
    static JLabel dTwo = new JLabel();
    static JLabel eTwo = new JLabel();
    static JLabel fTwo = new JLabel();
    static JLabel gTwo = new JLabel();
    static JLabel hTwo = new JLabel();
    static JLabel aOne = new JLabel();
    static JLabel bOne = new JLabel();
    static JLabel cOne = new JLabel();
    static JLabel dOne = new JLabel();
    static JLabel eOne = new JLabel();
    static JLabel fOne = new JLabel();
    static JLabel gOne = new JLabel();
    static JLabel hOne = new JLabel();

    static JPanel blackCap = new JPanel();
    static JPanel whiteCap = new JPanel();


    // play window theme colors
    static Color grey = new Color(80,80,70);
    static Color theme = new Color(202, 164, 114);
    // colors for the squares
    static Color darkSquares = new Color(40, 90, 0);
    static Color lightSquares = new Color(240, 227, 200);


    // all of my chess pieces!
    static ImageIcon blackPawn = new ImageIcon("assets/BlackPawn.png", "BlackPawn");
    static ImageIcon blackRook = new ImageIcon("assets/BlackRook.png");
    static ImageIcon blackBishop = new ImageIcon("assets/BlackBishop.png");
    static ImageIcon blackKnight = new ImageIcon("assets/BlackKnight.png");
    static ImageIcon blackQueen = new ImageIcon("assets/BlackQueen.png");
    static ImageIcon blackKing = new ImageIcon("assets/BlackKing.png");
    static ImageIcon whitePawn = new ImageIcon("assets/WhitePawn.png");
    static ImageIcon whiteRook = new ImageIcon("assets/WhiteRook.png");
    static ImageIcon whiteBishop = new ImageIcon("assets/WhiteBishop.png");
    static ImageIcon whiteKnight = new ImageIcon("assets/WhiteKnight.png");
    static ImageIcon whiteQueen = new ImageIcon("assets/WhiteQueen.png");
    static ImageIcon whiteKing = new ImageIcon("assets/WhiteKing.png", "WhiteKing");
    static ImageIcon user = new ImageIcon("assets/user.png");

    public GameBoard(JFrame window, Clock clock) {
        turnCounter = 0;
        this.clock = clock;
        this.window = window;
        window.setPreferredSize(new Dimension(1200,850));
        window.setTitle("Play Wimpy Chess");
    }

    public void init() {
        aSix.setIcon(null);
        bSix.setIcon(null);
        cSix.setIcon(null);
        dSix.setIcon(null);
        eSix.setIcon(null);
        fSix.setIcon(null);
        gSix.setIcon(null);
        hSix.setIcon(null);
        aFive.setIcon(null);
        bFive.setIcon(null);
        cFive.setIcon(null);
        dFive.setIcon(null);
        eFive.setIcon(null);
        fFive.setIcon(null);
        gFive.setIcon(null);
        hFive.setIcon(null);
        aFour.setIcon(null);
        bFour.setIcon(null);
        cFour.setIcon(null);
        dFour.setIcon(null);
        eFour.setIcon(null);
        fFour.setIcon(null);
        gFour.setIcon(null);
        hFour.setIcon(null);
        aThree.setIcon(null);
        bThree.setIcon(null);
        cThree.setIcon(null);
        dThree.setIcon(null);
        eThree.setIcon(null);
        fThree.setIcon(null);
        gThree.setIcon(null);
        hThree.setIcon(null);

        Board chess = new Board();

        if (colorTheme == "marble") {
            grey = new Color(56,110,134);
            theme = new Color(157, 197, 214);
            darkSquares = new Color(151,143,139);
            lightSquares = new Color(228,226,225);
        }

        // primary container
        Container container = window.getContentPane();

        JPanel settings = new JPanel();
        settings.setBackground(grey);
        settings.setPreferredSize(new Dimension(400, 800));

        // settings buttons
        JButton quit = new JButton("Quit Game");
        JButton newGame = new JButton("New Game");
        JButton options = new JButton("Options");
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(grey);
        buttonPanel.add(quit);
        buttonPanel.add(newGame);
        buttonPanel.add(options);

        // move list text area
        moveList.setBackground(Color.lightGray);
        moveList.setBorder(BorderFactory.createLoweredBevelBorder());
        JScrollPane scrollPane = new JScrollPane(moveList, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(400, 600));

        moveList.setText("White's Turn");

        // label for the move list
        JLabel moveMenu = new JLabel("Move History",SwingConstants.CENTER);
        moveMenu.setForeground(Color.BLACK);
        moveMenu.setFont(new Font("Heveltica", Font.BOLD, 30));
        moveMenu.setPreferredSize(new Dimension(400, 88));

        // compose the settings panel and add within a grouping panel for easy formatting
        settings.add(moveMenu);
        settings.add(BorderLayout.CENTER, scrollPane);        
        settings.add(BorderLayout.SOUTH, buttonPanel);
        JPanel sPanel = new JPanel();
        sPanel.add(settings);
        sPanel.setBackground(grey);
        sPanel.setBorder(BorderFactory.createLineBorder(theme, 5));


        // put the settings panel on the east
        container.add(BorderLayout.EAST, sPanel);

        JPanel spacer = new JPanel();
        spacer.setPreferredSize(new Dimension(50, 800));
        container.add(BorderLayout.WEST, spacer);
        spacer.setBackground(theme);

        JPanel playPanel = new JPanel();
        playPanel.setPreferredSize(new Dimension(700, 800));
        container.add(BorderLayout.CENTER, playPanel);
        playPanel.setBackground(theme);

        JPanel p1 = new JPanel();
        p1.setPreferredSize(new Dimension(600, 100));
        p1.setBackground(theme);
        JPanel p2 = new JPanel();
        p2.setPreferredSize(new Dimension(600, 100));
        p2.setBackground(theme);

        JPanel board = new JPanel();
        board.setPreferredSize(new Dimension(600, 600));
        board.setLayout(new GridLayout(8,8));
        board.setBackground(theme);
        

        playPanel.add(BorderLayout.NORTH, p2);
        playPanel.add(BorderLayout.CENTER, board);
        playPanel.add(BorderLayout.SOUTH, p1);

        // all of my chess pieces!
        ImageIcon blackPawn = new ImageIcon("assets/BlackPawn.png", "BlackPawn");
        ImageIcon blackRook = new ImageIcon("assets/BlackRook.png");
        ImageIcon blackBishop = new ImageIcon("assets/BlackBishop.png");
        ImageIcon blackKnight = new ImageIcon("assets/BlackKnight.png");
        ImageIcon blackQueen = new ImageIcon("assets/BlackQueen.png");
        ImageIcon blackKing = new ImageIcon("assets/BlackKing.png");
        ImageIcon whitePawn = new ImageIcon("assets/WhitePawn.png");
        ImageIcon whiteRook = new ImageIcon("assets/WhiteRook.png");
        ImageIcon whiteBishop = new ImageIcon("assets/WhiteBishop.png");
        ImageIcon whiteKnight = new ImageIcon("assets/WhiteKnight.png");
        ImageIcon whiteQueen = new ImageIcon("assets/WhiteQueen.png");
        ImageIcon whiteKing = new ImageIcon("assets/WhiteKing.png", "WhiteKing");
        ImageIcon user = new ImageIcon("assets/user.png");

        // add user icons
        // create dimensions
        Dimension space = new Dimension(480,100);
        Dimension u = new Dimension(110,100);

        // Labels
        JLabel user1 = new JLabel("Player 1");
        JLabel user2 = new JLabel("Player 2");
        JLabel cap = new JLabel("Captured Black Pieces");
        JLabel cap2 = new JLabel("Captured White Pieces");
        JPanel captures = new JPanel();
        captures.add(cap);
        captures.setBackground(theme);
        JPanel captures2 = new JPanel();
        captures2.add(cap2);
        captures2.setBackground(theme);


        // panels
        whiteCap.setPreferredSize(space);
        whiteCap.setBackground(theme);
        whiteCap.add(BorderLayout.NORTH, captures);
        blackCap.setPreferredSize(space);
        blackCap.setBackground(theme);
        blackCap.add(BorderLayout.NORTH, captures2);


        JPanel u1 = new JPanel();
        u1.setPreferredSize(u);
        u1.setBackground(theme);
        JPanel u2 = new JPanel();
        u2.setPreferredSize(u);
        u2.setBackground(theme);

        user1.setIcon(user);
        user2.setIcon(user);
        u1.add(user1);
        u2.add(user2);

        p1.add(BorderLayout.EAST, whiteCap);
        p2.add(BorderLayout.EAST, blackCap);
        p1.add(BorderLayout.WEST, u1);
        p2.add(BorderLayout.WEST, u2);


        // generate chessboard squares out of JPanels. Add pieces using JLabels and ImageIcons
        // LOTS of copy/paste. will refactor later if optimization exists! (It must)
        a8.setBackground(lightSquares);
        aEight.setIcon(blackRook);
        a8.add(aEight);
        board.add(a8);
        a8.putClientProperty(a8, "a8");
        a8.addMouseListener(new MouseClickListener(a8)); // all squares can detect clicks

        b8.setBackground(darkSquares);
        bEight.setIcon(blackKnight);
        b8.add(bEight);
        board.add(b8);
        b8.putClientProperty(b8, "b8");
        b8.addMouseListener(new MouseClickListener(b8));

        c8.setBackground(lightSquares);
        cEight.setIcon(blackBishop);
        c8.add(cEight);
        board.add(c8);
        c8.putClientProperty(c8, "c8");
        c8.addMouseListener(new MouseClickListener(c8));

        d8.setBackground(darkSquares);
        dEight.setIcon(blackQueen);
        d8.add(dEight);
        board.add(d8);
        d8.putClientProperty(d8, "d8");
        d8.addMouseListener(new MouseClickListener(d8));

        e8.setBackground(lightSquares);
        eEight.setIcon(blackKing);
        e8.add(eEight);
        board.add(e8);
        e8.putClientProperty(e8, "e8");
        e8.addMouseListener(new MouseClickListener(e8));

        f8.setBackground(darkSquares);
        fEight.setIcon(blackBishop);
        f8.add(fEight);
        board.add(f8);
        f8.putClientProperty(f8, "f8");
        f8.addMouseListener(new MouseClickListener(f8));

        g8.setBackground(lightSquares);
        gEight.setIcon(blackKnight);
        g8.add(gEight);
        board.add(g8);
        g8.putClientProperty(g8, "g8");
        g8.addMouseListener(new MouseClickListener(g8));

        h8.setBackground(darkSquares);
        hEight.setIcon(blackRook);
        h8.add(hEight);
        board.add(h8);
        h8.putClientProperty(h8, "h8");
        h8.addMouseListener(new MouseClickListener(h8));

        a7.setBackground(darkSquares);
        aSeven.setIcon(blackPawn);
        a7.add(aSeven);
        board.add(a7);
        a7.putClientProperty(a7, "a7");
        a7.addMouseListener(new MouseClickListener(a7));

        b7.setBackground(lightSquares);
        bSeven.setIcon(blackPawn);
        b7.add(bSeven);
        board.add(b7);
        b7.putClientProperty(b7, "b7");
        b7.addMouseListener(new MouseClickListener(b7));

        c7.setBackground(darkSquares);
        cSeven.setIcon(blackPawn);
        c7.add(cSeven);
        board.add(c7);
        c7.putClientProperty(c7, "c7");
        c7.addMouseListener(new MouseClickListener(c7));

        d7.setBackground(lightSquares);
        dSeven.setIcon(blackPawn);
        d7.add(dSeven);
        board.add(d7);
        d7.putClientProperty(d7, "d7");
        d7.addMouseListener(new MouseClickListener(d7));

        e7.setBackground(darkSquares);
        eSeven.setIcon(blackPawn);
        e7.add(eSeven);
        board.add(e7);
        e7.putClientProperty(e7, "e7");
        e7.addMouseListener(new MouseClickListener(e7));

        f7.setBackground(lightSquares);
        fSeven.setIcon(blackPawn);
        f7.add(fSeven);
        board.add(f7);
        f7.putClientProperty(f7, "f7");
        f7.addMouseListener(new MouseClickListener(f7));

        g7.setBackground(darkSquares);
        gSeven.setIcon(blackPawn);
        g7.add(gSeven);
        board.add(g7);
        g7.putClientProperty(g7, "g7");
        g7.addMouseListener(new MouseClickListener(g7));

        h7.setBackground(lightSquares);
        hSeven.setIcon(blackPawn);
        h7.add(hSeven);
        board.add(h7);
        h7.putClientProperty(h7, "h7");
        h7.addMouseListener(new MouseClickListener(h7));

        a6.setBackground(lightSquares);
        a6.add(aSix);
        a6.addMouseListener(new MouseClickListener(a6));
        board.add(a6);
        a6.putClientProperty(a6, "a6");

        b6.setBackground(darkSquares);
        b6.add(bSix);
        b6.addMouseListener(new MouseClickListener(b6));
        board.add(b6);
        b6.putClientProperty(b6, "b6");

        c6.setBackground(lightSquares);
        c6.add(cSix);
        c6.addMouseListener(new MouseClickListener(c6));
        board.add(c6);
        c6.putClientProperty(c6, "c6");

        d6.setBackground(darkSquares);
        d6.add(dSix);
        d6.addMouseListener(new MouseClickListener(d6));
        board.add(d6);
        d6.putClientProperty(d6, "d6");

        e6.setBackground(lightSquares);
        e6.add(eSix);
        e6.addMouseListener(new MouseClickListener(e6));
        board.add(e6);
        e6.putClientProperty(e6, "e6");

        f6.setBackground(darkSquares);
        f6.add(fSix);
        f6.addMouseListener(new MouseClickListener(f6));
        board.add(f6);
        f6.putClientProperty(f6, "f6");

        g6.setBackground(lightSquares);
        g6.add(gSix);
        g6.addMouseListener(new MouseClickListener(g6));
        board.add(g6);
        g6.putClientProperty(g6, "g6");

        h6.setBackground(darkSquares);
        h6.add(hSix);
        h6.addMouseListener(new MouseClickListener(h6));
        board.add(h6);
        h6.putClientProperty(h6, "h6");

        a5.setBackground(darkSquares);
        a5.add(aFive);
        a5.addMouseListener(new MouseClickListener(a5));
        board.add(a5);
        a5.putClientProperty(a5, "a5");

        b5.setBackground(lightSquares);
        b5.add(bFive);
        b5.addMouseListener(new MouseClickListener(b5));
        board.add(b5);
        b5.putClientProperty(b5, "b5");

        c5.setBackground(darkSquares);
        c5.add(cFive);
        c5.addMouseListener(new MouseClickListener(c5));
        board.add(c5);
        c5.putClientProperty(c5, "c5");

        d5.setBackground(lightSquares);
        d5.add(dFive);
        d5.addMouseListener(new MouseClickListener(d5));
        board.add(d5);
        d5.putClientProperty(d5, "d5");

        e5.setBackground(darkSquares);
        e5.add(eFive);
        e5.addMouseListener(new MouseClickListener(e5));
        board.add(e5);
        e5.putClientProperty(e5, "e5");

        f5.setBackground(lightSquares);
        f5.add(fFive);
        f5.addMouseListener(new MouseClickListener(f5));
        board.add(f5);
        f5.putClientProperty(f5, "f5");

        g5.setBackground(darkSquares);
        g5.add(gFive);
        g5.addMouseListener(new MouseClickListener(g5));
        board.add(g5);
        g5.putClientProperty(g5, "g5");
        
        h5.setBackground(lightSquares);
        h5.add(hFive);
        h5.addMouseListener(new MouseClickListener(h5));
        board.add(h5);
        h5.putClientProperty(h5, "h5");

        a4.setBackground(lightSquares);
        a4.add(aFour);
        a4.addMouseListener(new MouseClickListener(a4));
        board.add(a4);
        a4.putClientProperty(a4, "a4");

        b4.setBackground(darkSquares);
        b4.add(bFour);
        b4.addMouseListener(new MouseClickListener(b4));
        board.add(b4);
        b4.putClientProperty(b4, "b4");

        c4.setBackground(lightSquares);
        c4.add(cFour);
        c4.addMouseListener(new MouseClickListener(c4));
        board.add(c4);
        c4.putClientProperty(c4, "c4");

        d4.setBackground(darkSquares);
        d4.add(dFour);
        d4.addMouseListener(new MouseClickListener(d4));
        board.add(d4);
        d4.putClientProperty(d4, "d4");

        e4.setBackground(lightSquares);
        e4.add(eFour);
        e4.addMouseListener(new MouseClickListener(e4));
        board.add(e4);
        e4.putClientProperty(e4, "e4");

        f4.setBackground(darkSquares);
        f4.add(fFour);
        f4.addMouseListener(new MouseClickListener(f4));
        board.add(f4);
        f4.putClientProperty(f4, "f4");

        g4.setBackground(lightSquares);
        g4.add(gFour);
        g4.addMouseListener(new MouseClickListener(g4));
        board.add(g4);
        g4.putClientProperty(g4, "g4");

        h4.setBackground(darkSquares);
        h4.add(hFour);
        h4.addMouseListener(new MouseClickListener(h4));
        board.add(h4);
        h4.putClientProperty(h4, "h4");

        a3.setBackground(darkSquares);
        a3.add(aThree);
        a3.addMouseListener(new MouseClickListener(a3));
        board.add(a3);
        a3.putClientProperty(a3, "a3");

        b3.setBackground(lightSquares);
        b3.add(bThree);
        b3.addMouseListener(new MouseClickListener(b3));
        board.add(b3);
        b3.putClientProperty(b3, "b3");

        c3.setBackground(darkSquares);
        c3.add(cThree);
        c3.addMouseListener(new MouseClickListener(c3));
        board.add(c3);
        c3.putClientProperty(c3, "c3");

        d3.setBackground(lightSquares);
        d3.add(dThree);
        d3.addMouseListener(new MouseClickListener(d3));
        board.add(d3);
        d3.putClientProperty(d3, "d3");

        e3.setBackground(darkSquares);
        e3.add(eThree);
        e3.addMouseListener(new MouseClickListener(e3));
        board.add(e3);
        e3.putClientProperty(e3, "e3");

        f3.setBackground(lightSquares);
        f3.add(fThree);
        f3.addMouseListener(new MouseClickListener(f3));
        board.add(f3);
        f3.putClientProperty(f3, "f3");

        g3.setBackground(darkSquares);
        g3.add(gThree);
        g3.addMouseListener(new MouseClickListener(g3));
        board.add(g3);
        g3.putClientProperty(g3, "g3");

        h3.setBackground(lightSquares);
        h3.add(hThree);
        h3.addMouseListener(new MouseClickListener(h3));
        board.add(h3);
        h3.putClientProperty(h3, "h3");

        a2.setBackground(lightSquares);
        aTwo.setIcon(whitePawn);
        a2.add(aTwo);
        board.add(a2);
        a2.addMouseListener(new MouseClickListener(a2));
        a2.putClientProperty(a2, "a2");


        b2.setBackground(darkSquares);
        bTwo.setIcon(whitePawn);
        b2.add(bTwo);
        board.add(b2);
        b2.addMouseListener(new MouseClickListener(b2));
        b2.putClientProperty(b2, "b2");

        c2.setBackground(lightSquares);
        cTwo.setIcon(whitePawn);
        c2.add(cTwo);
        board.add(c2);
        c2.addMouseListener(new MouseClickListener(c2));
        c2.putClientProperty(c2, "c2");

        d2.setBackground(darkSquares);
        dTwo.setIcon(whitePawn);
        d2.add(dTwo);
        board.add(d2);
        d2.addMouseListener(new MouseClickListener(d2));
        d2.putClientProperty(d2, "d2");

        e2.setBackground(lightSquares);
        eTwo.setIcon(whitePawn);
        e2.add(eTwo);
        board.add(e2);
        e2.addMouseListener(new MouseClickListener(e2));
        e2.putClientProperty(e2, "e2");

        f2.setBackground(darkSquares);
        fTwo.setIcon(whitePawn);
        f2.add(fTwo);
        board.add(f2);
        f2.addMouseListener(new MouseClickListener(f2));
        f2.putClientProperty(f2, "f2");

        g2.setBackground(lightSquares);
        gTwo.setIcon(whitePawn);
        g2.add(gTwo);
        board.add(g2);
        g2.addMouseListener(new MouseClickListener(g2));
        g2.putClientProperty(g2, "g2");

        h2.setBackground(darkSquares);
        hTwo.setIcon(whitePawn);
        h2.add(hTwo);
        board.add(h2);
        h2.addMouseListener(new MouseClickListener(h2));
        h2.putClientProperty(h2, "h2");

        a1.setBackground(darkSquares);
        aOne.setIcon(whiteRook);
        a1.add(aOne);
        board.add(a1);
        a1.addMouseListener(new MouseClickListener(a1));
        a1.putClientProperty(a1, "a1");

        b1.setBackground(lightSquares);
        bOne.setIcon(whiteKnight);
        b1.add(bOne);
        b1.addMouseListener(new MouseClickListener(b1));
        board.add(b1);
        b1.putClientProperty(b1, "b1");

        c1.setBackground(darkSquares);
        cOne.setIcon(whiteBishop);
        c1.add(cOne);
        c1.addMouseListener(new MouseClickListener(c1));
        board.add(c1);
        c1.putClientProperty(c1, "c1");

        d1.setBackground(lightSquares);
        dOne.setIcon(whiteQueen);
        d1.add(dOne);
        d1.addMouseListener(new MouseClickListener(d1));
        board.add(d1);
        d1.putClientProperty(d1, "d1");

        e1.setBackground(darkSquares);
        eOne.setIcon(whiteKing);
        e1.add(eOne);
        e1.addMouseListener(new MouseClickListener(e1));
        board.add(e1);
        e1.putClientProperty(e1, "e1");

        f1.setBackground(lightSquares);
        fOne.setIcon(whiteBishop);
        f1.add(fOne);
        f1.addMouseListener(new MouseClickListener(f1));
        board.add(f1);
        f1.putClientProperty(f1, "f1");

        g1.setBackground(darkSquares);
        gOne.setIcon(whiteKnight);
        g1.add(gOne);
        g1.addMouseListener(new MouseClickListener(g1));
        board.add(g1);
        g1.putClientProperty(g1, "g1");

        h1.setBackground(lightSquares);
        hOne.setIcon(whiteRook);
        h1.add(hOne);
        h1.addMouseListener(new MouseClickListener(h1));
        board.add(h1);
        h1.putClientProperty(h1, "h1");

        board.setBorder(BorderFactory.createRaisedBevelBorder());
        

        quit.addActionListener( e -> {
            window.getContentPane().removeAll();

            // required to fix MainMenu sizing bug!
            window.setPreferredSize(null);

            var mainMenu = new MainMenu(window);
            mainMenu.init();
            window.pack();
            window.setLocationRelativeTo(null); 
            window.revalidate();
        });

        options.addActionListener( e -> {
            window.getContentPane().removeAll();

            // required to fix MainMenu sizing bug!
            window.setPreferredSize(null);

            var optionsMenu = new OptionsMenu(window, clock);
            optionsMenu.init();
            window.pack();
            window.setLocationRelativeTo(null); 
            window.revalidate();
        });

        newGame.addActionListener( e -> {
            window.getContentPane().removeAll();
            var gameBoard = new GameBoard(window, clock);
            gameBoard.init();
            window.pack();
            window.setLocationRelativeTo(null); 
            window.revalidate();
        });
    }

    public void swapLabels(JPanel a, JPanel b) {
        
    }

    // used to change theme in options
    static public void setTheme(String s) {
        colorTheme = s;
    }

    static public String getTheme() {
        return colorTheme;
    }

    static public void advanceTurnCounter() {
        turnCounter++;
    }

    static public void setWhitesTurn(boolean b) {
        whitesTurn = b;
    }

    static public boolean getWhitesTurn() {
        return whitesTurn;
    }

    static public void write(String s) {
        moveList.setText(s);
    }

    static public String read() {
        return moveList.getText();
    }

    static public void addMoves(ArrayList<String> aLS) {
        moves = aLS;
    }

    static public void updateBoard() {

        // capture the icon from the current square
        // following section places icon in next square
        ImageIcon iTemp = new ImageIcon();
        if (moves.get(0) == "a8") {
            if (aEight.getIcon() != null) {
                iTemp = (ImageIcon)aEight.getIcon();
                aEight.setIcon(null);
            }
        } else if (moves.get(0) == "b8") {
            if (bEight.getIcon() != null) {
                iTemp = (ImageIcon)bEight.getIcon();
                bEight.setIcon(null);
            }
        } else if (moves.get(0) == "c8") {
            if (cEight.getIcon() != null) {
                iTemp = (ImageIcon)cEight.getIcon();
                cEight.setIcon(null);
            }
        } else if (moves.get(0) == "d8") {
            if (dEight.getIcon() != null) {
                iTemp = (ImageIcon)dEight.getIcon();
                dEight.setIcon(null);
            }
        } else if (moves.get(0) == "e8") {
            if (eEight.getIcon() != null) {
                if (moves.get(1) == "g8" && Board.validBKingside()) {
                    fEight.setIcon(hEight.getIcon());
                    hEight.setIcon(null);
                } else if (moves.get(1) == "c8" && Board.validBQueenside()) {
                    dEight.setIcon(aEight.getIcon());
                    aEight.setIcon(null);
                }
                iTemp = (ImageIcon)eEight.getIcon();
                eEight.setIcon(null);
            }
        } else if (moves.get(0) == "f8") {
            if (fEight.getIcon() != null) {
                iTemp = (ImageIcon)fEight.getIcon();
                fEight.setIcon(null);
            }
        } else if (moves.get(0) == "g8") {
            if (gEight.getIcon() != null) {
                iTemp = (ImageIcon)gEight.getIcon();
                gEight.setIcon(null);
            }
        } else if (moves.get(0) == "h8") {
            if (hEight.getIcon() != null) {
                iTemp = (ImageIcon)hEight.getIcon();
                hEight.setIcon(null);
            }
        } else if (moves.get(0) == "a7") {
            if (aSeven.getIcon() != null) {
                iTemp = (ImageIcon)aSeven.getIcon();
                aSeven.setIcon(null);
            }
        } else if (moves.get(0) == "b7") {
            if (bSeven.getIcon() != null) {
                iTemp = (ImageIcon)bSeven.getIcon();
                bSeven.setIcon(null);
            }
        } else if (moves.get(0) == "c7") {
            if (cSeven.getIcon() != null) {
                iTemp = (ImageIcon)cSeven.getIcon();
                cSeven.setIcon(null);
            }
        } else if (moves.get(0) == "d7") {
            if (dSeven.getIcon() != null) {
                iTemp = (ImageIcon)dSeven.getIcon();
                dSeven.setIcon(null);
            }
        } else if (moves.get(0) == "e7") {
            if (eSeven.getIcon() != null) {
                iTemp = (ImageIcon)eSeven.getIcon();
                eSeven.setIcon(null);
            }
        } else if (moves.get(0) == "f7") {
            if (fSeven.getIcon() != null) {
                iTemp = (ImageIcon)fSeven.getIcon();
                fSeven.setIcon(null);
            }
        } else if (moves.get(0) == "g7") {
            if (gSeven.getIcon() != null) {
                iTemp = (ImageIcon)gSeven.getIcon();
                gSeven.setIcon(null);
            }
        } else if (moves.get(0) == "h7") {
            if (hSeven.getIcon() != null) {
                iTemp = (ImageIcon)hSeven.getIcon();
                hSeven.setIcon(null);
            }
        } else if (moves.get(0) == "a6") {
            if (aSix.getIcon() != null) {
                iTemp = (ImageIcon)aSix.getIcon();
                aSix.setIcon(null);
            }
        } else if (moves.get(0) == "b6") {
            if (bSix.getIcon() != null) {
                iTemp = (ImageIcon)bSix.getIcon();
                bSix.setIcon(null);
            }
        } else if (moves.get(0) == "c6") {
            if (cSix.getIcon() != null) {
                iTemp = (ImageIcon)cSix.getIcon();
                cSix.setIcon(null);
            }
        } else if (moves.get(0) == "d6") {
            if (dSix.getIcon() != null) {
                iTemp = (ImageIcon)dSix.getIcon();
                dSix.setIcon(null);
            }
        } else if (moves.get(0) == "e6") {
            if (eSix.getIcon() != null) {
                iTemp = (ImageIcon)eSix.getIcon();
                eSix.setIcon(null);
            }
        } else if (moves.get(0) == "f6") {
            if (fSix.getIcon() != null) {
                iTemp = (ImageIcon)fSix.getIcon();
                fSix.setIcon(null);
            }
        } else if (moves.get(0) == "g6") {
            if (gSix.getIcon() != null) {
                iTemp = (ImageIcon)gSix.getIcon();
                gSix.setIcon(null);
            }
        } else if (moves.get(0) == "h6") {
            if (hSix.getIcon() != null) {
                iTemp = (ImageIcon)hSix.getIcon();
                hSix.setIcon(null);
            }
        } else if (moves.get(0) == "a5") {
            if (aFive.getIcon() != null) {
                iTemp = (ImageIcon)aFive.getIcon();
                aFive.setIcon(null);
            }
        } else if (moves.get(0) == "b5") {
            if (bFive.getIcon() != null) {
                iTemp = (ImageIcon)bFive.getIcon();
                bFive.setIcon(null);
            }
        } else if (moves.get(0) == "c5") {
            if (cFive.getIcon() != null) {
                iTemp = (ImageIcon)cFive.getIcon();
                cFive.setIcon(null);
            }
        } else if (moves.get(0) == "d5") {
            if (dFive.getIcon() != null) {
                iTemp = (ImageIcon)dFive.getIcon();
                dFive.setIcon(null);
            }
        } else if (moves.get(0) == "e5") {
            if (eFive.getIcon() != null) {
                iTemp = (ImageIcon)eFive.getIcon();
                eFive.setIcon(null);
            }
        } else if (moves.get(0) == "f5") {
            if (fFive.getIcon() != null) {
                iTemp = (ImageIcon)fFive.getIcon();
                fFive.setIcon(null);
            }
        } else if (moves.get(0) == "g5") {
            if (gFive.getIcon() != null) {
                iTemp = (ImageIcon)gFive.getIcon();
                gFive.setIcon(null);
            }
        } else if (moves.get(0) == "h5") {
            if (hFive.getIcon() != null) {
                iTemp = (ImageIcon)hFive.getIcon();
                hFive.setIcon(null);
            }
        } else if (moves.get(0) == "a4") {
            if (aFour.getIcon() != null) {
                iTemp = (ImageIcon)aFour.getIcon();
                aFour.setIcon(null);
            }
        } else if (moves.get(0) == "b4") {
            if (bFour.getIcon() != null) {
                iTemp = (ImageIcon)bFour.getIcon();
                bFour.setIcon(null);
            }
        } else if (moves.get(0) == "c4") {
            if (cFour.getIcon() != null) {
                iTemp = (ImageIcon)cFour.getIcon();
                cFour.setIcon(null);
            }
        } else if (moves.get(0) == "d4") {
            if (dFour.getIcon() != null) {
                iTemp = (ImageIcon)dFour.getIcon();
                dFour.setIcon(null);
            }
        } else if (moves.get(0) == "e4") {
            if (eFour.getIcon() != null) {
                iTemp = (ImageIcon)eFour.getIcon();
                eFour.setIcon(null);
            }
        } else if (moves.get(0) == "f4") {
            if (fFour.getIcon() != null) {
                iTemp = (ImageIcon)fFour.getIcon();
                fFour.setIcon(null);
            }
        } else if (moves.get(0) == "g4") {
            if (gFour.getIcon() != null) {
                iTemp = (ImageIcon)gFour.getIcon();
                gFour.setIcon(null);
            }
        } else if (moves.get(0) == "h4") {
            if (hFour.getIcon() != null) {
                iTemp = (ImageIcon)hFour.getIcon();
                hFour.setIcon(null);
            }
        } else if (moves.get(0) == "a3") {
            if (aThree.getIcon() != null) {
                iTemp = (ImageIcon)aThree.getIcon();
                aThree.setIcon(null);
            }
        } else if (moves.get(0) == "b3") {
            if (bThree.getIcon() != null) {
                iTemp = (ImageIcon)bThree.getIcon();
                bThree.setIcon(null);
            }
        } else if (moves.get(0) == "c3") {
            if (cThree.getIcon() != null) {
                iTemp = (ImageIcon)cThree.getIcon();
                cThree.setIcon(null);
            }
        } else if (moves.get(0) == "d3") {
            if (dThree.getIcon() != null) {
                iTemp = (ImageIcon)dThree.getIcon();
                dThree.setIcon(null);
            }
        } else if (moves.get(0) == "e3") {
            if (eThree.getIcon() != null) {
                iTemp = (ImageIcon)eThree.getIcon();
                eThree.setIcon(null);
            }
        } else if (moves.get(0) == "f3") {
            if (fThree.getIcon() != null) {
                iTemp = (ImageIcon)fThree.getIcon();
                fThree.setIcon(null);
            }
        } else if (moves.get(0) == "g3") {
            if (gThree.getIcon() != null) {
                iTemp = (ImageIcon)gThree.getIcon();
                gThree.setIcon(null);
            }
        } else if (moves.get(0) == "h3") {
            if (hThree.getIcon() != null) {
                iTemp = (ImageIcon)hThree.getIcon();
                hThree.setIcon(null);
            }
        } else if (moves.get(0) == "a2") {
            if (aTwo.getIcon() != null) {
                iTemp = (ImageIcon)aTwo.getIcon();
                aTwo.setIcon(null);
            }
        } else if (moves.get(0) == "b2") {
            if (bTwo.getIcon() != null) {
                iTemp = (ImageIcon)bTwo.getIcon();
                bTwo.setIcon(null);
            }
        } else if (moves.get(0) == "c2") {
            if (cTwo.getIcon() != null) {
                iTemp = (ImageIcon)cTwo.getIcon();
                cTwo.setIcon(null);
            }
        } else if (moves.get(0) == "d2") {
            if (dTwo.getIcon() != null) {
                iTemp = (ImageIcon)dTwo.getIcon();
                dTwo.setIcon(null);
            }
        } else if (moves.get(0) == "e2") {
            if (eTwo.getIcon() != null) {
                iTemp = (ImageIcon)eTwo.getIcon();
                eTwo.setIcon(null);
            }
        } else if (moves.get(0) == "f2") {
            if (fTwo.getIcon() != null) {
                iTemp = (ImageIcon)fTwo.getIcon();
                fTwo.setIcon(null);
            }
        } else if (moves.get(0) == "g2") {
            if (gTwo.getIcon() != null) {
                iTemp = (ImageIcon)gTwo.getIcon();
                gTwo.setIcon(null);
            }
        } else if (moves.get(0) == "h2") {
            if (hTwo.getIcon() != null) {
                iTemp = (ImageIcon)hTwo.getIcon();
                hTwo.setIcon(null);
            }
        } else if (moves.get(0) == "a1") {
            if (aOne.getIcon() != null) {
                iTemp = (ImageIcon)aOne.getIcon();
                aOne.setIcon(null);
            }
        } else if (moves.get(0) == "b1") {
            if (bOne.getIcon() != null) {
                iTemp = (ImageIcon)bOne.getIcon();
                bOne.setIcon(null);
            }
        } else if (moves.get(0) == "c1") {
            if (cOne.getIcon() != null) {
                iTemp = (ImageIcon)cOne.getIcon();
                cOne.setIcon(null);
            }
        } else if (moves.get(0) == "d1") {
            if (dOne.getIcon() != null) {
                iTemp = (ImageIcon)dOne.getIcon();
                dOne.setIcon(null);
            }
        } else if (moves.get(0) == "e1") {
            if (eOne.getIcon() != null) {
                // White King Castles Kingside
                if (moves.get(1) == "g1" && Board.validWKingside()) {
                    fOne.setIcon(hOne.getIcon());
                    hOne.setIcon(null);
                } else if (moves.get(1) == "c1" && Board.validWQueenside()) {
                    dOne.setIcon(aOne.getIcon());
                    aOne.setIcon(null);
                }
                iTemp = (ImageIcon)eOne.getIcon();
                eOne.setIcon(null);
            }
        } else if (moves.get(0) == "f1") {
            if (fOne.getIcon() != null) {
                iTemp = (ImageIcon)fOne.getIcon();
                fOne.setIcon(null);
            }
        } else if (moves.get(0) == "g1") {
            if (gOne.getIcon() != null) {
                iTemp = (ImageIcon)gOne.getIcon();
                gOne.setIcon(null);
            }
        } else if (moves.get(0) == "h1") {
            if (hOne.getIcon() != null) {
                iTemp = (ImageIcon)hOne.getIcon();
                hOne.setIcon(null);
            }
        }

        /////////////////////////////////////////////////
        /////////////////////////////////////////////////
        /////////////////////////////////////////////////
        /////////////////////////////////////////////////

        // THE FOLLOWING SOLUTION WAS MODIFIED FROM STACK OVERFLOW AND IS USED EXTENSIVELY IN THIS SECTION
        // ImageIcon imageIcon = new ImageIcon(((ImageIcon)dFive.getIcon()).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
        // Source: https://stackoverflow.com/questions/16343098/resize-a-picture-to-fit-a-jlabel/32885963#32885963

        if (moves.get(1) == "a8") {
            aEight.setIcon(iTemp);
        } else if (moves.get(1) == "b8") {
            bEight.setIcon(iTemp);
        } else if (moves.get(1) == "c8") {
            cEight.setIcon(iTemp);
        } else if (moves.get(1) == "d8") {
            dEight.setIcon(iTemp);
        } else if (moves.get(1) == "e8") {
            eEight.setIcon(iTemp);
        } else if (moves.get(1) == "f8") {
            fEight.setIcon(iTemp);
        } else if (moves.get(1) == "g8") {
            gEight.setIcon(iTemp);
        } else if (moves.get(1) == "h8") {
            hEight.setIcon(iTemp);
        } else if (moves.get(1) == "a7") {
            aSeven.setIcon(iTemp);
        } else if (moves.get(1) == "b7") {
            bSeven.setIcon(iTemp);
        } else if (moves.get(1) == "c7") {
            cSeven.setIcon(iTemp);
        } else if (moves.get(1) == "d7") {
            dSeven.setIcon(iTemp);
        } else if (moves.get(1) == "e7") {
            eSeven.setIcon(iTemp);
        } else if (moves.get(1) == "f7") {
            fSeven.setIcon(iTemp);
        } else if (moves.get(1) == "g7") {
            gSeven.setIcon(iTemp);
        } else if (moves.get(1) == "h7") {
            hSeven.setIcon(iTemp);
        } else if (moves.get(1) == "a6") {
            aSix.setIcon(iTemp);
        } else if (moves.get(1) == "b6") {
            bSix.setIcon(iTemp);
        } else if (moves.get(1) == "c6") {
            cSix.setIcon(iTemp);
        } else if (moves.get(1) == "d6") {
            dSix.setIcon(iTemp);
        } else if (moves.get(1) == "e6") {
            eSix.setIcon(iTemp);
        } else if (moves.get(1) == "f6") {
            fSix.setIcon(iTemp);
        } else if (moves.get(1) == "g6") {
            gSix.setIcon(iTemp);
        } else if (moves.get(1) == "h6") {
            hSix.setIcon(iTemp);
        } else if (moves.get(1) == "a5") {
            aFive.setIcon(iTemp);
        } else if (moves.get(1) == "b5") {
            bFive.setIcon(iTemp);
        } else if (moves.get(1) == "c5") {
            cFive.setIcon(iTemp);
        } else if (moves.get(1) == "d5") {
            if (dFive.getIcon() != null) {
                JPanel temp = new JPanel();
                temp.setBackground(theme);
                JLabel temp2= new JLabel();
                ImageIcon imageIcon = new ImageIcon(((ImageIcon)dFive.getIcon()).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
                temp2.setIcon(imageIcon);
                temp.add(temp2);
                if (whitesTurn) {
                    blackCap.add(BorderLayout.SOUTH, temp);
                } else {
                    whiteCap.add(BorderLayout.SOUTH, temp);
                }
            }
            dFive.setIcon(iTemp);
        } else if (moves.get(1) == "e5") {
            eFive.setIcon(iTemp);
        } else if (moves.get(1) == "f5") {
            fFive.setIcon(iTemp);
        } else if (moves.get(1) == "g5") {
            gFive.setIcon(iTemp);
        } else if (moves.get(1) == "h5") {
            hFive.setIcon(iTemp);
        } else if (moves.get(1) == "a4") {
            aFour.setIcon(iTemp);
        } else if (moves.get(1) == "b4") {
            bFour.setIcon(iTemp);
        } else if (moves.get(1) == "c4") {
            cFour.setIcon(iTemp);
        } else if (moves.get(1) == "d4") {
            dFour.setIcon(iTemp);
        } else if (moves.get(1) == "e4") {
            eFour.setIcon(iTemp);
        } else if (moves.get(1) == "f4") {
            fFour.setIcon(iTemp);
        } else if (moves.get(1) == "g4") {
            gFour.setIcon(iTemp);
        } else if (moves.get(1) == "h4") {
            hFour.setIcon(iTemp);
        } else if (moves.get(1) == "a3") {
            aThree.setIcon(iTemp);
        } else if (moves.get(1) == "b3") {
            bThree.setIcon(iTemp);
        } else if (moves.get(1) == "c3") {
            cThree.setIcon(iTemp);
        } else if (moves.get(1) == "d3") {
            dThree.setIcon(iTemp);
        } else if (moves.get(1) == "e3") {
            eThree.setIcon(iTemp);
        } else if (moves.get(1) == "f3") {
            fThree.setIcon(iTemp);
        } else if (moves.get(1) == "g3") {
            gThree.setIcon(iTemp);
        } else if (moves.get(1) == "h3") {
            hThree.setIcon(iTemp);
        } else if (moves.get(1) == "a2") {
            aTwo.setIcon(iTemp);
        } else if (moves.get(1) == "b2") {
            bTwo.setIcon(iTemp);
        } else if (moves.get(1) == "c2") {
            cTwo.setIcon(iTemp);
        } else if (moves.get(1) == "d2") {
            dTwo.setIcon(iTemp);
        } else if (moves.get(1) == "e2") {
            eTwo.setIcon(iTemp);
        } else if (moves.get(1) == "f2") {
            fTwo.setIcon(iTemp);
        } else if (moves.get(1) == "g2") {
            gTwo.setIcon(iTemp);
        } else if (moves.get(1) == "h2") {
            hTwo.setIcon(iTemp);
        } else if (moves.get(1) == "a1") {
            aOne.setIcon(iTemp);
        } else if (moves.get(1) == "b1") {
            bOne.setIcon(iTemp);
        } else if (moves.get(1) == "c1") {
            cOne.setIcon(iTemp);
        } else if (moves.get(1) == "d1") {
            dOne.setIcon(iTemp);
        } else if (moves.get(1) == "e1") {
            eOne.setIcon(iTemp);
        } else if (moves.get(1) == "f1") {
            fOne.setIcon(iTemp);
        } else if (moves.get(1) == "g1") {
            gOne.setIcon(iTemp);
        } else if (moves.get(1) == "h1") {
            hOne.setIcon(iTemp);
        }

        moves.clear();
    }
}
