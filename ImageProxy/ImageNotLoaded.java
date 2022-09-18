import java.awt.Component;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class ImageNotLoaded implements StateImage {
    Thread retrievalThread;
    ImageProxy context;

    @Override
    public int getIconHeight() {
        return 600;
    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawString("Loading...Please wait.", x+300, y+150);
        retrievalThread = new Thread(new Runnable() {
            public void run() {
                try {
                    context.createImageIcon();
                    c.repaint();
                    context.setCurrentState(context.getImageLoadedState());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        retrievalThread.start();
    }

    public ImageNotLoaded(ImageProxy context) {
        this.context = context;
    }
}
