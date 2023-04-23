package com.oo.houserent.service;

import com.oo.houserent.domain.House;
import com.oo.houserent.utils.Utility;

public class HouseService {
    private House[] houses;
    private int houseNum = 1;
    private int idCounter = 1;

    public HouseService(int size) {
        this.houses = new House[size];

        // 初始化一个House对象
        houses[0] = new House(1, "jack", "131" , "DStreet", 2000, "未出租");
    }

    public House[] list() {
        return houses;
    }

    public boolean add(House newHouse) {
        //add new House to houses Array
        if (houseNum >= houses.length) {
            System.out.println("数组🈵️");
            House[] extendHouses = new House[houses.length + 1];
            for (int i = 0; i < houses.length; i++) {
                extendHouses[i] = houses[i];
            }
            System.out.println("数组扩容成功✅️");
            this.houses = extendHouses;

        }

        //Design ID calculation
        newHouse.setId(++idCounter);
        houses[houseNum++] = newHouse;
        return true;

    }
    public boolean delete(int delId) {

        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (delId == houses[i].getId()) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("未找到该房屋信息！❌");
            return false;
        }

//        House[] housesAfterDelete = new House[--houseNum];
//        for (int i = 0; i < houseNum + 1; i++) {
//            if (index == i) {
//                continue;
//            }
//            if (index > i) {
//                housesAfterDelete[i] = this.houses[i];
//            }
//            if (index < i) {
//                housesAfterDelete[i - 1] = this.houses[i];
//            }
//        }
//
//        this.houses = housesAfterDelete;
        for (int i = index; i < houseNum - 1; i++ ) {
            this.houses[i] = this.houses[i + 1];
        }
        this.houses[--houseNum] = null;

        return true;
    }
    public void search(int searchId) {
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (houses[i].getId() == searchId) {
                index = i;
                break;
            }

        }

        if (index == -1) {
            System.out.println("No Such Rent ❌");
            return;
        }

        System.out.println("==========你所查找的房屋信息如下==========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        System.out.println(houses[index]);

    }

    public boolean update(int updateId) {
        if (updateId == -1) {
            System.out.println("放弃修改");
            return false;
        }
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (houses[i].getId() == updateId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false;
        }



        System.out.println("姓名：");

        String name = Utility.readString(8, "");
        if (!"".equals(name) ) {
            houses[index].setName(name);
        }
        System.out.println("电话：");
        houses[index].setPhone(Utility.readString(12, ""));
        System.out.println("地址：");
        houses[index].setAddress(Utility.readString(16, ""));
        System.out.println("租金：");
        houses[index].setRent(Utility.readInt(-1));
        System.out.println("状态：");
        houses[index].setState(Utility.readString(3, ""));
        return true;

    }
}
