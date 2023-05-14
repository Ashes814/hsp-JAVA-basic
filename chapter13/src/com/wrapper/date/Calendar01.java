package com.wrapper.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Calendar01 {
    public static void main(String[] args) {
        LocalDateTime dtm = LocalDateTime.now();
        DateTimeFormatter dtmFormatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dtmFormatter.format(dtm));
    }
}
