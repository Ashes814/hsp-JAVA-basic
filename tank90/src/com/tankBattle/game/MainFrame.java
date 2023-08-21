package com.tankBattle.game;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

/**
 * @author 欧欧
 * @version 1.0
 */
public class MainFrame extends JFrame {

    GamePanel gp = null;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        MainFrame mainFrame = new MainFrame();

    }

    public MainFrame() {
        System.out.println("1: new game; 2:continue");
        String key = scanner.next();
        gp = new GamePanel(key);
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
