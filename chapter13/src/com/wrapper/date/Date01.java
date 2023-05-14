package com.wrapper.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Date01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println(format);
    }
}
