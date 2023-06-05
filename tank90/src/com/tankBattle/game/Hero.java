package com.tankBattle.game;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Vector;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Hero extends Tank {
    Shot shot = null;
//    Vector<Shot> shots = new Vector<>();
    public Hero(int x, int y) {
        super(x, y);
    }


    public void shotEnemyTank() {
//        if (shots.size() == 5) {
//            return;
//        }
//        Shot shot = null;
        switch (getDirect()) {
            case 0:
                shot = new Shot(getX() + 20 - 3, getY(),0);

                break;

            case 1:
                shot = new Shot(getX() + 60, getY() + 20 - 3,1);

                break;
            case 2:
                shot = new Shot(getX() + 20 - 3, getY() + 60,2);
                break;
            case 3:
                shot = new Shot(getX(),getY() + 20 - 3,3);
                break;
        }


//        shots.add(shot);
        Thread thread = new Thread(shot);
        thread.start();

    }







}
