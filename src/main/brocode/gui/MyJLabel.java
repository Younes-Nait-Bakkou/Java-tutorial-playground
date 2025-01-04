package main.brocode.gui;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

public class MyJLabel extends JLabel {

    public MyJLabel() {
        String imagePath = "images/icons8-java-100.png";
        ImageIcon imageIcon = IconChecker.createImageIcon(imagePath, "My description");
        Border border = BorderFactory.createLineBorder(Color.GREEN);

        if (imageIcon != null) {
            System.out.println("Image icon created successfully");
        } else {
            System.err.println("Image icon icon does not exist");
            return;
        }

        setText("Welcome to my label");
        setIcon(imageIcon);
        setVerticalTextPosition(MyJLabel.BOTTOM); // set vertical text position related the icon image position
        setHorizontalTextPosition(MyJLabel.CENTER); // set horizontal text position related the icon image position
        setVerticalAlignment(MyJLabel.TOP); // set vertical items (icon + text) position inside the label
        setHorizontalAlignment(MyJLabel.LEFT); // set horizontal items (icon + text) position inside the label
        setForeground(Color.blue);
        setFont(new Font("MV Boli", Font.BOLD, 20));
        setIconTextGap(200);
        setBackground(Color.RED);
        setOpaque(true);
        setBorder(border);
    }

}
