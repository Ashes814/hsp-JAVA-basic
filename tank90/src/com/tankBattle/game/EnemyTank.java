package com.tankBattle.game;

import java.util.Vector;
import java.util.Random;

/**
 * @author 欧欧
 * @version 1.0
 */
public class EnemyTank extends Tank implements Runnable{

    Vector<Shot> enemyShots = new Vector<>();

    //增加成员EnemyTank，可以得到敌人坦克的Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    public EnemyTank(int x, int y) {
        super(x, y);
        this.setDirect(2);

    }

    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }

    //判断坦克是否发生碰撞
    public boolean isTouchEnemyTank() {
        int xMin;
        int xMax;
        int yMin;
        int yMax;
        int leftX;
        int leftY;
        int rightX;
        int rightY;

        //判断当前敌人坦克（this）的方向
        switch (this.getDirect()) {
            case 0:
                leftX = this.getX();
                leftY = this.getY();
                rightX = this.getX() + 40;
                rightY = this.getY();

                // let current tank to compare others one by one
                for (int i = 0; i < enemyTanks.size(); i++) {
                    // taking enemytank from vector
                    EnemyTank enemyTank = enemyTanks.get(i);
                    // except self
                    if (enemyTank != this) {
                        // enemyTank will be horizontal or vertical
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            xMin = enemyTank.getX();
                            xMax = enemyTank.getX() + 40;
                            yMin = enemyTank.getY();
                            yMax = enemyTank.getY() + 60;

                            if ((leftX >= xMin && leftX <= xMax && leftY >= yMin && leftY <= yMax) ||
                                (rightX >= xMin && rightX <= xMax && rightY >= yMin && rightY <= yMax)) {
                                return true;
                            }

                        }
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            xMin = enemyTank.getX();
                            xMax = enemyTank.getX() + 60;
                            yMin = enemyTank.getY();
                            yMax = enemyTank.getY() + 40;

                            if ((leftX >= xMin && leftX <= xMax && leftY >= yMin && leftY <= yMax) ||
                                    (rightX >= xMin && rightX <= xMax && rightY >= yMin && rightY <= yMax)) {
                                return true;
                            }

                        }
                    }
                }
                break;
            case 1:
                leftX = this.getX() + 60;
                leftY = this.getY();
                rightX = this.getX() + 60;
                rightY = this.getY() + 40;

                // let current tank to compare others one by one
                for (int i = 0; i < enemyTanks.size(); i++) {
                    // taking enemytank from vector
                    EnemyTank enemyTank = enemyTanks.get(i);
                    // except self
                    if (enemyTank != this) {
                        // enemyTank will be horizontal or vertical
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            xMin = enemyTank.getX();
                            xMax = enemyTank.getX() + 40;
                            yMin = enemyTank.getY();
                            yMax = enemyTank.getY() + 60;

                            if ((leftX >= xMin && leftX <= xMax && leftY >= yMin && leftY <= yMax) ||
                                    (rightX >= xMin && rightX <= xMax && rightY >= yMin && rightY <= yMax)) {
                                return true;
                            }

                        }
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            xMin = enemyTank.getX();
                            xMax = enemyTank.getX() + 60;
                            yMin = enemyTank.getY();
                            yMax = enemyTank.getY() + 40;

                            if ((leftX >= xMin && leftX <= xMax && leftY >= yMin && leftY <= yMax) ||
                                    (rightX >= xMin && rightX <= xMax && rightY >= yMin && rightY <= yMax)) {
                                return true;
                            }

                        }
                    }
                }
                break;
            case 2:
                leftX = this.getX();
                leftY = this.getY() + 60;
                rightX = this.getX() + 40;
                rightY = this.getY() + 60;

                // let current tank to compare others one by one
                for (int i = 0; i < enemyTanks.size(); i++) {
                    // taking enemytank from vector
                    EnemyTank enemyTank = enemyTanks.get(i);
                    // except self
                    if (enemyTank != this) {
                        // enemyTank will be horizontal or vertical
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            xMin = enemyTank.getX();
                            xMax = enemyTank.getX() + 40;
                            yMin = enemyTank.getY();
                            yMax = enemyTank.getY() + 60;

                            if ((leftX >= xMin && leftX <= xMax && leftY >= yMin && leftY <= yMax) ||
                                    (rightX >= xMin && rightX <= xMax && rightY >= yMin && rightY <= yMax)) {
                                return true;
                            }

                        }
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            xMin = enemyTank.getX();
                            xMax = enemyTank.getX() + 60;
                            yMin = enemyTank.getY();
                            yMax = enemyTank.getY() + 40;

                            if ((leftX >= xMin && leftX <= xMax && leftY >= yMin && leftY <= yMax) ||
                                    (rightX >= xMin && rightX <= xMax && rightY >= yMin && rightY <= yMax)) {
                                return true;
                            }

                        }
                    }
                }
                break;
            case 3:
                leftX = this.getX();
                leftY = this.getY() + 40;
                rightX = this.getX();
                rightY = this.getY();

                // let current tank to compare others one by one
                for (int i = 0; i < enemyTanks.size(); i++) {
                    // taking enemytank from vector
                    EnemyTank enemyTank = enemyTanks.get(i);
                    // except self
                    if (enemyTank != this) {
                        // enemyTank will be horizontal or vertical
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            xMin = enemyTank.getX();
                            xMax = enemyTank.getX() + 40;
                            yMin = enemyTank.getY();
                            yMax = enemyTank.getY() + 60;

                            if ((leftX >= xMin && leftX <= xMax && leftY >= yMin && leftY <= yMax) ||
                                    (rightX >= xMin && rightX <= xMax && rightY >= yMin && rightY <= yMax)) {
                                return true;
                            }

                        }
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            xMin = enemyTank.getX();
                            xMax = enemyTank.getX() + 60;
                            yMin = enemyTank.getY();
                            yMax = enemyTank.getY() + 40;

                            if ((leftX >= xMin && leftX <= xMax && leftY >= yMin && leftY <= yMax) ||
                                    (rightX >= xMin && rightX <= xMax && rightY >= yMin && rightY <= yMax)) {
                                return true;
                            }

                        }
                    }
                }
                break;
        }
        return false;
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
                        if (!isTouchEnemyTank()) {
                            moveUp();
                        }


                    }

                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        if (!isTouchEnemyTank()) {
                            moveRight();
                        }
                    }

                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        if (!isTouchEnemyTank()) {
                            moveDown();
                        }

                    }

                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        if (!isTouchEnemyTank()) {
                            moveLeft();
                        }
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
