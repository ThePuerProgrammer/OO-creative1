import javax.swing.JFrame;

import view.MainMenu;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        var mainMenu = new MainMenu(window);
        mainMenu.init();

        window.pack();

        // center the window
        // called after .pack() to center based upon contents
        window.setLocationRelativeTo(null); 
        window.setVisible(true);
    }
}