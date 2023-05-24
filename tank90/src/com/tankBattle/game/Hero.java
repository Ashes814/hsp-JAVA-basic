package com.tankBattle.game;

import java.awt.*;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Hero extends Tank {
    public Hero(int x, int y) {
        super(x, y);
    }

    public void drawTank(Graphics g, int direction, int type) {




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
                g.setColor(Color.cyan);
                g.fill3DRect(this.getX(),this.getY(),10,60, false);
                g.fill3DRect( this.getX()+ 10,this.getY() + 10,20,40, false);
                g.fill3DRect(this.getX() + 30,this.getY(),10,60, false);
                g.fillOval(this.getX() + 10,this.getY() + 20, 20, 20);
                g.drawLine(this.getX() + 20, this.getY(), this.getY() + 20, this.getY() + 30);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }

    }
}
