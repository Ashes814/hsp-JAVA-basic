package com.oocool.multiThread.basic_;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        Card card = new Card();
        Thread thread1 = new Thread(card);
        Thread thread2 = new Thread(card);
        thread1.start();
        thread2.start();
    }
}


class Card implements Runnable {
    private static int balance = 10000;


    public synchronized int withdraw() {
        if (balance < 1000) {
            System.out.println("余额不足");
            return -1;
        }

        balance -= 1000;
        System.out.println(Thread.currentThread().getName()+"取钱成功, 余额为：" + balance);
        return 1;
    }
    @Override
    public void run() {
        while (true) {
            if (withdraw() == -1) {
                break;
            };

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


