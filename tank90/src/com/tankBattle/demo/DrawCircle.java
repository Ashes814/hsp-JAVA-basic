package com.tankBattle.demo;

import javax.swing.*;
import java.awt.*;

/**
 * @author 欧欧
 * @version 1.0
 */
public class DrawCircle extends JFrame {
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("out");
    }


    public DrawCircle() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}


class MyPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint");
        g.setColor(Color.cyan);
        g.fillRect(200,200,10,60);
        g.fillRect(210,210,20,40);
        g.fillRect(230,200,10,60);
        g.fillOval(210,220, 20, 20);
        g.drawLine(220, 200, 220,230);
    }
}
