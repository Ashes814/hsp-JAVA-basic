package com.oocool.multiThread.basic_;

/**
 * @author 欧欧
 * @version 1.0
 */
public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException{
        MyDaemonThread myDaemonThread = new MyDaemonThread();

        // 设置守护线程状态，当main线程结束后，守护线程自动结束
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();

        for (int i = 1; i<=10; i++) {
            System.out.println("主线程循环10次");
            Thread.sleep(1000);
        }


    }
}

class MyDaemonThread extends Thread {
    public void run() {
        for (;;) {
            System.out.println("守护线程无限循环");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


