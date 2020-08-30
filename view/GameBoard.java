package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class GameBoard {
    JFrame window = new JFrame();

    public GameBoard(JFrame window) {
        this.window = window;
        window.setPreferredSize(new Dimension(800,800));
        window.setTitle("New Game");
    }

    public void init() {
        Container container = window.getContentPane();
        JPanel panel = new JPanel();
        JPanel board = new JPanel();
        JPanel clock = new JPanel();
        JPanel moves = new JPanel();
        JPanel play1 = new JPanel();
        JPanel play2 = new JPanel();

        container.add(BorderLayout.EAST, panel);
        
        JButton quit = new JButton("Quit Game");
        panel.add(quit);

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
