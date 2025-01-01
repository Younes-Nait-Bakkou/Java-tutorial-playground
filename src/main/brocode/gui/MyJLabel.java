package main.brocode.gui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyJLabel extends JLabel {

    public MyJLabel() {
        String imagePath = "imagessa/icons8-java-100.png";
        ImageIcon imageIcon = IconChecker.createImageIcon(imagePath, "My description");

        if (imageIcon != null) {
            System.out.println("Image icon created successfully");
        } else {
            System.err.println("Image icon icon does not exist");
            return;
        }
        setText("Welcome to my label");
        setIcon(imageIcon);
        setHorizontalAlignment(MyJLabel.CENTER);
    }
}
