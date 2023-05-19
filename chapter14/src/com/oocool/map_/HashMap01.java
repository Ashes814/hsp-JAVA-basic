package com.oocool.map_;

import java.util.HashMap;

/**
 * @author 欧欧
 * @version 1.0
 */
public class HashMap01 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("1", "a");
        hashMap.put("2", "b");
        hashMap.put("3", "c");
        hashMap.put("4", "a");

        System.out.println(hashMap);
    }
}
