package com.oocool.map_;

import java.util.HashMap;

/**
 * @author 欧欧
 * @version 1.0
 */
public class HashMap01 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 64; i++) {
            hashMap.put(i, "1");
        }
    }
}
