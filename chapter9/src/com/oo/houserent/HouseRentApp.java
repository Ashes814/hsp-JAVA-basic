package com.oo.houserent;

import com.oo.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        //创建HouseView对象，并使用House对象
        HouseView app = new HouseView();
        app.mainMenu();
        System.out.println("系统已成功退出！");

    }
}
