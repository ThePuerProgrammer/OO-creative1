package controller;

import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import java.awt.Color;

// THIS IS THE COOLEST!!
public class MouseClickListener implements MouseInputListener {

    Color prev = new Color(0,0,0,0);

    JPanel panel = new JPanel();

    public MouseClickListener(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        prev = panel.getBackground();
        panel.setBackground(new Color(255, 195, 45, 200));
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        // extract JLabel from JPanel using a cast
        // solution source https://stackoverflow.com/questions/35872196/java-accessing-jlabel-inside-jpanel
        JLabel jL = (JLabel)panel.getComponent(0);

        // test if jL is empty square
        // reset color if true
        if (jL.getIcon() == null) {
            panel.setBackground(prev);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    
}