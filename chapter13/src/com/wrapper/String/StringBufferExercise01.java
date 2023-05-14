package com.wrapper.String;

/**
 * @author 欧欧
 * @version 1.0
 */
public class StringBufferExercise01 {
    public static void main(String[] args) {
       String name = "手机";
       String price = "12356222224.59";
       StringBuffer priceBuffer = new StringBuffer(price);
       int i = 1;
       int indexOfDot = priceBuffer.lastIndexOf(".");
       while (indexOfDot  - 3 * i > 0) {
           priceBuffer.insert(indexOfDot  - 3 * i, ',');
           i++;
       }

       String formatString = "%s %s";
       System.out.printf((formatString) + "%n",name,priceBuffer);

    }
}
