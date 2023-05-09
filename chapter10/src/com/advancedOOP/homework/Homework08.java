package com.advancedOOP.homework;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework08 {
    public static void main(String[] args) {
        Color color = Color.RED;
        color.show();

        switch (color) {
            case RED:
                System.out.println("RED");
                break;
            case BLACK:
                color.show();
                break;
            case BLUE:
                color.show();
                break;
            case GREEN:
                color.show();
                break;
            case YELLOW:
                color.show();
                break;
            default:
                System.out.println("No color");
        }


    }
}

enum Color implements ShowColor {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);
    private int redValue;
    private int blueValue;
    private int greenValue;

    private Color(int redValue, int greenValue, int blueValue) {
        this.blueValue = blueValue;
        this.redValue = redValue;
        this.greenValue = greenValue;
    }

    @Override
    public void show() {
        System.out.println(
                        "R: " + this.redValue + "; " +
                        "G: " + this.greenValue + "; " +
                        "B: " + this.blueValue + "; "
        );
    }
}

interface ShowColor {
    void show();
}

