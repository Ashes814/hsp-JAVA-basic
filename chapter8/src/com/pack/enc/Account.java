package com.pack.enc;

public class Account {
    private String name;
    private double balance;
    private String password;

    public void setName(String name) {
        if (name.length() <= 4 && name.length() >= 2) {
            this.name = name;
        } else {
            System.out.println("姓名长度只能是2，3，或4位, 已将您的姓名设置为默认值：“蔡徐坤”");
            this.name = "蔡徐坤";
        }
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须大于20, 已将您的余额设置为默认值：“0”");
            this.balance = 0;
        }

    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码必须为6位, 已将您的密码设置为默认值：“000000”");
            this.password = "000000";
        }

    }
}
