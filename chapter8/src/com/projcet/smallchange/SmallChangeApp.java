package com.projcet.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeApp {
    public static void main(String[] args) {
        SmallChangeOOP app = new SmallChangeOOP();
        boolean loop = true;
        do {
            app.showMenu();

            switch (app.key) {
                case "1":
                    app.showDetails();
                    break;
                case "2":
                    app.saveMoney();
                    break;

                case "3":
                    app.consume();
                    break;
                case "4":
                    app.exit();
                    if (app.sure) {
                        loop = false;
                    }
                    break;
            }
        } while (loop);

    }
}

class SmallChangeOOP {
    String details = "========零钱通明细=========";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Scanner scanner = new Scanner(System.in);
    String key = "";

    String sureInput = "";
    boolean sure = true;

    public void showMenu() {
        System.out.println("++++++++++零钱通菜单++++++++++");
        System.out.println("\t\t\t1： 零钱通明细 ");
        System.out.println("\t\t\t2： 收益入账");
        System.out.println("\t\t\t3： 消费");
        System.out.println("\t\t\t4： 退出");

        System.out.println("请选择（1 - 4）： ");
        this.key = this.scanner.next();
    }

    public void showDetails() {
        System.out.println(this.details);
    }

    public void saveMoney() {
        System.out.println("2： 收益入账 ");
        System.out.println("入账金额： ");
        this.money = this.scanner.nextDouble();

        if (money <= 0) {
            System.out.println("入账金额必须大于等于0");
            return;
        }


        this.balance += this.money;
        this.date = new Date();
        this.details += "\n" + "收益入账：" + "\t" + this.money + "\t" + this.sdf.format(this.date) + "\t" + "当前余额为：" + this.balance;
    }

    public void consume() {
        String note = "";
        System.out.println("3： 消费");
        System.out.println("消费金额： ");
        this.money = this.scanner.nextDouble();
        if (money <= 0) {
            System.out.println("消费金额必须大于等于0");
            return;
        }

        if (balance < money) {
            System.out.println("余额不足");
            return;
        }
        System.out.println("消费内容： ");
        note = this.scanner.next();


        this.balance -= this.money;
        this.date = new Date();
        this.details += "\n" + "消费出账2：" + note + "\t" + "-" + this.money + "\t" + this.sdf.format(this.date) + "\t" + "当前余额为：" + this.balance;
    }

    public void exit() {
        System.out.println("4： 退出 ");
        boolean loop2 = true;

        do {
            System.out.println("确认退出？y/n");
            sureInput = scanner.next();
            if (sureInput.equals("y")) {
                sure = true;
                loop2 = false;

            } else if (sureInput.equals("n")) {
                sure = false;
                loop2 = false;

            } else {
                System.out.println("只能输入y或n");
            }
        } while (loop2);


    }

}
