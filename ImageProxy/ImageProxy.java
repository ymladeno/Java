import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {
    ImageIcon imageIcon;
    StateImage imageNotLoaded;
    StateImage imageLoaded;
    StateImage currentState;
    URL imageUrl;

    @Override
    public int getIconHeight() {
        return currentState.getIconHeight();
    }

    @Override
    public int getIconWidth() {
        return currentState.getIconWidth();
    }

    @Override
    public void paintIcon(Component arg0, Graphics arg1, int arg2, int arg3) {
        currentState.paintIcon(arg0, arg1, arg2, arg3);        
    }

    public ImageProxy(URL url) {
        imageNotLoaded = new ImageNotLoaded(this);
        imageLoaded = new ImageLoaded(this);

        currentState = imageNotLoaded;
        imageUrl = url;
    }

    public void setCurrentState(StateImage state) { currentState = state; }
    public StateImage getImageLoadedState() { return imageLoaded; }
    public StateImage getImageNotLoadedState() { return imageNotLoaded; }
    public void createImageIcon() { imageIcon = new ImageIcon(imageUrl, "CD Cover"); }
    public ImageIcon getImageIcon() { return imageIcon; }
}
