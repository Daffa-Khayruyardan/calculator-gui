package main;

import javax.swing.*;

public class Window {
    private JFrame windows;
    private Component cmp;
   
    public Window() {
        this.windows = new JFrame();
        this.cmp = new Component();
    }

    public void open() {
        // set window title 
        this.windows.setTitle("calculator");

        // add main panel to window
        this.windows.add(cmp.calcPanel());

        // set window or frame to fit with panel
        windows.pack();

        // set close window to true
        this.windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // set window visibility true
        this.windows.setVisible(true);
    }
}
