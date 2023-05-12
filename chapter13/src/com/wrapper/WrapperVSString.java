package com.wrapper;

/**
 * @author 欧欧
 * @version 1.0
 */
public class WrapperVSString {
    public static void main(String[] args) {
        Integer i = 1;


        //1
        String str1 = i + "";

        //2
        String str2 = i.toString();

        //3
        String str3 = String.valueOf(i);

        //-1
        String str = "12345";
        Integer i1 = Integer.parseInt(str);



    }
}
