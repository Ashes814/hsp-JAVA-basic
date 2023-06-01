package com.oocool.multiThread.basic_;

/**
 * @author 欧欧
 * @version 1.0
 */
public class ThreadSaleTickets {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();
//
        SellTicket02 sellTicket01 = new SellTicket02();
//        SellTicket02 sellTicket02 = new SellTicket02();
//        SellTicket02 sellTicket03 = new SellTicket02();
        Thread thread1 = new Thread(sellTicket01);
        Thread thread2 = new Thread(sellTicket01);
        Thread thread3 = new Thread(sellTicket01);


        thread1.start();
        thread2.start();
        thread3.start();


    }
}

class SellTicket01 extends Thread {
    public static int ticketNum = 100;

    public synchronized int sell() {

            if (ticketNum <= 0) {
                System.out.println("Tickets have been sold out!!");
                return 1;
            }

            try {
                Thread.sleep(50);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print("Window: " + Thread.currentThread().getName() + "sold a ticket  ");
            System.out.println("Tickets Remains: " + (--ticketNum));
            return -1;


    }

    @Override
    public void run() {
        while (true) {
            if (sell() == 1) {
                break;
            };
        }

    }
}

class SellTicket02 implements Runnable{
    public int ticketNum = 1000;
    public synchronized int sell() {

        if (ticketNum <= 0) {
            System.out.println("Tickets have been sold out!!");
            return 1;
        }

        try {
            Thread.sleep(5);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print("Window: " + Thread.currentThread().getName() + "sold a ticket  ");
        System.out.println("Tickets Remains: " + (--ticketNum));
        return -1;


    }

    @Override
    public void run() {
        while (true) {
            if (sell() == 1) {
                break;
            };
        }

    }
}