package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class OptionsMenu {
    JFrame window = new JFrame();

    public OptionsMenu(JFrame window) {
        this.window = window;
        window.setTitle("Options");
    }

    public void init() {
        Container container = window.getContentPane();
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 300));
        panel.setLayout(new GridLayout(3,3));

        JPanel south = new JPanel();
        south.setPreferredSize(new Dimension(500, 30));
        south.setLayout(new GridLayout(1,2));

        JButton cancel = new JButton("Cancel");
        JButton save = new JButton("Save");

        south.add(cancel);
        south.add(save);
        
        JButton oneMin = new JButton("1");
        JButton twoMin = new JButton("2");
        JButton thrMin = new JButton("3");
        JButton fiveMin = new JButton("5");
        JButton tenMin = new JButton("10");
        JButton fifteen = new JButton("15");
        JButton thirty = new JButton("30");
        JButton fiveTwo = new JButton("5|2");
        JButton tenTwo = new JButton("10|2");

        panel.add(oneMin);
        panel.add(twoMin);
        panel.add(thrMin);
        panel.add(fiveMin);
        panel.add(tenMin);
        panel.add(fifteen);
        panel.add(thirty);
        panel.add(fiveTwo);
        panel.add(tenTwo);

        container.add(BorderLayout.NORTH, panel);
        container.add(BorderLayout.SOUTH, south);

        cancel.addActionListener( e -> {
            window.getContentPane().removeAll();
            var mainMenu = new MainMenu(window);
            mainMenu.init();
            window.pack();
            window.setLocationRelativeTo(null); 
            window.revalidate();
        });

        save.addActionListener( e -> {
            window.getContentPane().removeAll();
            var mainMenu = new MainMenu(window);
            mainMenu.init();
            window.pack();
            window.setLocationRelativeTo(null); 
            window.revalidate();
        });
    }
}