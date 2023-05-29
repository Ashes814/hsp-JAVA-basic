package com.tankBattle.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author 欧欧
 * @version 1.0
 */
public class GamePanel extends JPanel implements KeyListener {
     int initX = 300;
     int initY = 200;

    Hero hero = null;

    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;
    Hero enemy1;
    Hero enemy2;
    Hero enemy3;


    public GamePanel() {
        hero = new Hero(initX, initY);
        for (int i = 0; i < enemyTankSize; i++) {
            enemyTanks.add(new EnemyTank(100*(i + 1), 0));

        }


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        hero.setSpeed(10);
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(),1);


        for (EnemyTank enemyTank: enemyTanks) {
            drawTank(enemyTank.getX(), enemyTank.getY(), g, 2,0);
        }




//        g.fillOval(x,y,20,20);
    }


    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {
            case 87:
                hero.setDirect(0);
                hero.moveUp();
                break;
            case 68:
                hero.setDirect(1);
                hero.moveRight();
                break;
            case 83:
                hero.setDirect(2);
                hero.moveDown();
                break;
            case 65:
                hero.setDirect(3);
                hero.moveLeft();
                break;
            default:
                System.out.println(e.getKeyCode());
        }
        this.repaint();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void drawTank(int x, int y, Graphics g,int direction, int type) {




        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }

        switch (direction) {
            case 0:
                g.fill3DRect(x,y,10,60, false);
                g.fill3DRect( x+ 10,y + 10,20,40, false);
                g.fill3DRect(x + 10 + 20, y, 10 , 60, false);
                g.fillOval(x + 10,y + 20, 20, 20);
                g.drawLine(x + 20, y, x + 20, y + 10 + 20);
                break;
            case 1:
                g.fill3DRect(x,y,60,10, false);
                g.fill3DRect( x + 10,y + 10,40,20, false);
                g.fill3DRect(x,y  + 10 + 20,60,10, false);
                g.fillOval(x + 20,y + 10 , 20, 20);
                g.drawLine(x + 10 + 20, y + 20, x + 60 , y + 20);
                break;
            case 2:
                g.fill3DRect(x,y,10,60, false);
                g.fill3DRect( x+ 10,y + 10,20,40, false);
                g.fill3DRect(x + 10 + 20, y, 10 , 60, false);
                g.fillOval(x + 10,y + 20, 20, 20);
                g.drawLine(x + 20, y+ 10 + 20, x + 20, y+ 10 + 20 + 30);
                break;
            case 3:
                g.fill3DRect(x,y,60,10, false);
                g.fill3DRect( x + 10,y + 10,40,20, false);
                g.fill3DRect(x,y  + 10 + 20,60,10, false);
                g.fillOval(x + 20,y + 10 , 20, 20);
                g.drawLine(x + 10 + 20, y + 20, x, y + 20);
                break;

        }

    }
}
