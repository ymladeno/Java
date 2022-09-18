import java.net.URL;

import javax.swing.*;

public class ImageIconTest {
    JFrame frame = new JFrame("CD cover viewer");
    ImageComponent imageComponent;
    JMenuBar menuBar;
    JMenu menu;

    public static void main(String[] args) {
        try {
            ImageIconTest test = new ImageIconTest();   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ImageIconTest() throws Exception {
        URL initUrl = new URL("http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");
        Icon icon = new ImageProxy(initUrl);
        imageComponent = new ImageComponent(icon);
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
