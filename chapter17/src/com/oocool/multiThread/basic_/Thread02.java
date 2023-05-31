package com.oocool.multiThread.basic_;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Thread02 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();

        System.out.println("main go on");
    }
}

class T1 implements Runnable {
    int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("hello World T1" + (++count));

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

            if (count == 10) {
                break;
            }
        }
    }
}
class T2 implements Runnable {
    int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("hi T2" + (++count));

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

            if (count == 10) {
                break;
            }
        }
    }
}
