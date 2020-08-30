package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Font;

public class GameBoard {
    JFrame window = new JFrame();

    public GameBoard(JFrame window) {
        this.window = window;
        window.setPreferredSize(new Dimension(1200,800));
        window.setTitle("Play Wimpy Chess");
    }

    public void init() {
        Container container = window.getContentPane();
        JPanel settings = new JPanel();
        settings.setPreferredSize(new Dimension(400, 800));
        JPanel panel = new JPanel();
        JPanel board = new JPanel();
        board.setPreferredSize(new Dimension(600, 600));
        JPanel clock = new JPanel();
        JPanel moves = new JPanel();
        JPanel play1 = new JPanel();
        JPanel play2 = new JPanel();

        // settings buttons
        JButton quit = new JButton("Quit Game");
        JButton newGame = new JButton("New Game");
        JButton options = new JButton("Options");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(quit);
        buttonPanel.add(newGame);
        buttonPanel.add(options);

        JTextArea moveList = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(moveList, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(400, 600));

        JLabel moveMenu = new JLabel("Move History",SwingConstants.CENTER);
        moveMenu.setFont(new Font("Heveltica", Font.PLAIN, 30));
        moveMenu.setPreferredSize(new Dimension(400, 100));

        settings.add(moveMenu);
        settings.add(BorderLayout.CENTER, scrollPane);        
        settings.add(BorderLayout.SOUTH, buttonPanel);
        panel.add(settings);

        container.add(BorderLayout.EAST, panel);
        container.add(BorderLayout.CENTER, board);

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
    }
}
