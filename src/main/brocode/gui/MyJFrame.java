package main.brocode.gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyJFrame extends JFrame {

    public MyJFrame() {
        setTitle("Welcome to my frame");
        setSize(420, 420);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image = new ImageIcon("~/Downloads/icons8-java-100.png");
        setIconImage(image.getImage());
    }
}
