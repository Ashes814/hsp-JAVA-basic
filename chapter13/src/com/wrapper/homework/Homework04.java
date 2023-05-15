package com.wrapper.homework;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        calString("AAAbbb111");
    }

    public static void calString(String str) {
        char[] charStr = str.toCharArray();
        int nUpperCase = 0;
        int nLowerCase = 0;
        int nNumber = 0;
        for (char c:charStr) {
            if ('a' <= c && c <= 'z') {
                nLowerCase++;
            }if ('A' <= c && c <= 'Z') {
                nUpperCase++;
            }if ('0' <= c && c <= '9') {
                nNumber++;
            }

        }

        System.out.println(nLowerCase + ":" + nUpperCase + ":" + nNumber);
    }
}
