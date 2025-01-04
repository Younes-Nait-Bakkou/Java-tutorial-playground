package main.brocode.gui;

import java.net.URL;

import javax.swing.ImageIcon;

public class IconChecker {

    public static ImageIcon createImageIcon(String path, String description) {
        URL imgURL = IconChecker.class.getClassLoader().getResource(path);

        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find the file:" + path);
            return null;
        }
    }
}
