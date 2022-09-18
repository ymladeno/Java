package MVC;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DJView implements ActionListener, BeatObserver, BPMObserver {
    JButton increaseButton;
    JButton decreaseButton;
    JButton setBPM;
    JTextField bpmTextField;
    JLabel inputBpm;
    JLabel outputBpm;
    Beatbar beatBar;
    JMenu menu;
    JMenuItem startMenuItem;
    JMenuItem stopMenuItem;
    JMenuBar menuBar;
    JFrame viewFrame;
    JPanel viewPanel;
    JFrame controlFrame;
    JPanel controlPanel;
    ControllerInterface controller;
    BeatModelInterface model;

    public DJView(ControllerInterface controller, BeatModelInterface model) {
        this.controller = controller;
        this.model = model;
        model.registerObservers((BeatObserver)this);
        model.registerObservers((BPMObserver)this);
    }

    public void createViewFrame() {
        viewFrame = new JFrame("VIEW");
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.setSize(new Dimension(200, 100));
        beatBar = new Beatbar();
        beatBar.setValue(50);
        outputBpm = new JLabel("offline", SwingConstants.CENTER);
        JPanel bpmPanel = new JPanel(new GridLayout(2, 1));
        bpmPanel.add(beatBar);
        bpmPanel.add(outputBpm);
        viewPanel = new JPanel(new GridLayout(1, 2));
        viewPanel.add(bpmPanel);

        viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
        viewFrame.pack();
        viewFrame.setVisible(true);
    }

    public void createControlFrame() {
        controlFrame = new JFrame("CONTROL");
        controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlFrame.setSize(new Dimension(200, 100));

        menu = new JMenu("DJ Control");
        startMenuItem = new JMenuItem("Start");
        startMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.start();   
            }
        });

        stopMenuItem = new JMenuItem("Stop");
        stopMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.stop();   
            }
        });

        menu.add(startMenuItem);
        menu.add(stopMenuItem);
        
        menuBar = new JMenuBar();
        menuBar.add(menu);
        controlFrame.setJMenuBar(menuBar);

        increaseButton = new JButton(">>");
        increaseButton.addActionListener(this);

        decreaseButton = new JButton("<<");
        decreaseButton.addActionListener(this);

        setBPM = new JButton("Set");
        setBPM.addActionListener(this);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(decreaseButton);
        buttonPanel.add(increaseButton);

        bpmTextField = new JTextField(2);
        JPanel enterPanel = new JPanel(new GridLayout(1, 2));
        enterPanel.add(setBPM);
        enterPanel.add(bpmTextField);

        JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
        insideControlPanel.add(enterPanel);
        insideControlPanel.add(setBPM);
        insideControlPanel.add(buttonPanel);

        controlPanel = new JPanel(new GridLayout(1, 2));
        controlPanel.add(insideControlPanel);

        controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);
        controlFrame.pack();
        controlFrame.setVisible(true);
    }

    public void enableStartMenu() { startMenuItem.setEnabled(true); }
    public void disableStartMenu() { startMenuItem.setEnabled(false); }
    public void enableStopMenu() { stopMenuItem.setEnabled(true); }
    public void disableStopMenu() { stopMenuItem.setEnabled(false); }

    @Override
    public void updateBeat() {
        System.out.println("Update beat bar");
        beatBar.setValue(100);   
    }

    @Override
    public void updateBPM() {
        outputBpm.setText("Current BPM: " + model.getBPM());
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object sourceEvent = event.getSource();
        if (sourceEvent == setBPM) {
            int bpm = Integer.parseInt(bpmTextField.getText());
            controller.setBpm(bpm);
        } else if (sourceEvent == increaseButton) {
            controller.increaseBpm();
        } else if (sourceEvent == decreaseButton) {
            controller.descreaseBpm();
        }
        
    }
}
