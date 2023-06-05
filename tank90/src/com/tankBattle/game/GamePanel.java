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
public class GamePanel extends JPanel implements KeyListener,Runnable {
     int initX = 300;
     int initY = 200;

    Hero hero = null;

    Vector<EnemyTank> enemyTanks = new Vector<>();
    Vector<Bomb> bombs = new Vector<>();

    int enemyTankSize = 3;

    Image image1 = null;
    Image image2 = null;
    Image image3 = null;



    public GamePanel() {
        hero = new Hero(initX, initY);
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank(100*(i + 1), 0);
            enemyTank.setDirect(2);
            Shot shot = new Shot(enemyTank.getX() + 20,  enemyTank.getY() + 60, enemyTank.getDirect());
            enemyTank.enemyShots.add(shot);
            Thread thread = new Thread(shot);
            thread.start();
            enemyTanks.add(enemyTank);
            Thread threadEnemyTank = new Thread(enemyTank);
            threadEnemyTank.start();


        }

        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/boom01.png"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/boom02.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/boom03.png"));


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        hero.setSpeed(100);

        if (hero.isLive) {
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(),1);
        }


//        for (Shot shot: hero.shots ) {
//            if (shot != null && shot.isLive) {
//                g.fillOval(shot.x, shot.y, 6,6);
//            } else {
//                hero.shots.remove(shot);
//            }
//        }
        if (hero.shot != null && hero.shot.isLive) {
                g.fillOval(hero.shot.x, hero.shot.y, 6,6);
        }

        for (int i = 0; i < bombs.size(); i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Bomb bomb = bombs.get(i);
            if (bomb.life > 6) {
                g.drawImage(image1, bomb.x, bomb.y,60,60,this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y,60,60,this);
            } else {
                g.drawImage(image3, bomb.x, bomb.y,60,60,this);
            }
            bomb.lifeDown();
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }

        }

        for (EnemyTank enemyTank: enemyTanks) {
            if (enemyTank.isLive) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(),0);


            for (int j = 0; j < enemyTank.enemyShots.size();j++) {
                Shot shot = enemyTank.enemyShots.get(j);
                if (shot.isLive) {
                    g.fillOval(shot.x, shot.y, 6,6);
                } else {
                    enemyTank.enemyShots.remove(shot);
                }

            };
        } else {
                enemyTanks.remove(enemyTank);
            }
        }




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
            case 74:

                if (hero.shot == null || !hero.shot.isLive) {
                    hero.shotEnemyTank();
                }




            default:
                System.out.println(e.getKeyCode());
        }
        this.repaint();

    }


    public void hitTank(Shot s, Tank enemyTank) {
        switch (enemyTank.getDirect()) {
            case 0:
            case 2:
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40 && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    enemyTanks.remove(enemyTank);
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);

                }
                break;
            case 1:
            case 3:
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60 && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    enemyTanks.remove(enemyTank);
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;

        }
    }

    public void hitHero() {
        for (int i = 0; i< enemyTanks.size();i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            for (int j = 0; j < enemyTank.enemyShots.size(); j++) {
                Shot shot = enemyTank.enemyShots.get(j);
                if (hero.isLive && shot.isLive) {
                    hitTank(shot, hero);
                }

            }
        }
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
//    public void hitEnemyTank() {
//        if (hero.shots != null) {
//            for (int i = 0; i < hero.shots.size(); i++) {
//                Shot shot = hero.shots.get(i);
//                for (int j = 0; j < enemyTanks.size(); j++) {
//                    EnemyTank enemyTank = enemyTanks.get(j);
//                    if (shot != null && shot.isLive)
//                        hitTank(shot, enemyTank);
//                    }
//
//            }
//
//        }
//    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

//            hitEnemyTank();


//            if (hero.shot != null && hero.shot.isLive) {
//                for (EnemyTank enemyTank: enemyTanks) {
//                    hitTank(hero.shot, enemyTank);
//                }
//            }
            if (hero.shot != null && hero.shot.isLive) {
                for (int i = 0; i < enemyTanks.size(); i++) {
                    hitTank(hero.shot, enemyTanks.get(i));
                }
            }
            hitHero();

            this.repaint();
        }
    }
}
