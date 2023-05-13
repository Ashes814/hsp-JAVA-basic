package com.wrapper.String;

/**
 * @author 欧欧
 * @version 1.0
 */
public class StringExercise06 {
    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'};
    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'h';
    }
    public static void main(String[] args) {
      StringExercise06 ex = new StringExercise06();
      ex.change(ex.str, ex.ch);
        System.out.println(ex.str + " and ");
        System.out.println(ex.ch);


    }
}
