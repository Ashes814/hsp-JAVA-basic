package com.oo.houserent.service;

import com.oo.houserent.domain.House;

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
}
