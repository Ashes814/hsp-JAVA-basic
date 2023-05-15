package com.wrapper.homework;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework01 {
    public static String reverse(String str, int start, int end) {
        StringBuffer needReverse = new StringBuffer(str.substring(start, end + 1));

        return new StringBuffer(str).replace(start, end + 1, needReverse.reverse().toString()).toString();

    }
    public static String reverse2(String str, int start, int end) {
        char[] charStr = str.toCharArray();
        int i = start;
        int j = end;
        char temp = ' ';

        while (j > i) {
            temp = charStr[j];
            charStr[j] = charStr[i];
            charStr[i] = temp;
            i++;
            j--;
        }

        return new String(charStr);
    }
    public static void main(String[] args) {
        String testStr = "abcdef";
        System.out.println(reverse(testStr,1, 3));
        System.out.println(reverse2(testStr,1, 3));
    }
}
