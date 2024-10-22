package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.Clock;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class OptionsMenu {
    static double saveTime = 0.0;
    double tempTime = saveTime;
    String tempTheme = "";
    Clock clock;

    JFrame window = new JFrame();

    public OptionsMenu(JFrame window, Clock clock) {
        this.clock = clock;
        this.window = window;
        window.setTitle("Options");
    }

    public void init() {
        Container container = window.getContentPane();



        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 300));
        panel.setLayout(new GridLayout(3,3));

        JPanel group = new JPanel();
        group.setPreferredSize(new Dimension(300, 400));

        JLabel header = new JLabel("Select Time Limit", SwingConstants.CENTER);
        header.setFont(new Font("Heveltica", Font.PLAIN, 24));
        group.add(BorderLayout.NORTH, header);
        group.add(BorderLayout.CENTER, panel);

        JPanel south = new JPanel();
        south.setPreferredSize(new Dimension(200, 30));
        south.setLayout(new GridLayout(1,2));

        JPanel east = new JPanel();
        east.setPreferredSize(new Dimension(300, 300));
        east.setLayout(new GridLayout(2, 1));

        JLabel theme = new JLabel("Theme", SwingConstants.CENTER);
        theme.setFont(new Font("Heveltica", Font.PLAIN, 24));
        theme.setPreferredSize(new Dimension(100,30));

        JPanel group2 = new JPanel();
        group2.setPreferredSize(new Dimension(300, 400));

        group2.add(BorderLayout.NORTH, theme);
        group2.add(BorderLayout.CENTER, east);

        JButton marble = new JButton("Marble");
        JButton tournament = new JButton("Tournament");
        JButton dark = new JButton("Dark");

        if (GameBoard.getTheme() == "marble") {
            marble.setForeground(Color.RED);
            tournament.setForeground(Color.BLACK);
            dark.setForeground(Color.BLACK);
        } else if (GameBoard.getTheme() == "tournament") {
            marble.setForeground(Color.BLACK);
            tournament.setForeground(Color.RED);
            dark.setForeground(Color.BLACK);
        } else {
            marble.setForeground(Color.BLACK);
            tournament.setForeground(Color.BLACK);
            dark.setForeground(Color.RED);
        }

        east.add(marble);
        east.add(tournament);
        east.add(dark);

        JButton cancel = new JButton("Cancel");
        JButton save = new JButton("Save");

        south.add(cancel);
        south.add(save);
        
        JButton oneMin = new JButton("1 min");
        JButton twoMin = new JButton("2 mins");
        JButton thrMin = new JButton("3 mins");
        JButton fiveMin = new JButton("5 mins");
        JButton tenMin = new JButton("10 mins");
        JButton fifteen = new JButton("15 mins");
        JButton thirty = new JButton("30 mins");
        JButton sixty  = new JButton("60 mins");
        JButton twohrs = new JButton("2 hours");

        panel.add(oneMin);
        panel.add(twoMin);
        panel.add(thrMin);
        panel.add(fiveMin);
        panel.add(tenMin);
        panel.add(fifteen);
        panel.add(thirty);
        panel.add(sixty);
        panel.add(twohrs);

        container.add(BorderLayout.CENTER, group);
        container.add(BorderLayout.SOUTH, south);
        container.add(BorderLayout.EAST, group2);

        // set selected time based on previous save value
        switch ((int)saveTime) {
            case 0: tenMin.setForeground(Color.RED); break;
            case 1: oneMin.setForeground(Color.RED); break;
            case 2: twoMin.setForeground(Color.RED); break;
            case 3: thrMin.setForeground(Color.RED); break;
            case 5: fiveMin.setForeground(Color.RED); break;
            case 10: tenMin.setForeground(Color.RED); break;
            case 15: fifteen.setForeground(Color.RED); break;
            case 30: thirty.setForeground(Color.RED); break;
            case 60: sixty.setForeground(Color.RED); break;
            case 120: twohrs.setForeground(Color.RED); break;
            default: break;
        }

        // highlight red for selected time value. Continues for all buttons
        oneMin.addActionListener( e -> {
            oneMin.setForeground(Color.RED);
            twoMin.setForeground(Color.BLACK);
            thrMin.setForeground(Color.BLACK);
            fiveMin.setForeground(Color.BLACK);
            tenMin.setForeground(Color.BLACK);
            fifteen.setForeground(Color.BLACK);
            thirty.setForeground(Color.BLACK);
            sixty.setForeground(Color.BLACK);
            twohrs.setForeground(Color.BLACK);
            tempTime = 1.0;
        });

        twoMin.addActionListener( e -> {
            oneMin.setForeground(Color.BLACK);
            twoMin.setForeground(Color.RED);
            thrMin.setForeground(Color.BLACK);
            fiveMin.setForeground(Color.BLACK);
            tenMin.setForeground(Color.BLACK);
            fifteen.setForeground(Color.BLACK);
            thirty.setForeground(Color.BLACK);
            sixty.setForeground(Color.BLACK);
            twohrs.setForeground(Color.BLACK);
            tempTime = 2.0;
        });

        thrMin.addActionListener( e -> {
            oneMin.setForeground(Color.BLACK);
            twoMin.setForeground(Color.BLACK);
            thrMin.setForeground(Color.RED);
            fiveMin.setForeground(Color.BLACK);
            tenMin.setForeground(Color.BLACK);
            fifteen.setForeground(Color.BLACK);
            thirty.setForeground(Color.BLACK);
            sixty.setForeground(Color.BLACK);
            twohrs.setForeground(Color.BLACK);
            tempTime = 3.0;
        });

        fiveMin.addActionListener( e -> {
            oneMin.setForeground(Color.BLACK);
            twoMin.setForeground(Color.BLACK);
            thrMin.setForeground(Color.BLACK);
            fiveMin.setForeground(Color.RED);
            tenMin.setForeground(Color.BLACK);
            fifteen.setForeground(Color.BLACK);
            thirty.setForeground(Color.BLACK);
            sixty.setForeground(Color.BLACK);
            twohrs.setForeground(Color.BLACK);
            tempTime = 5.0;
        });

        tenMin.addActionListener( e -> {
            oneMin.setForeground(Color.BLACK);
            twoMin.setForeground(Color.BLACK);
            thrMin.setForeground(Color.BLACK);
            fiveMin.setForeground(Color.BLACK);
            tenMin.setForeground(Color.RED);
            fifteen.setForeground(Color.BLACK);
            thirty.setForeground(Color.BLACK);
            sixty.setForeground(Color.BLACK);
            twohrs.setForeground(Color.BLACK);
            tempTime = 10.0;
        });

        fifteen.addActionListener( e -> {
            oneMin.setForeground(Color.BLACK);
            twoMin.setForeground(Color.BLACK);
            thrMin.setForeground(Color.BLACK);
            fiveMin.setForeground(Color.BLACK);
            tenMin.setForeground(Color.BLACK);
            fifteen.setForeground(Color.RED);
            thirty.setForeground(Color.BLACK);
            sixty.setForeground(Color.BLACK);
            twohrs.setForeground(Color.BLACK);
            tempTime = 15.0;
        });

        thirty.addActionListener( e -> {
            oneMin.setForeground(Color.BLACK);
            twoMin.setForeground(Color.BLACK);
            thrMin.setForeground(Color.BLACK);
            fiveMin.setForeground(Color.BLACK);
            tenMin.setForeground(Color.BLACK);
            fifteen.setForeground(Color.BLACK);
            thirty.setForeground(Color.RED);
            sixty.setForeground(Color.BLACK);
            twohrs.setForeground(Color.BLACK);
            tempTime = 30.0;
        });

        sixty.addActionListener( e -> {
            oneMin.setForeground(Color.BLACK);
            twoMin.setForeground(Color.BLACK);
            thrMin.setForeground(Color.BLACK);
            fiveMin.setForeground(Color.BLACK);
            tenMin.setForeground(Color.BLACK);
            fifteen.setForeground(Color.BLACK);
            thirty.setForeground(Color.BLACK);
            sixty.setForeground(Color.RED);
            twohrs.setForeground(Color.BLACK);
            tempTime = 60.0;
        });
        
        twohrs.addActionListener( e -> {
            oneMin.setForeground(Color.BLACK);
            twoMin.setForeground(Color.BLACK);
            thrMin.setForeground(Color.BLACK);
            fiveMin.setForeground(Color.BLACK);
            tenMin.setForeground(Color.BLACK);
            fifteen.setForeground(Color.BLACK);
            thirty.setForeground(Color.BLACK);
            sixty.setForeground(Color.BLACK);
            twohrs.setForeground(Color.RED);
            tempTime = 120.0;
        });

        marble.addActionListener( e -> {
            marble.setForeground(Color.RED);
            tournament.setForeground(Color.BLACK);
            dark.setForeground(Color.BLACK);
            tempTheme = "marble";
        });

        tournament.addActionListener( e -> {
            marble.setForeground(Color.BLACK);
            dark.setForeground(Color.BLACK);
            tournament.setForeground(Color.RED);
            tempTheme = "tournament";
        });

        dark.addActionListener( e -> {
            marble.setForeground(Color.BLACK);
            tournament.setForeground(Color.BLACK);
            dark.setForeground(Color.RED);
            tempTheme = "dark";
        });

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
            GameBoard.setTheme(tempTheme);
            saveTime = tempTime;
            clock.updateClock(saveTime);
        });
    }

    public double getTimer() {
        return saveTime;
    }
}