package com.tankBattle.game;

import javax.swing.*;
import java.awt.*;

/**
 * @author 欧欧
 * @version 1.0
 */
public class GamePanel extends JPanel {
    Hero hero = null;

    public GamePanel() {
        hero = new Hero(100, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        hero.drawTank(g, 0, 0);
    }
}
