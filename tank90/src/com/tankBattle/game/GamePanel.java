package com.tankBattle.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author 欧欧
 * @version 1.0
 */
public class GamePanel extends JPanel implements KeyListener {
     int x =10;
     int y = 10;

    Hero hero = null;

    public GamePanel() {
        hero = new Hero(100, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        hero.drawTank(g, 0, 1);

        g.fillOval(x,y,20,20);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {
            case 87:
                y--;
                break;
            case 83:
                break;
            case 65:
                break;
            case 68:
                break;
            default:
                System.out.println(e.getKeyCode());
        }
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
