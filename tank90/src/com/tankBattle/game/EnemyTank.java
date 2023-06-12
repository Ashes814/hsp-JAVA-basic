package com.tankBattle.game;

import java.util.Vector;
import java.util.Random;

/**
 * @author 欧欧
 * @version 1.0
 */
public class EnemyTank extends Tank implements Runnable{

    Vector<Shot> enemyShots = new Vector<>();
    public EnemyTank(int x, int y) {
        super(x, y);
        this.setDirect(2);

    }

    @Override
    public void run() {
        while (true) {
            if (isLive && enemyShots.size() <= 1) {
                Shot s = null;
                switch (getDirect()) {
                    case 0:
                        s = new Shot(getX() + 20 - 3, getY(), 0);
                        break;
                    case 1:
                        s = new Shot(getX() + 60, getY() + 20 - 3, 1);
                        break;
                    case 2:
                        s = new Shot(getX() + 20 - 3, getY() + 60, 2);
                        break;
                    case 3:
                        s = new Shot(getX() , getY() + 20 - 3, 3);
                        break;
                }
                enemyShots.add(s);
                new Thread(s).start();
            }

            switch (getDirect()) {
                case 0:
                    for (int i = 0; i < 30; i++) {
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        moveUp();
                    }

                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        moveRight();
                    }

                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        moveDown();
                    }

                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        moveLeft();
                    }

                    break;

            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            setDirect((int)(Math.random() * 4));

            if (!isLive) {
                break;
            }
//            System.out.println("Enemy Tank Run: " + this.getX() + ":" + this.getY());
        }
    }
}
