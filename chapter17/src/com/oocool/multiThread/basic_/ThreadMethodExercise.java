package com.oocool.multiThread.basic_;

/**
 * @author 欧欧
 * @version 1.0
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Child01());

        System.out.println("Main Starts");
        for (int i = 1; i <= 10; i++) {

            System.out.println("hi (main): " + i);

            if (i == 5) {
                System.out.println("Child Starts");
                thread.start();
                thread.join();

            }


            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Main Exit");
    }
}

class Child01 implements Runnable {
    int count = 0;
    @Override
    public void run() {

        while (count < 10) {
            System.out.println("Hello (Child): " + (++count));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Child Exit");
    }
}
