package com.file;

import java.io.*;
import java.sql.SQLOutput;

/**
 * @author 欧欧
 * @version 1.0
 */
public class ObjectInStream_ {
    public static void main(String[] args) throws Exception {

        //指定反序列化的文件
        String filePath = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter19/src/com/file/data.dat";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //读取
        //1. 读取（反序列化）的顺序需要和你保存的数据（序列化）的顺序一致
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());

        Object dog = ois.readObject(); // 向上转型
        System.out.println(dog); //Object -> Dog

        // 关闭外层流
        ois.close();

    }
}


