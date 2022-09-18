package MVC;

import javax.swing.JProgressBar;

public class Beatbar extends JProgressBar implements Runnable {
    Thread thread;

    public Beatbar() {
        thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    @Override
    public void run() {
        for(;;) {
            int value = getValue();
            value *= (int).075;

            // System.out.println("val: " + value);
            setValue(value);
            repaint();
            try {
                Thread.sleep(100);
            } catch (Exception e) {
    
            }
        }
    }
}
