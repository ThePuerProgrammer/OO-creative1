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

    static private String colorTheme = "tournament";
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

    static MouseClickListener a1MCL = new MouseClickListener(a1);
    static MouseClickListener b1MCL = new MouseClickListener(b1);
    static MouseClickListener c1MCL = new MouseClickListener(c1);
    static MouseClickListener d1MCL = new MouseClickListener(d1);
    static MouseClickListener e1MCL = new MouseClickListener(e1);
    static MouseClickListener f1MCL = new MouseClickListener(f1);
    static MouseClickListener g1MCL = new MouseClickListener(g1);
    static MouseClickListener h1MCL = new MouseClickListener(h1);
    static MouseClickListener a2MCL = new MouseClickListener(a2);
    static MouseClickListener b2MCL = new MouseClickListener(b2);
    static MouseClickListener c2MCL = new MouseClickListener(c2);
    static MouseClickListener d2MCL = new MouseClickListener(d2);
    static MouseClickListener e2MCL = new MouseClickListener(e2);
    static MouseClickListener f2MCL = new MouseClickListener(f2);
    static MouseClickListener g2MCL = new MouseClickListener(g2);
    static MouseClickListener h2MCL = new MouseClickListener(h2);
    static MouseClickListener a3MCL = new MouseClickListener(a3);
    static MouseClickListener b3MCL = new MouseClickListener(b3);
    static MouseClickListener c3MCL = new MouseClickListener(c3);
    static MouseClickListener d3MCL = new MouseClickListener(d3);
    static MouseClickListener e3MCL = new MouseClickListener(e3);
    static MouseClickListener f3MCL = new MouseClickListener(f3);
    static MouseClickListener g3MCL = new MouseClickListener(g3);
    static MouseClickListener h3MCL = new MouseClickListener(h3);
    static MouseClickListener a4MCL = new MouseClickListener(a4);
    static MouseClickListener b4MCL = new MouseClickListener(b4);
    static MouseClickListener c4MCL = new MouseClickListener(c4);
    static MouseClickListener d4MCL = new MouseClickListener(d4);
    static MouseClickListener e4MCL = new MouseClickListener(e4);
    static MouseClickListener f4MCL = new MouseClickListener(f4);
    static MouseClickListener g4MCL = new MouseClickListener(g4);
    static MouseClickListener h4MCL = new MouseClickListener(h4);
    static MouseClickListener a5MCL = new MouseClickListener(a5);
    static MouseClickListener b5MCL = new MouseClickListener(b5);
    static MouseClickListener c5MCL = new MouseClickListener(c5);
    static MouseClickListener d5MCL = new MouseClickListener(d5);
    static MouseClickListener e5MCL = new MouseClickListener(e5);
    static MouseClickListener f5MCL = new MouseClickListener(f5);
    static MouseClickListener g5MCL = new MouseClickListener(g5);
    static MouseClickListener h5MCL = new MouseClickListener(h5);
    static MouseClickListener a6MCL = new MouseClickListener(a6);
    static MouseClickListener b6MCL = new MouseClickListener(b6);
    static MouseClickListener c6MCL = new MouseClickListener(c6);
    static MouseClickListener d6MCL = new MouseClickListener(d6);
    static MouseClickListener e6MCL = new MouseClickListener(e6);
    static MouseClickListener f6MCL = new MouseClickListener(f6);
    static MouseClickListener g6MCL = new MouseClickListener(g6);
    static MouseClickListener h6MCL = new MouseClickListener(h6);
    static MouseClickListener a7MCL = new MouseClickListener(a7);
    static MouseClickListener b7MCL = new MouseClickListener(b7);
    static MouseClickListener c7MCL = new MouseClickListener(c7);
    static MouseClickListener d7MCL = new MouseClickListener(d7);
    static MouseClickListener e7MCL = new MouseClickListener(e7);
    static MouseClickListener f7MCL = new MouseClickListener(f7);
    static MouseClickListener g7MCL = new MouseClickListener(g7);
    static MouseClickListener h7MCL = new MouseClickListener(h7);
    static MouseClickListener a8MCL = new MouseClickListener(a8);
    static MouseClickListener b8MCL = new MouseClickListener(b8);
    static MouseClickListener c8MCL = new MouseClickListener(c8);
    static MouseClickListener d8MCL = new MouseClickListener(d8);
    static MouseClickListener e8MCL = new MouseClickListener(e8);
    static MouseClickListener f8MCL = new MouseClickListener(f8);
    static MouseClickListener g8MCL = new MouseClickListener(g8);
    static MouseClickListener h8MCL = new MouseClickListener(h8);

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
        whitesTurn = true;

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

        Board chess = new Board(); // ignore warning, only constructor required

        if (colorTheme == "marble") {
            grey = new Color(56,110,134);
            theme = new Color(157, 197, 214);
            darkSquares = new Color(151,143,139);
            lightSquares = new Color(228,226,225);
        } else if (colorTheme == "tournament") {
                // play window theme colors
            grey = new Color(80,80,70);
            theme = new Color(202, 164, 114);
            // colors for the squares
            darkSquares = new Color(40, 90, 0);
            lightSquares = new Color(240, 227, 200);
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
        JLabel cap = new JLabel(""); //Captured Black Pieces
        JLabel cap2 = new JLabel(""); // Captured White Pieces
        JPanel captures = new JPanel();
        captures.add(cap);
        captures.setBackground(theme);
        JPanel captures2 = new JPanel();
        captures2.add(cap2);
        captures2.setBackground(theme);


        // panels
        whiteCap.setPreferredSize(space);
        whiteCap.setBackground(theme);
        whiteCap.add(BorderLayout.WEST, captures);
        blackCap.setPreferredSize(space);
        blackCap.setBackground(theme);
        blackCap.add(BorderLayout.WEST, captures2);


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
        a8.addMouseListener(a8MCL); // all squares can detect clicks

        b8.setBackground(darkSquares);
        bEight.setIcon(blackKnight);
        b8.add(bEight);
        board.add(b8);
        b8.putClientProperty(b8, "b8");
        b8.addMouseListener(b8MCL);

        c8.setBackground(lightSquares);
        cEight.setIcon(blackBishop);
        c8.add(cEight);
        board.add(c8);
        c8.putClientProperty(c8, "c8");
        c8.addMouseListener(c8MCL);

        d8.setBackground(darkSquares);
        dEight.setIcon(blackQueen);
        d8.add(dEight);
        board.add(d8);
        d8.putClientProperty(d8, "d8");
        d8.addMouseListener(d8MCL);

        e8.setBackground(lightSquares);
        eEight.setIcon(blackKing);
        e8.add(eEight);
        board.add(e8);
        e8.putClientProperty(e8, "e8");
        e8.addMouseListener(e8MCL);

        f8.setBackground(darkSquares);
        fEight.setIcon(blackBishop);
        f8.add(fEight);
        board.add(f8);
        f8.putClientProperty(f8, "f8");
        f8.addMouseListener(f8MCL);

        g8.setBackground(lightSquares);
        gEight.setIcon(blackKnight);
        g8.add(gEight);
        board.add(g8);
        g8.putClientProperty(g8, "g8");
        g8.addMouseListener(g8MCL);

        h8.setBackground(darkSquares);
        hEight.setIcon(blackRook);
        h8.add(hEight);
        board.add(h8);
        h8.putClientProperty(h8, "h8");
        h8.addMouseListener(h8MCL);

        a7.setBackground(darkSquares);
        aSeven.setIcon(blackPawn);
        a7.add(aSeven);
        board.add(a7);
        a7.putClientProperty(a7, "a7");
        a7.addMouseListener(a7MCL);

        b7.setBackground(lightSquares);
        bSeven.setIcon(blackPawn);
        b7.add(bSeven);
        board.add(b7);
        b7.putClientProperty(b7, "b7");
        b7.addMouseListener(b7MCL);

        c7.setBackground(darkSquares);
        cSeven.setIcon(blackPawn);
        c7.add(cSeven);
        board.add(c7);
        c7.putClientProperty(c7, "c7");
        c7.addMouseListener(c7MCL);

        d7.setBackground(lightSquares);
        dSeven.setIcon(blackPawn);
        d7.add(dSeven);
        board.add(d7);
        d7.putClientProperty(d7, "d7");
        d7.addMouseListener(d7MCL);

        e7.setBackground(darkSquares);
        eSeven.setIcon(blackPawn);
        e7.add(eSeven);
        board.add(e7);
        e7.putClientProperty(e7, "e7");
        e7.addMouseListener(e7MCL);

        f7.setBackground(lightSquares);
        fSeven.setIcon(blackPawn);
        f7.add(fSeven);
        board.add(f7);
        f7.putClientProperty(f7, "f7");
        f7.addMouseListener(f7MCL);

        g7.setBackground(darkSquares);
        gSeven.setIcon(blackPawn);
        g7.add(gSeven);
        board.add(g7);
        g7.putClientProperty(g7, "g7");
        g7.addMouseListener(g7MCL);

        h7.setBackground(lightSquares);
        hSeven.setIcon(blackPawn);
        h7.add(hSeven);
        board.add(h7);
        h7.putClientProperty(h7, "h7");
        h7.addMouseListener(h7MCL);

        a6.setBackground(lightSquares);
        a6.add(aSix);
        a6.addMouseListener(a6MCL);
        board.add(a6);
        a6.putClientProperty(a6, "a6");

        b6.setBackground(darkSquares);
        b6.add(bSix);
        b6.addMouseListener(b6MCL);
        board.add(b6);
        b6.putClientProperty(b6, "b6");

        c6.setBackground(lightSquares);
        c6.add(cSix);
        c6.addMouseListener(c6MCL);
        board.add(c6);
        c6.putClientProperty(c6, "c6");

        d6.setBackground(darkSquares);
        d6.add(dSix);
        d6.addMouseListener(d6MCL);
        board.add(d6);
        d6.putClientProperty(d6, "d6");

        e6.setBackground(lightSquares);
        e6.add(eSix);
        e6.addMouseListener(e6MCL);
        board.add(e6);
        e6.putClientProperty(e6, "e6");

        f6.setBackground(darkSquares);
        f6.add(fSix);
        f6.addMouseListener(f6MCL);
        board.add(f6);
        f6.putClientProperty(f6, "f6");

        g6.setBackground(lightSquares);
        g6.add(gSix);
        g6.addMouseListener(g6MCL);
        board.add(g6);
        g6.putClientProperty(g6, "g6");

        h6.setBackground(darkSquares);
        h6.add(hSix);
        h6.addMouseListener(h6MCL);
        board.add(h6);
        h6.putClientProperty(h6, "h6");

        a5.setBackground(darkSquares);
        a5.add(aFive);
        a5.addMouseListener(a5MCL);
        board.add(a5);
        a5.putClientProperty(a5, "a5");

        b5.setBackground(lightSquares);
        b5.add(bFive);
        b5.addMouseListener(b5MCL);
        board.add(b5);
        b5.putClientProperty(b5, "b5");

        c5.setBackground(darkSquares);
        c5.add(cFive);
        c5.addMouseListener(c5MCL);
        board.add(c5);
        c5.putClientProperty(c5, "c5");

        d5.setBackground(lightSquares);
        d5.add(dFive);
        d5.addMouseListener(d5MCL);
        board.add(d5);
        d5.putClientProperty(d5, "d5");

        e5.setBackground(darkSquares);
        e5.add(eFive);
        e5.addMouseListener(e5MCL);
        board.add(e5);
        e5.putClientProperty(e5, "e5");

        f5.setBackground(lightSquares);
        f5.add(fFive);
        f5.addMouseListener(f5MCL);
        board.add(f5);
        f5.putClientProperty(f5, "f5");

        g5.setBackground(darkSquares);
        g5.add(gFive);
        g5.addMouseListener(g5MCL);
        board.add(g5);
        g5.putClientProperty(g5, "g5");
        
        h5.setBackground(lightSquares);
        h5.add(hFive);
        h5.addMouseListener(h5MCL);
        board.add(h5);
        h5.putClientProperty(h5, "h5");

        a4.setBackground(lightSquares);
        a4.add(aFour);
        a4.addMouseListener(a4MCL);
        board.add(a4);
        a4.putClientProperty(a4, "a4");

        b4.setBackground(darkSquares);
        b4.add(bFour);
        b4.addMouseListener(b4MCL);
        board.add(b4);
        b4.putClientProperty(b4, "b4");

        c4.setBackground(lightSquares);
        c4.add(cFour);
        c4.addMouseListener(c4MCL);
        board.add(c4);
        c4.putClientProperty(c4, "c4");

        d4.setBackground(darkSquares);
        d4.add(dFour);
        d4.addMouseListener(d4MCL);
        board.add(d4);
        d4.putClientProperty(d4, "d4");

        e4.setBackground(lightSquares);
        e4.add(eFour);
        e4.addMouseListener(e4MCL);
        board.add(e4);
        e4.putClientProperty(e4, "e4");

        f4.setBackground(darkSquares);
        f4.add(fFour);
        f4.addMouseListener(f4MCL);
        board.add(f4);
        f4.putClientProperty(f4, "f4");

        g4.setBackground(lightSquares);
        g4.add(gFour);
        g4.addMouseListener(g4MCL);
        board.add(g4);
        g4.putClientProperty(g4, "g4");

        h4.setBackground(darkSquares);
        h4.add(hFour);
        h4.addMouseListener(h4MCL);
        board.add(h4);
        h4.putClientProperty(h4, "h4");

        a3.setBackground(darkSquares);
        a3.add(aThree);
        a3.addMouseListener(a3MCL);
        board.add(a3);
        a3.putClientProperty(a3, "a3");

        b3.setBackground(lightSquares);
        b3.add(bThree);
        b3.addMouseListener(b3MCL);
        board.add(b3);
        b3.putClientProperty(b3, "b3");

        c3.setBackground(darkSquares);
        c3.add(cThree);
        c3.addMouseListener(c3MCL);
        board.add(c3);
        c3.putClientProperty(c3, "c3");

        d3.setBackground(lightSquares);
        d3.add(dThree);
        d3.addMouseListener(d3MCL);
        board.add(d3);
        d3.putClientProperty(d3, "d3");

        e3.setBackground(darkSquares);
        e3.add(eThree);
        e3.addMouseListener(e3MCL);
        board.add(e3);
        e3.putClientProperty(e3, "e3");

        f3.setBackground(lightSquares);
        f3.add(fThree);
        f3.addMouseListener(f3MCL);
        board.add(f3);
        f3.putClientProperty(f3, "f3");

        g3.setBackground(darkSquares);
        g3.add(gThree);
        g3.addMouseListener(g3MCL);
        board.add(g3);
        g3.putClientProperty(g3, "g3");

        h3.setBackground(lightSquares);
        h3.add(hThree);
        h3.addMouseListener(h3MCL);
        board.add(h3);
        h3.putClientProperty(h3, "h3");

        a2.setBackground(lightSquares);
        aTwo.setIcon(whitePawn);
        a2.add(aTwo);
        board.add(a2);
        a2.addMouseListener(a2MCL);
        a2.putClientProperty(a2, "a2");


        b2.setBackground(darkSquares);
        bTwo.setIcon(whitePawn);
        b2.add(bTwo);
        board.add(b2);
        b2.addMouseListener(b2MCL);
        b2.putClientProperty(b2, "b2");

        c2.setBackground(lightSquares);
        cTwo.setIcon(whitePawn);
        c2.add(cTwo);
        board.add(c2);
        c2.addMouseListener(c2MCL);
        c2.putClientProperty(c2, "c2");

        d2.setBackground(darkSquares);
        dTwo.setIcon(whitePawn);
        d2.add(dTwo);
        board.add(d2);
        d2.addMouseListener(d2MCL);
        d2.putClientProperty(d2, "d2");

        e2.setBackground(lightSquares);
        eTwo.setIcon(whitePawn);
        e2.add(eTwo);
        board.add(e2);
        e2.addMouseListener(e2MCL);
        e2.putClientProperty(e2, "e2");

        f2.setBackground(darkSquares);
        fTwo.setIcon(whitePawn);
        f2.add(fTwo);
        board.add(f2);
        f2.addMouseListener(f2MCL);
        f2.putClientProperty(f2, "f2");

        g2.setBackground(lightSquares);
        gTwo.setIcon(whitePawn);
        g2.add(gTwo);
        board.add(g2);
        g2.addMouseListener(g2MCL);
        g2.putClientProperty(g2, "g2");

        h2.setBackground(darkSquares);
        hTwo.setIcon(whitePawn);
        h2.add(hTwo);
        board.add(h2);
        h2.addMouseListener(h2MCL);
        h2.putClientProperty(h2, "h2");

        a1.setBackground(darkSquares);
        aOne.setIcon(whiteRook);
        a1.add(aOne);
        board.add(a1);
        a1.addMouseListener(a1MCL);
        a1.putClientProperty(a1, "a1");

        b1.setBackground(lightSquares);
        bOne.setIcon(whiteKnight);
        b1.add(bOne);
        b1.addMouseListener(b1MCL);
        board.add(b1);
        b1.putClientProperty(b1, "b1");

        c1.setBackground(darkSquares);
        cOne.setIcon(whiteBishop);
        c1.add(cOne);
        c1.addMouseListener(c1MCL);
        board.add(c1);
        c1.putClientProperty(c1, "c1");

        d1.setBackground(lightSquares);
        dOne.setIcon(whiteQueen);
        d1.add(dOne);
        d1.addMouseListener(d1MCL);
        board.add(d1);
        d1.putClientProperty(d1, "d1");

        e1.setBackground(darkSquares);
        eOne.setIcon(whiteKing);
        e1.add(eOne);
        e1.addMouseListener(e1MCL);
        board.add(e1);
        e1.putClientProperty(e1, "e1");

        f1.setBackground(lightSquares);
        fOne.setIcon(whiteBishop);
        f1.add(fOne);
        f1.addMouseListener(f1MCL);
        board.add(f1);
        f1.putClientProperty(f1, "f1");

        g1.setBackground(darkSquares);
        gOne.setIcon(whiteKnight);
        g1.add(gOne);
        g1.addMouseListener(g1MCL);
        board.add(g1);
        g1.putClientProperty(g1, "g1");

        h1.setBackground(lightSquares);
        hOne.setIcon(whiteRook);
        h1.add(hOne);
        h1.addMouseListener(h1MCL);
        board.add(h1);
        h1.putClientProperty(h1, "h1");

        board.setBorder(BorderFactory.createRaisedBevelBorder());
        

        quit.addActionListener( e -> {
            removeMCL();
            window.getContentPane().removeAll();

            // required to fix MainMenu sizing bug!
            window.setPreferredSize(null);

            var mainMenu = new MainMenu(window);
            mainMenu.init();
            window.pack();
            window.setLocationRelativeTo(null); 
            window.revalidate();
            blackCap.removeAll();
            whiteCap.removeAll();
        });

        options.addActionListener( e -> {
            removeMCL();
            window.getContentPane().removeAll();

            // required to fix MainMenu sizing bug!
            window.setPreferredSize(null);

            var optionsMenu = new OptionsMenu(window, clock);
            optionsMenu.init();
            window.pack();
            window.setLocationRelativeTo(null); 
            window.revalidate();
            blackCap.removeAll();
            whiteCap.removeAll();
        });

        newGame.addActionListener( e -> {
            removeMCL();
            window.getContentPane().removeAll();
            var gameBoard = new GameBoard(window, clock);
            gameBoard.init();
            window.pack();
            window.setLocationRelativeTo(null); 
            window.revalidate();
            blackCap.removeAll();
            whiteCap.removeAll();
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


        JPanel temp = new JPanel();
        temp.setBackground(theme);
        JLabel temp2= new JLabel();
        temp.add(temp2);

        if (moves.get(1) == "a8") {
            capIt(aEight, temp2, temp);
            aEight.setIcon(iTemp);

        } else if (moves.get(1) == "b8") {
            capIt(bEight, temp2, temp);
            bEight.setIcon(iTemp);

        } else if (moves.get(1) == "c8") {
            capIt(cEight, temp2, temp);
            cEight.setIcon(iTemp);

        } else if (moves.get(1) == "d8") {
            capIt(dEight, temp2, temp);
            dEight.setIcon(iTemp);

        } else if (moves.get(1) == "e8") {
            capIt(eEight, temp2, temp);
            eEight.setIcon(iTemp);

        } else if (moves.get(1) == "f8") {
            capIt(fEight, temp2, temp);
            fEight.setIcon(iTemp);

        } else if (moves.get(1) == "g8") {
            capIt(gEight, temp2, temp);
            gEight.setIcon(iTemp);

        } else if (moves.get(1) == "h8") {
            capIt(hEight, temp2, temp);
            hEight.setIcon(iTemp);

        } else if (moves.get(1) == "a7") {
            capIt(aSeven, temp2, temp);
            aSeven.setIcon(iTemp);

        } else if (moves.get(1) == "b7") {
            capIt(bSeven, temp2, temp);
            bSeven.setIcon(iTemp);

        } else if (moves.get(1) == "c7") {
            capIt(cSeven, temp2, temp);
            cSeven.setIcon(iTemp);

        } else if (moves.get(1) == "d7") {
            capIt(dSeven, temp2, temp);
            dSeven.setIcon(iTemp);

        } else if (moves.get(1) == "e7") {
            capIt(eSeven, temp2, temp);
            eSeven.setIcon(iTemp);

        } else if (moves.get(1) == "f7") {
            capIt(fSeven, temp2, temp);
            fSeven.setIcon(iTemp);

        } else if (moves.get(1) == "g7") {
            capIt(gSeven, temp2, temp);
            gSeven.setIcon(iTemp);

        } else if (moves.get(1) == "h7") {
            capIt(hSeven, temp2, temp);
            hSeven.setIcon(iTemp);

        } else if (moves.get(1) == "a6") {
            capIt(aSix, temp2, temp);
            aSix.setIcon(iTemp);

        } else if (moves.get(1) == "b6") {
            capIt(bSix, temp2, temp);
            bSix.setIcon(iTemp);

        } else if (moves.get(1) == "c6") {
            capIt(cSix, temp2, temp);
            cSix.setIcon(iTemp);

        } else if (moves.get(1) == "d6") {
            capIt(dSix, temp2, temp);
            dSix.setIcon(iTemp);

        } else if (moves.get(1) == "e6") {
            capIt(eSix, temp2, temp);
            eSix.setIcon(iTemp);

        } else if (moves.get(1) == "f6") {
            capIt(fSix, temp2, temp);
            fSix.setIcon(iTemp);

        } else if (moves.get(1) == "g6") {
            capIt(gSix, temp2, temp);
            gSix.setIcon(iTemp);

        } else if (moves.get(1) == "h6") {
            capIt(hSix, temp2, temp);
            hSix.setIcon(iTemp);

        } else if (moves.get(1) == "a5") {
            capIt(aFive, temp2, temp);
            aFive.setIcon(iTemp);

        } else if (moves.get(1) == "b5") {
            capIt(bFive, temp2, temp);
            bFive.setIcon(iTemp);

        } else if (moves.get(1) == "c5") {
            capIt(cFive, temp2, temp);
            cFive.setIcon(iTemp);

        } else if (moves.get(1) == "d5") {
            capIt(dFive, temp2, temp);
            dFive.setIcon(iTemp);

        } else if (moves.get(1) == "e5") {
            capIt(eFive, temp2, temp);
            eFive.setIcon(iTemp);

        } else if (moves.get(1) == "f5") {
            capIt(fFive, temp2, temp);
            fFive.setIcon(iTemp);

        } else if (moves.get(1) == "g5") {
            capIt(gFive, temp2, temp);
            gFive.setIcon(iTemp);

        } else if (moves.get(1) == "h5") {
            capIt(hFive, temp2, temp);
            hFive.setIcon(iTemp);

        } else if (moves.get(1) == "a4") {
            capIt(aFour, temp2, temp);
            aFour.setIcon(iTemp);

        } else if (moves.get(1) == "b4") {
            capIt(bFour, temp2, temp);
            bFour.setIcon(iTemp);

        } else if (moves.get(1) == "c4") {
            capIt(cFour, temp2, temp);
            cFour.setIcon(iTemp);

        } else if (moves.get(1) == "d4") {
            capIt(dFour, temp2, temp);
            dFour.setIcon(iTemp);

        } else if (moves.get(1) == "e4") {
            capIt(eFour, temp2, temp);
            eFour.setIcon(iTemp);

        } else if (moves.get(1) == "f4") {
            capIt(fFour, temp2, temp);
            fFour.setIcon(iTemp);

        } else if (moves.get(1) == "g4") {
            capIt(gFour, temp2, temp);
            gFour.setIcon(iTemp);

        } else if (moves.get(1) == "h4") {
            capIt(hFour, temp2, temp);
            hFour.setIcon(iTemp);

        } else if (moves.get(1) == "a3") {
            capIt(aThree, temp2, temp);
            aThree.setIcon(iTemp);

        } else if (moves.get(1) == "b3") {
            capIt(bThree, temp2, temp);
            bThree.setIcon(iTemp);

        } else if (moves.get(1) == "c3") {
            capIt(cThree, temp2, temp);
            cThree.setIcon(iTemp);

        } else if (moves.get(1) == "d3") {
            capIt(dThree, temp2, temp);
            dThree.setIcon(iTemp);

        } else if (moves.get(1) == "e3") {
            capIt(eThree, temp2, temp);
            eThree.setIcon(iTemp);

        } else if (moves.get(1) == "f3") {
            capIt(fThree, temp2, temp);
            fThree.setIcon(iTemp);

        } else if (moves.get(1) == "g3") {
            capIt(gThree, temp2, temp);
            gThree.setIcon(iTemp);

        } else if (moves.get(1) == "h3") {
            capIt(hThree, temp2, temp);
            hThree.setIcon(iTemp);

        } else if (moves.get(1) == "a2") {
            capIt(aTwo, temp2, temp);
            aTwo.setIcon(iTemp);

        } else if (moves.get(1) == "b2") {
            capIt(bTwo, temp2, temp);
            bTwo.setIcon(iTemp);

        } else if (moves.get(1) == "c2") {
            capIt(cTwo, temp2, temp);
            cTwo.setIcon(iTemp);

        } else if (moves.get(1) == "d2") {
            capIt(dTwo, temp2, temp);
            dTwo.setIcon(iTemp);

        } else if (moves.get(1) == "e2") {
            capIt(eTwo, temp2, temp);
            eTwo.setIcon(iTemp);

        } else if (moves.get(1) == "f2") {
            capIt(fTwo, temp2, temp);
            fTwo.setIcon(iTemp);

        } else if (moves.get(1) == "g2") {
            capIt(gTwo, temp2, temp);
            gTwo.setIcon(iTemp);

        } else if (moves.get(1) == "h2") {
            capIt(hTwo, temp2, temp);
            hTwo.setIcon(iTemp);

        } else if (moves.get(1) == "a1") {
            capIt(aOne, temp2, temp);
            aOne.setIcon(iTemp);

        } else if (moves.get(1) == "b1") {
            capIt(bOne, temp2, temp);
            bOne.setIcon(iTemp);

        } else if (moves.get(1) == "c1") {
            capIt(cOne, temp2, temp);
            cOne.setIcon(iTemp);

        } else if (moves.get(1) == "d1") {
            capIt(dOne, temp2, temp);
            dOne.setIcon(iTemp);

        } else if (moves.get(1) == "e1") {
            capIt(eOne, temp2, temp);
            eOne.setIcon(iTemp);

        } else if (moves.get(1) == "f1") {
            capIt(fOne, temp2, temp);
            fOne.setIcon(iTemp);

        } else if (moves.get(1) == "g1") {
            capIt(gOne, temp2, temp);
            gOne.setIcon(iTemp);

        } else if (moves.get(1) == "h1") {
            capIt(hOne, temp2, temp);
            hOne.setIcon(iTemp);
            
        }

        moves.clear();
    }

    static private void capIt(JLabel square, JLabel temp2, JPanel temp) {
        if (square.getIcon() != null) {
            temp2.setIcon(new ImageIcon(((ImageIcon)square.getIcon()).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
            if (whitesTurn) {
                blackCap.add(BorderLayout.EAST, temp);
            } else {
                whiteCap.add(BorderLayout.EAST, temp);
            }
        }
    }

    static public void removeMCL() {
        a8.removeMouseListener(a8MCL);
        b8.removeMouseListener(b8MCL);
        c8.removeMouseListener(c8MCL);
        d8.removeMouseListener(d8MCL);
        e8.removeMouseListener(e8MCL);
        f8.removeMouseListener(f8MCL);
        g8.removeMouseListener(g8MCL);
        h8.removeMouseListener(h8MCL);
        a7.removeMouseListener(a7MCL);
        b7.removeMouseListener(b7MCL);
        c7.removeMouseListener(c7MCL);
        d7.removeMouseListener(d7MCL);
        e7.removeMouseListener(e7MCL);
        f7.removeMouseListener(f7MCL);
        g7.removeMouseListener(g7MCL);
        h7.removeMouseListener(h7MCL);
        a6.removeMouseListener(a6MCL);
        b6.removeMouseListener(b6MCL);
        c6.removeMouseListener(c6MCL);
        d6.removeMouseListener(d6MCL);
        e6.removeMouseListener(e6MCL);
        f6.removeMouseListener(f6MCL);
        g6.removeMouseListener(g6MCL);
        h6.removeMouseListener(h6MCL);
        a5.removeMouseListener(a5MCL);
        b5.removeMouseListener(b5MCL);
        c5.removeMouseListener(c5MCL);
        d5.removeMouseListener(d5MCL);
        e5.removeMouseListener(e5MCL);
        f5.removeMouseListener(f5MCL);
        g5.removeMouseListener(g5MCL);
        h5.removeMouseListener(h5MCL);
        a4.removeMouseListener(a4MCL);
        b4.removeMouseListener(b4MCL);
        c4.removeMouseListener(c4MCL);
        d4.removeMouseListener(d4MCL);
        e4.removeMouseListener(e4MCL);
        f4.removeMouseListener(f4MCL);
        g4.removeMouseListener(g4MCL);
        h4.removeMouseListener(h4MCL);
        a3.removeMouseListener(a3MCL);
        b3.removeMouseListener(b3MCL);
        c3.removeMouseListener(c3MCL);
        d3.removeMouseListener(d3MCL);
        e3.removeMouseListener(e3MCL);
        f3.removeMouseListener(f3MCL);
        g3.removeMouseListener(g3MCL);
        h3.removeMouseListener(h3MCL);
        a2.removeMouseListener(a2MCL);
        b2.removeMouseListener(b2MCL);
        c2.removeMouseListener(c2MCL);
        d2.removeMouseListener(d2MCL);
        e2.removeMouseListener(e2MCL);
        f2.removeMouseListener(f2MCL);
        g2.removeMouseListener(g2MCL);
        h2.removeMouseListener(h2MCL);
        a1.removeMouseListener(a1MCL);
        b1.removeMouseListener(b1MCL);
        c1.removeMouseListener(c1MCL);
        d1.removeMouseListener(d1MCL);
        e1.removeMouseListener(e1MCL);
        f1.removeMouseListener(f1MCL);
        g1.removeMouseListener(g1MCL);
        h1.removeMouseListener(h1MCL);
    }
}