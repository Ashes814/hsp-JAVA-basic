package com.exception_.thorws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Throws01 {
    public static void main(String[] args) {
//          Throws01.f1();
        try {
            Throws01.f1();
        } catch (FileNotFoundException e) {
            System.out.println("handle");
        }
    }

    public static void f1() throws FileNotFoundException {
        System.out.println("Normal");
//        FileInputStream fis = new FileInputStream("./aa.text");
    }

}
