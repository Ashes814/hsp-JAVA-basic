package com.oocool.fanxing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 欧欧
 * @version 1.0
 */
public class GenericExe01 {
    public static void main(String[] args) {
        Map<String, Student> stringStudentHashMap = new HashMap<>();
        stringStudentHashMap.put("a", new Student());
    }
}

class Student {

}
