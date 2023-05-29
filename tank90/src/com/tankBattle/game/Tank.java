package com.tankBattle.game;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Tank {
    private int x;
    private int y;
    private int direct;
    private int speed = 1;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void moveUp() {
        y -= this.getSpeed();
    }public void moveRight() {
        x += this.getSpeed();
    }public void moveDown() {
        y += this.getSpeed();
    }public void moveLeft() {
        x -= this.getSpeed();
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getDirect() {
        return direct;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
