package com.file;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author 欧欧
 * @version 1.0
 */
public class ObjectOutStream_ {
    public static void main(String[] args) {

        //序列化后，保存的文件格式，不是纯稳步
        String filePath = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter19/src/com/file/data.dat";

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

            // 序列化数据到 filePath
            oos.writeInt(100); // int -> Integer() (实现了 Serializable)
            oos.writeBoolean(true); // boolean -> Boolean (实现了Serializable)
            oos.writeChar('a'); // char -> Character (实现了Serializable)
            oos.writeDouble(9.5); // double -> Double (实现了Serializable)
            oos.writeUTF("古娜拉黑暗之神"); // String
            // 保存一个dog对象
            oos.writeObject(new Dog("泽塔", 10));
            oos.close();
            System.out.println("数据保存完毕（序列化形式）");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}


class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


}