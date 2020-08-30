package view;

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
        Color darkSquares = new Color(40, 90, 0);
        Color lightSquares = new Color(240, 227, 200);

        // generate chessboard squares out of JPanels
        JPanel a8 = new JPanel();
        a8.setBackground(lightSquares);
        board.add(a8);
        a8.addMouseListener(new MouseClickListener(a8));

        JPanel b8 = new JPanel();
        b8.setBackground(darkSquares);
        board.add(b8);
        b8.addMouseListener(new MouseClickListener(b8));

        JPanel c8 = new JPanel();
        c8.setBackground(lightSquares);
        board.add(c8);
        c8.addMouseListener(new MouseClickListener(c8));

        JPanel d8 = new JPanel();
        d8.setBackground(darkSquares);
        board.add(d8);
        d8.addMouseListener(new MouseClickListener(d8));

        JPanel e8 = new JPanel();
        e8.setBackground(lightSquares);
        board.add(e8);
        e8.addMouseListener(new MouseClickListener(e8));

        JPanel f8 = new JPanel();
        f8.setBackground(darkSquares);
        board.add(f8);
        f8.addMouseListener(new MouseClickListener(f8));

        JPanel g8 = new JPanel();
        g8.setBackground(lightSquares);
        board.add(g8);
        g8.addMouseListener(new MouseClickListener(g8));

        JPanel h8 = new JPanel();
        h8.setBackground(darkSquares);
        board.add(h8);
        JPanel a7 = new JPanel();
        a7.setBackground(darkSquares);
        board.add(a7);
        JPanel b7 = new JPanel();
        b7.setBackground(lightSquares);
        board.add(b7);
        JPanel c7 = new JPanel();
        c7.setBackground(darkSquares);
        board.add(c7);
        JPanel d7 = new JPanel();
        d7.setBackground(lightSquares);
        board.add(d7);
        JPanel e7 = new JPanel();
        e7.setBackground(darkSquares);
        board.add(e7);
        JPanel f7 = new JPanel();
        f7.setBackground(lightSquares);
        board.add(f7);
        JPanel g7 = new JPanel();
        g7.setBackground(darkSquares);
        board.add(g7);
        JPanel h7 = new JPanel();
        h7.setBackground(lightSquares);
        board.add(h7);
        JPanel a6 = new JPanel();
        a6.setBackground(lightSquares);
        board.add(a6);
        JPanel b6 = new JPanel();
        b6.setBackground(darkSquares);
        board.add(b6);
        JPanel c6 = new JPanel();
        c6.setBackground(lightSquares);
        board.add(c6);
        JPanel d6 = new JPanel();
        d6.setBackground(darkSquares);
        board.add(d6);
        JPanel e6 = new JPanel();
        e6.setBackground(lightSquares);
        board.add(e6);
        JPanel f6 = new JPanel();
        f6.setBackground(darkSquares);
        board.add(f6);
        JPanel g6 = new JPanel();
        g6.setBackground(lightSquares);
        board.add(g6);
        JPanel h6 = new JPanel();
        h6.setBackground(darkSquares);
        board.add(h6);
        JPanel a5 = new JPanel();
        a5.setBackground(darkSquares);
        board.add(a5);
        JPanel b5 = new JPanel();
        b5.setBackground(lightSquares);
        board.add(b5);
        JPanel c5 = new JPanel();
        c5.setBackground(darkSquares);
        board.add(c5);
        JPanel d5 = new JPanel();
        d5.setBackground(lightSquares);
        board.add(d5);
        JPanel e5 = new JPanel();
        e5.setBackground(darkSquares);
        board.add(e5);
        JPanel f5 = new JPanel();
        f5.setBackground(lightSquares);
        board.add(f5);
        JPanel g5 = new JPanel();
        g5.setBackground(darkSquares);
        board.add(g5);
        JPanel h5 = new JPanel();
        h5.setBackground(lightSquares);
        board.add(h5);
        JPanel a4 = new JPanel();
        a4.setBackground(lightSquares);
        board.add(a4);
        JPanel b4 = new JPanel();
        b4.setBackground(darkSquares);
        board.add(b4);
        JPanel c4 = new JPanel();
        c4.setBackground(lightSquares);
        board.add(c4);
        JPanel d4 = new JPanel();
        d4.setBackground(darkSquares);
        board.add(d4);
        JPanel e4 = new JPanel();
        e4.setBackground(lightSquares);
        board.add(e4);
        JPanel f4 = new JPanel();
        f4.setBackground(darkSquares);
        board.add(f4);
        JPanel g4 = new JPanel();
        g4.setBackground(lightSquares);
        board.add(g4);
        JPanel h4 = new JPanel();
        h4.setBackground(darkSquares);
        board.add(h4);
        JPanel a3 = new JPanel();
        a3.setBackground(darkSquares);
        board.add(a3);
        JPanel b3 = new JPanel();
        b3.setBackground(lightSquares);
        board.add(b3);
        JPanel c3 = new JPanel();
        c3.setBackground(darkSquares);
        board.add(c3);
        JPanel d3 = new JPanel();
        d3.setBackground(lightSquares);
        board.add(d3);
        JPanel e3 = new JPanel();
        e3.setBackground(darkSquares);
        board.add(e3);
        JPanel f3 = new JPanel();
        f3.setBackground(lightSquares);
        board.add(f3);
        JPanel g3 = new JPanel();
        g3.setBackground(darkSquares);
        board.add(g3);
        JPanel h3 = new JPanel();
        h3.setBackground(lightSquares);
        board.add(h3);
        JPanel a2 = new JPanel();
        a2.setBackground(lightSquares);
        board.add(a2);
        JPanel b2 = new JPanel();
        b2.setBackground(darkSquares);
        board.add(b2);
        JPanel c2 = new JPanel();
        c2.setBackground(lightSquares);
        board.add(c2);
        JPanel d2 = new JPanel();
        d2.setBackground(darkSquares);
        board.add(d2);
        JPanel e2 = new JPanel();
        e2.setBackground(lightSquares);
        board.add(e2);
        JPanel f2 = new JPanel();
        f2.setBackground(darkSquares);
        board.add(f2);
        JPanel g2 = new JPanel();
        g2.setBackground(lightSquares);
        board.add(g2);
        JPanel h2 = new JPanel();
        h2.setBackground(darkSquares);
        board.add(h2);
        JPanel a1 = new JPanel();
        a1.setBackground(darkSquares);
        board.add(a1);
        JPanel b1 = new JPanel();
        b1.setBackground(lightSquares);
        board.add(b1);
        JPanel c1 = new JPanel();
        c1.setBackground(darkSquares);
        board.add(c1);
        JPanel d1 = new JPanel();
        d1.setBackground(lightSquares);
        board.add(d1);
        JPanel e1 = new JPanel();
        e1.setBackground(darkSquares);
        board.add(e1);
        JPanel f1 = new JPanel();
        f1.setBackground(lightSquares);
        board.add(f1);
        JPanel g1 = new JPanel();
        g1.setBackground(darkSquares);
        board.add(g1);
        JPanel h1 = new JPanel();
        h1.setBackground(lightSquares);
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
