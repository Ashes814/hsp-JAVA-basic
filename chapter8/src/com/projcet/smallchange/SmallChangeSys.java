package com.projcet.smallchange;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        // 完成零钱通明细
        String details = "========零钱通明细=========";


        // 完成收益入账
        double money = 0;
        double balance = 0;

        // 日期处理
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        // 确认退出
        String sureInput = "";
        // 消费内容
        String note = "";
        do {
            System.out.println("++++++++++零钱通菜单++++++++++");
            System.out.println("\t\t\t1： 零钱通明细 ");
            System.out.println("\t\t\t2： 收益入账");
            System.out.println("\t\t\t3： 消费");
            System.out.println("\t\t\t4： 退出");

            System.out.println("请选择（1 - 4）： ");
            key = scanner.next();

            switch (key) {
                case "1":
                    System.out.println(details);

                    break;
                case "2":
                    System.out.println("2： 收益入账 ");
                    System.out.println("入账金额： ");
                    money = scanner.nextDouble();

                    if (money <= 0) {
                        System.out.println("入账金额必须大于等于0");
                        break;
                    }


                    balance += money;
                    date = new Date();
                    details += "\n" + "收益入账：" + "\t" + money + "\t" + sdf.format(date) + "\t" + "当前余额为：" + balance;
                    break;
                case "3":
                    System.out.println("3： 消费");
                    System.out.println("消费金额： ");
                    money = scanner.nextDouble();
                    if (money <= 0) {
                        System.out.println("消费金额必须大于等于0");
                        break;
                    }

                    if (balance < money) {
                        System.out.println("余额不足");
                        break;
                    }
                    System.out.println("消费内容： ");
                    note = scanner.next();


                    balance -= money;
                    date = new Date();
                    details += "\n" + "消费出账2：" + note + "\t" + "-" + money + "\t" + sdf.format(date) + "\t" + "当前余额为：" + balance;
                    break;
                case "4":
                    System.out.println("4： 退出 ");
                    boolean loop2 = true;
                    boolean sure = true;
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

                    if (sure) {
                        loop = false;

                    }
                    break;


                default:
                    System.out.println("菜单选择有误，请重新选择");


            }
        } while (loop);
        System.out.println("退出成功！");
    }
}
