package com.wrapper.String;

/**
 * @author 欧欧
 * @version 1.0
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        String str = stringBuffer.toString();
        System.out.println(str);
        System.out.println(stringBuffer);
    }
}
