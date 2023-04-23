package com.oo.houserent.view;

import com.oo.houserent.domain.House;
import com.oo.houserent.service.HouseService;
import com.oo.houserent.utils.Utility;

/**
 * 1. show GUI
 * 2. accept user input
 * 3. call HouseService
 */
public class HouseView {
    private boolean loop = true;
    private char key = ' ';

    HouseService houseService = new HouseService(3);
    public void mainMenu() {

        do {
            System.out.println("==========🏠房屋出租系统==========");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 显 示 房 屋 信 息");
            System.out.println("\t\t\t6 退      出");
            System.out.println("请输入你的选择（1 - 6）：");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    System.out.println("新增房源");
                    this.addHouse();
                    break;
                case '2':
                    System.out.println("查找房屋");
                    this.searchHouse();
                    break;
                case '3':
                    System.out.println("删除房屋");
                    this.delHouse();
                    break;
                case '4':
                    System.out.println("修改房屋");
                    this.updateHouse();
                    break;
                case '5':
                    System.out.println("显示房屋");
                    this.listHouses();
                    break;
                case '6':
                    System.out.println("退出");
                    this.exit();

                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        } while (loop);

    }

    public void listHouses() {
        System.out.println("==========房屋列表==========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length && houses[i] != null; i++) {
            System.out.println(houses[i]);

        }
        System.out.println("显示完毕");

    }

    public void addHouse() {
        System.out.println("==========添加房屋==========");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String phone = Utility.readString(12);
        System.out.println("地址：");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(3);

        House house = new House(0, name, phone, address, rent, state);

        if (houseService.add(house)) {
            System.out.println("房屋添加成功✅");

        } else {
            System.out.println("房屋添加失败❌");
        }
        ;

    }
    public void delHouse() {
        System.out.println("========删除房屋==========");
        System.out.println("请输入待删除房屋的编号(-1退出)");
        int id = Utility.readInt();
        if (id == -1) {
            System.out.println("Give Up❌");
            return;
        }
        System.out.println("Sure?(y/n)");
       char confirm = Utility.readConfirmSelection();

       if (confirm == 'Y') {
           if (houseService.delete(id)) {
               System.out.println("DELETE SUCCESS✅!");
           } else {
               System.out.println("DELETE Failed❌!");
           }


       }

    }

    public void searchHouse() {
        System.out.println("==========Search House===========");
        System.out.println("Please input the id of the house you want to search:");
        int searchId = Utility.readInt();
        houseService.search(searchId);
    }
    public void updateHouse(){}
    public void exit() {
        char confirm = Utility.readConfirmSelection();
        if (confirm == 'Y') {
            loop = false;
        }
    }
}
