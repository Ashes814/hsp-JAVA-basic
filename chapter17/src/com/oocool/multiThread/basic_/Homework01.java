package com.oocool.multiThread.basic_;

import java.util.Scanner;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) throws InterruptedException {
        Thread001 thread001 = new Thread001();
        Thread thread = new Thread(thread001);
        Thread002 thread002 = new Thread002(thread001);
        Thread thread2 = new Thread(thread002);
        thread.start();
        thread2.start();





    }
}


class Thread001 implements Runnable {
    private boolean loop = true;
    @Override
    public void run() {
        while(loop) {

                System.out.println("111111");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
class Thread002 implements Runnable {
    private Thread001 t1;
    private Scanner scanner = new Scanner(System.in);

    public Thread002(Thread001 t1) {
        this.t1 = t1;
    }
    @Override
    public void run() {

        while (true) {
            System.out.println("input: ");
            String string = scanner.next();
            if (string.equals("q")) {
                System.out.println("Q input");
                t1.setLoop(false);
                break;
            };
        }

    }
}
