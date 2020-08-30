package view;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class MainMenu {
    JFrame window = new JFrame();

    public MainMenu(JFrame window) {
        this.window = window;
        window.setTitle("Wimpy Chess");
    }

    public void init() {
        Container container = window.getContentPane();
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 270));
        panel.setLayout(new GridLayout(2, 1));

        JButton newGame = new JButton("Play Chess!");
        newGame.setFont(new Font("Heveltica", Font.BOLD, 30));
        newGame.setForeground(new Color(255,100,100));

        JButton options = new JButton("Options");
        options.setFont(new Font("Heveltica", Font.PLAIN, 30));
        options.setForeground(Color.DARK_GRAY);

        panel.add(newGame);
        panel.add(options);

        container.add(BorderLayout.CENTER, panel);

        newGame.addActionListener( e -> {
            window.getContentPane().removeAll();
            var gameBoard = new GameBoard(window);
            gameBoard.init();
            window.pack();
            window.setLocationRelativeTo(null); 
            window.revalidate();
        });

        options.addActionListener( e -> {
            window.getContentPane().removeAll();
            var optionsMenu = new OptionsMenu(window);
            optionsMenu.init();
            window.pack();
            window.setLocationRelativeTo(null); 
            window.revalidate();
        });
    }
}