package main.brocode.gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyJFrame extends JFrame {

    public MyJFrame() {
        String imagePath = "images/icons8-java-100.png";
        ImageIcon imageIcon = IconChecker.createImageIcon(imagePath, "My description");

        String currentDir = System.getProperty("user.dir");
        System.out.println("Current Working Directory: " + currentDir);

        if (imageIcon != null) {
            System.out.println("Image icon created successfully");
        } else {
            System.err.println("Image icon icon does not exist");
            return;
        }
        setTitle("Welcome to my frame");
        setSize(420, 420);
        setVisible(true);
        setDefaultCloseOperation(MyJFrame.EXIT_ON_CLOSE);
        setIconImage(imageIcon.getImage());
    }
}
