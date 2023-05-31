package com.oocool.multiThread.basic_;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Thread01 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.start();
        System.out.println("won't stop");

    }
}


class Cat extends Thread {
    int times = 0;
    @Override
    public void run() {

        while (true) {
            System.out.println("mew, mew");
            times++;


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (times == 8) {
                break;
            }
        }
    }
}