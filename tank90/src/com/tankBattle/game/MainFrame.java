package com.tankBattle.game;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author 欧欧
 * @version 1.0
 */
public class MainFrame extends JFrame {

    GamePanel gp = null;

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
    }

    public MainFrame() {
        gp = new GamePanel();
        Thread thread = new Thread(gp);
        thread.start();
        this.add(gp);
        this.setSize(1000,750);
        this.addKeyListener(gp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        // add a listener of close
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recoder.keepRecord();
                System.exit(0);
            }
        });
    }
}
