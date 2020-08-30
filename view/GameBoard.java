package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import controller.MouseClickListener;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;

public class GameBoard {
    JFrame window = new JFrame();

    public GameBoard(JFrame window) {
        this.window = window;
        window.setPreferredSize(new Dimension(1200,800));
        window.setTitle("Play Wimpy Chess");
    }

    public void init() {
        // primary container
        Container container = window.getContentPane();

        JPanel settings = new JPanel();
        settings.setPreferredSize(new Dimension(400, 800));

        // settings buttons
        JButton quit = new JButton("Quit Game");
        JButton newGame = new JButton("New Game");
        JButton options = new JButton("Options");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(quit);
        buttonPanel.add(newGame);
        buttonPanel.add(options);

        // move list text area
        JTextArea moveList = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(moveList, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(400, 600));

        // label for the move list
        JLabel moveMenu = new JLabel("Move History",SwingConstants.CENTER);
        moveMenu.setFont(new Font("Heveltica", Font.PLAIN, 30));
        moveMenu.setPreferredSize(new Dimension(400, 100));

        // compose the settings panel and add within a grouping panel for easy formatting
        settings.add(moveMenu);
        settings.add(BorderLayout.CENTER, scrollPane);        
        settings.add(BorderLayout.SOUTH, buttonPanel);
        JPanel sPanel = new JPanel();
        sPanel.add(settings);

        // put the settings panel on the east
        container.add(BorderLayout.EAST, sPanel);

        JPanel spacer = new JPanel();
        spacer.setPreferredSize(new Dimension(50, 800));
        container.add(BorderLayout.WEST, spacer);

        JPanel playPanel = new JPanel();
        playPanel.setPreferredSize(new Dimension(700, 800));
        container.add(BorderLayout.CENTER, playPanel);

        JPanel p1 = new JPanel();
        p1.setPreferredSize(new Dimension(600, 100));
        JPanel p2 = new JPanel();
        p2.setPreferredSize(new Dimension(600, 100));


        JPanel board = new JPanel();
        board.setPreferredSize(new Dimension(600, 600));
        board.setLayout(new GridLayout(8,8));
        

        playPanel.add(BorderLayout.NORTH, p2);
        playPanel.add(BorderLayout.CENTER, board);
        playPanel.add(BorderLayout.SOUTH, p1);


        // colors for the squares
        Color darkSquares = new Color(40, 90, 0, 200);
        Color lightSquares = new Color(240, 227, 200, 200);

        // all of my chess pieces!
        ImageIcon blackPawn = new ImageIcon("assets/BlackPawn.png");
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
        ImageIcon whiteKing = new ImageIcon("assets/WhiteKing.png");


        // generate chessboard squares out of JPanels. Add pieces using JLabels and ImageIcons
        // LOTS of copy/paste. will refactor later if optimization exists! (It must)
        JPanel a8 = new JPanel();
        a8.setBackground(lightSquares);
        JLabel aEight = new JLabel();
        aEight.setIcon(blackRook);
        a8.add(aEight);
        board.add(a8);
        a8.addMouseListener(new MouseClickListener(a8)); // all squares can detect clicks

        JPanel b8 = new JPanel();
        b8.setBackground(darkSquares);
        JLabel bEight = new JLabel();
        bEight.setIcon(blackKnight);
        b8.add(bEight);
        board.add(b8);
        b8.addMouseListener(new MouseClickListener(b8));

        JPanel c8 = new JPanel();
        c8.setBackground(lightSquares);
        JLabel cEight = new JLabel();
        cEight.setIcon(blackBishop);
        c8.add(cEight);
        board.add(c8);
        c8.addMouseListener(new MouseClickListener(c8));

        JPanel d8 = new JPanel();
        d8.setBackground(darkSquares);
        JLabel dEight = new JLabel();
        dEight.setIcon(blackQueen);
        d8.add(dEight);
        board.add(d8);
        d8.addMouseListener(new MouseClickListener(d8));

        JPanel e8 = new JPanel();
        e8.setBackground(lightSquares);
        JLabel eEight = new JLabel();
        eEight.setIcon(blackKing);
        e8.add(eEight);
        board.add(e8);
        e8.addMouseListener(new MouseClickListener(e8));

        JPanel f8 = new JPanel();
        f8.setBackground(darkSquares);
        JLabel fEight = new JLabel();
        fEight.setIcon(blackBishop);
        f8.add(fEight);
        board.add(f8);
        f8.addMouseListener(new MouseClickListener(f8));

        JPanel g8 = new JPanel();
        g8.setBackground(lightSquares);
        JLabel gEight = new JLabel();
        gEight.setIcon(blackKnight);
        g8.add(gEight);
        board.add(g8);
        g8.addMouseListener(new MouseClickListener(g8));

        JPanel h8 = new JPanel();
        h8.setBackground(darkSquares);
        JLabel hEight = new JLabel();
        hEight.setIcon(blackRook);
        h8.add(hEight);
        board.add(h8);
        h8.addMouseListener(new MouseClickListener(h8));

        JPanel a7 = new JPanel();
        a7.setBackground(darkSquares);
        JLabel aSeven = new JLabel();
        aSeven.setIcon(blackPawn);
        a7.add(aSeven);
        board.add(a7);
        a7.addMouseListener(new MouseClickListener(a7));

        JPanel b7 = new JPanel();
        b7.setBackground(lightSquares);
        JLabel bSeven = new JLabel();
        bSeven.setIcon(blackPawn);
        b7.add(bSeven);
        board.add(b7);
        b7.addMouseListener(new MouseClickListener(b7));

        JPanel c7 = new JPanel();
        c7.setBackground(darkSquares);
        JLabel cSeven = new JLabel();
        cSeven.setIcon(blackPawn);
        c7.add(cSeven);
        board.add(c7);
        c7.addMouseListener(new MouseClickListener(c7));

        JPanel d7 = new JPanel();
        d7.setBackground(lightSquares);
        JLabel dSeven = new JLabel();
        dSeven.setIcon(blackPawn);
        d7.add(dSeven);
        board.add(d7);
        d7.addMouseListener(new MouseClickListener(d7));

        JPanel e7 = new JPanel();
        e7.setBackground(darkSquares);
        JLabel eSeven = new JLabel();
        eSeven.setIcon(blackPawn);
        e7.add(eSeven);
        board.add(e7);
        e7.addMouseListener(new MouseClickListener(e7));

        JPanel f7 = new JPanel();
        f7.setBackground(lightSquares);
        JLabel fSeven = new JLabel();
        fSeven.setIcon(blackPawn);
        f7.add(fSeven);
        board.add(f7);
        f7.addMouseListener(new MouseClickListener(f7));

        JPanel g7 = new JPanel();
        g7.setBackground(darkSquares);
        JLabel gSeven = new JLabel();
        gSeven.setIcon(blackPawn);
        g7.add(gSeven);
        board.add(g7);
        g7.addMouseListener(new MouseClickListener(g7));

        JPanel h7 = new JPanel();
        h7.setBackground(lightSquares);
        JLabel hSeven = new JLabel();
        hSeven.setIcon(blackPawn);
        h7.add(hSeven);
        board.add(h7);
        h7.addMouseListener(new MouseClickListener(h7));

        JPanel a6 = new JPanel();
        a6.setBackground(lightSquares);
        JLabel aSix= new JLabel();
        a6.add(aSix);
        a6.addMouseListener(new MouseClickListener(a6));
        board.add(a6);


        JPanel b6 = new JPanel();
        b6.setBackground(darkSquares);
        JLabel bSix= new JLabel();
        b6.add(bSix);
        b6.addMouseListener(new MouseClickListener(b6));
        board.add(b6);


        JPanel c6 = new JPanel();
        c6.setBackground(lightSquares);
        JLabel cSix= new JLabel();
        c6.add(cSix);
        c6.addMouseListener(new MouseClickListener(c6));
        board.add(c6);


        JPanel d6 = new JPanel();
        d6.setBackground(darkSquares);
        JLabel dSix= new JLabel();
        d6.add(dSix);
        d6.addMouseListener(new MouseClickListener(d6));
        board.add(d6);


        JPanel e6 = new JPanel();
        e6.setBackground(lightSquares);
        JLabel eSix = new JLabel();
        e6.add(eSix);
        e6.addMouseListener(new MouseClickListener(e6));
        board.add(e6);


        JPanel f6 = new JPanel();
        f6.setBackground(darkSquares);
        JLabel fSix = new JLabel();
        f6.add(fSix);
        f6.addMouseListener(new MouseClickListener(f6));
        board.add(f6);


        JPanel g6 = new JPanel();
        g6.setBackground(lightSquares);
        JLabel gSix = new JLabel();
        g6.add(gSix);
        g6.addMouseListener(new MouseClickListener(g6));
        board.add(g6);


        JPanel h6 = new JPanel();
        h6.setBackground(darkSquares);
        JLabel hSix = new JLabel();
        h6.add(hSix);
        h6.addMouseListener(new MouseClickListener(h6));
        board.add(h6);


        JPanel a5 = new JPanel();
        a5.setBackground(darkSquares);
        JLabel aFive = new JLabel();
        a5.add(aFive);
        a5.addMouseListener(new MouseClickListener(a5));
        board.add(a5);

        JPanel b5 = new JPanel();
        b5.setBackground(lightSquares);
        JLabel bFive = new JLabel();
        b5.add(bFive);
        b5.addMouseListener(new MouseClickListener(b5));
        board.add(b5);

        JPanel c5 = new JPanel();
        c5.setBackground(darkSquares);
        JLabel cFive = new JLabel();
        c5.add(cFive);
        c5.addMouseListener(new MouseClickListener(c5));
        board.add(c5);

        JPanel d5 = new JPanel();
        d5.setBackground(lightSquares);
        JLabel dFive = new JLabel();
        d5.add(dFive);
        d5.addMouseListener(new MouseClickListener(d5));
        board.add(d5);

        JPanel e5 = new JPanel();
        e5.setBackground(darkSquares);
        JLabel eFive = new JLabel();
        e5.add(eFive);
        e5.addMouseListener(new MouseClickListener(e5));
        board.add(e5);

        JPanel f5 = new JPanel();
        f5.setBackground(lightSquares);
        JLabel fFive = new JLabel();
        f5.add(fFive);
        f5.addMouseListener(new MouseClickListener(f5));
        board.add(f5);

        JPanel g5 = new JPanel();
        g5.setBackground(darkSquares);
        JLabel gFive = new JLabel();
        g5.add(gFive);
        g5.addMouseListener(new MouseClickListener(g5));
        board.add(g5);
        
        JPanel h5 = new JPanel();
        h5.setBackground(lightSquares);
        JLabel hFive = new JLabel();
        h5.add(hFive);
        h5.addMouseListener(new MouseClickListener(h5));
        board.add(h5);

        JPanel a4 = new JPanel();
        a4.setBackground(lightSquares);
        JLabel aFour = new JLabel();
        a4.add(aFour);
        a4.addMouseListener(new MouseClickListener(a4));
        board.add(a4);

        JPanel b4 = new JPanel();
        b4.setBackground(darkSquares);
        JLabel bFour = new JLabel();
        b4.add(bFour);
        b4.addMouseListener(new MouseClickListener(b4));
        board.add(b4);

        JPanel c4 = new JPanel();
        c4.setBackground(lightSquares);
        JLabel cFour = new JLabel();
        c4.add(cFour);
        c4.addMouseListener(new MouseClickListener(c4));
        board.add(c4);

        JPanel d4 = new JPanel();
        d4.setBackground(darkSquares);
        JLabel dFour = new JLabel();
        d4.add(dFour);
        d4.addMouseListener(new MouseClickListener(d4));
        board.add(d4);

        JPanel e4 = new JPanel();
        e4.setBackground(lightSquares);
        JLabel eFour = new JLabel();
        e4.add(eFour);
        e4.addMouseListener(new MouseClickListener(e4));
        board.add(e4);

        JPanel f4 = new JPanel();
        f4.setBackground(darkSquares);
        JLabel fFour = new JLabel();
        f4.add(fFour);
        f4.addMouseListener(new MouseClickListener(f4));
        board.add(f4);

        JPanel g4 = new JPanel();
        g4.setBackground(lightSquares);
        JLabel gFour = new JLabel();
        g4.add(gFour);
        g4.addMouseListener(new MouseClickListener(g4));
        board.add(g4);

        JPanel h4 = new JPanel();
        h4.setBackground(darkSquares);
        JLabel hFour = new JLabel();
        h4.add(hFour);
        h4.addMouseListener(new MouseClickListener(h4));
        board.add(h4);

        JPanel a3 = new JPanel();
        a3.setBackground(darkSquares);
        JLabel aThree = new JLabel();
        a3.add(aThree);
        a3.addMouseListener(new MouseClickListener(a3));
        board.add(a3);

        JPanel b3 = new JPanel();
        b3.setBackground(lightSquares);
        JLabel bThree = new JLabel();
        b3.add(bThree);
        b3.addMouseListener(new MouseClickListener(b3));
        board.add(b3);

        JPanel c3 = new JPanel();
        c3.setBackground(darkSquares);
        JLabel cThree = new JLabel();
        c3.add(cThree);
        c3.addMouseListener(new MouseClickListener(c3));
        board.add(c3);

        JPanel d3 = new JPanel();
        d3.setBackground(lightSquares);
        JLabel dThree = new JLabel();
        d3.add(dThree);
        d3.addMouseListener(new MouseClickListener(d3));
        board.add(d3);

        JPanel e3 = new JPanel();
        e3.setBackground(darkSquares);
        JLabel eThree = new JLabel();
        e3.add(eThree);
        e3.addMouseListener(new MouseClickListener(e3));
        board.add(e3);

        JPanel f3 = new JPanel();
        f3.setBackground(lightSquares);
        JLabel fThree = new JLabel();
        f3.add(fThree);
        f3.addMouseListener(new MouseClickListener(f3));
        board.add(f3);

        JPanel g3 = new JPanel();
        g3.setBackground(darkSquares);
        JLabel gThree = new JLabel();
        g3.add(gThree);
        g3.addMouseListener(new MouseClickListener(g3));
        board.add(g3);

        JPanel h3 = new JPanel();
        h3.setBackground(lightSquares);
        JLabel hThree = new JLabel();
        h3.add(hThree);
        h3.addMouseListener(new MouseClickListener(h3));
        board.add(h3);

        JPanel a2 = new JPanel();
        a2.setBackground(lightSquares);
        JLabel aTwo = new JLabel();
        aTwo.setIcon(whitePawn);
        a2.add(aTwo);
        board.add(a2);
        a2.addMouseListener(new MouseClickListener(a2));

        JPanel b2 = new JPanel();
        b2.setBackground(darkSquares);
        JLabel bTwo = new JLabel();
        bTwo.setIcon(whitePawn);
        b2.add(bTwo);
        board.add(b2);
        b2.addMouseListener(new MouseClickListener(b2));

        JPanel c2 = new JPanel();
        c2.setBackground(lightSquares);
        JLabel cTwo = new JLabel();
        cTwo.setIcon(whitePawn);
        c2.add(cTwo);
        board.add(c2);
        c2.addMouseListener(new MouseClickListener(c2));

        JPanel d2 = new JPanel();
        d2.setBackground(darkSquares);
        JLabel dTwo = new JLabel();
        dTwo.setIcon(whitePawn);
        d2.add(dTwo);
        board.add(d2);
        dTwo.addMouseListener(new MouseClickListener(d2));

        JPanel e2 = new JPanel();
        e2.setBackground(lightSquares);
        JLabel eTwo = new JLabel();
        eTwo.setIcon(whitePawn);
        e2.add(eTwo);
        board.add(e2);
        eTwo.addMouseListener(new MouseClickListener(e2));

        JPanel f2 = new JPanel();
        f2.setBackground(darkSquares);
        JLabel fTwo = new JLabel();
        fTwo.setIcon(whitePawn);
        f2.add(fTwo);
        board.add(f2);
        f2.addMouseListener(new MouseClickListener(f2));

        JPanel g2 = new JPanel();
        g2.setBackground(lightSquares);
        JLabel gTwo = new JLabel();
        gTwo.setIcon(whitePawn);
        g2.add(gTwo);
        board.add(g2);
        g2.addMouseListener(new MouseClickListener(g2));

        JPanel h2 = new JPanel();
        h2.setBackground(darkSquares);
        JLabel hTwo = new JLabel();
        hTwo.setIcon(whitePawn);
        h2.add(hTwo);
        board.add(h2);
        h2.addMouseListener(new MouseClickListener(h2));

        JPanel a1 = new JPanel();
        a1.setBackground(darkSquares);
        JLabel aOne = new JLabel();
        aOne.setIcon(whiteRook);
        a1.add(aOne);
        board.add(a1);
        a1.addMouseListener(new MouseClickListener(a1));

        JPanel b1 = new JPanel();
        b1.setBackground(lightSquares);
        JLabel bOne = new JLabel();
        bOne.setIcon(whiteKnight);
        b1.add(bOne);
        b1.addMouseListener(new MouseClickListener(b1));
        board.add(b1);

        JPanel c1 = new JPanel();
        c1.setBackground(darkSquares);
        JLabel cOne = new JLabel();
        cOne.setIcon(whiteBishop);
        c1.add(cOne);
        c1.addMouseListener(new MouseClickListener(c1));
        board.add(c1);

        JPanel d1 = new JPanel();
        d1.setBackground(lightSquares);
        JLabel dOne = new JLabel();
        dOne.setIcon(whiteQueen);
        d1.add(dOne);
        d1.addMouseListener(new MouseClickListener(d1));
        board.add(d1);

        JPanel e1 = new JPanel();
        e1.setBackground(darkSquares);
        JLabel eOne = new JLabel();
        eOne.setIcon(whiteKing);
        e1.add(eOne);
        e1.addMouseListener(new MouseClickListener(e1));
        board.add(e1);

        JPanel f1 = new JPanel();
        f1.setBackground(lightSquares);
        JLabel fOne = new JLabel();
        fOne.setIcon(whiteBishop);
        f1.add(fOne);
        f1.addMouseListener(new MouseClickListener(f1));
        board.add(f1);

        JPanel g1 = new JPanel();
        g1.setBackground(darkSquares);
        JLabel gOne = new JLabel();
        gOne.setIcon(whiteKnight);
        g1.add(gOne);
        g1.addMouseListener(new MouseClickListener(g1));
        board.add(g1);

        JPanel h1 = new JPanel();
        h1.setBackground(lightSquares);
        JLabel hOne = new JLabel();
        hOne.setIcon(whiteRook);
        h1.add(hOne);
        h1.addMouseListener(new MouseClickListener(h1));
        board.add(h1);
        

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

            var optionsMenu = new OptionsMenu(window);
            optionsMenu.init();
            window.pack();
            window.setLocationRelativeTo(null); 
            window.revalidate();
        });

        newGame.addActionListener( e -> {
            window.getContentPane().removeAll();
            var gameBoard = new GameBoard(window);
            gameBoard.init();
            window.pack();
            window.setLocationRelativeTo(null); 
            window.revalidate();
        });
    }
}
