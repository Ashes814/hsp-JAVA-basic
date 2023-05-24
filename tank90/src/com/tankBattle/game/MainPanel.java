package com.tankBattle.game;

import javax.swing.*;

/**
 * @author 欧欧
 * @version 1.0
 */
public class MainPanel extends JFrame {

    GamePanel gp = null;

    public static void main(String[] args) {
        MainPanel mainPanel = new MainPanel();
    }

    public MainPanel() {
        gp = new GamePanel();
        this.add(gp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
