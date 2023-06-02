package com.tankBattle.game;

import java.util.Vector;

/**
 * @author 欧欧
 * @version 1.0
 */
public class EnemyTank extends Tank{
boolean isLive = true;
    Vector<Shot> enemyShots = new Vector<>();
    public EnemyTank(int x, int y) {
        super(x, y);
        this.setDirect(2);

    }
}
