package org.xander.Proxy.VirtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon{
    ImageIcon imageIcon;
    URL imageURL;
    Thread retrievalThread;
    boolean retriving = false;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading a cover, please wait...", x+300, y+190);
            if (!retriving) {
                retriving = true;
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            imageIcon = new ImageIcon(imageURL, "Cover");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }

    }
}
