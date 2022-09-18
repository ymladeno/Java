import java.awt.Component;
import java.awt.Graphics;

public class ImageLoaded implements StateImage {
    ImageProxy context;

    @Override
    public int getIconHeight() {
        return context.getImageIcon().getIconHeight();
    }

    @Override
    public int getIconWidth() {
        return context.getImageIcon().getIconWidth();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        context.getImageIcon().paintIcon(c, g, x, y);        
    }

    public ImageLoaded(ImageProxy context) { this.context = context; }
}
