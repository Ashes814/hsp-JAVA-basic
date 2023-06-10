package com.file;

import java.io.*;

/**
 * @author 欧欧
 * @version 1.0
 */
public class TransforStream {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter19/src/com/file/text003.txt";
//
//        // 1. 把FileInputStream转换成InputStreamReader，并设置编码为gbk
//        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "utf-8");
//        // 2. 把InputStreamReader传入BufferedReader;
//        BufferedReader br = new BufferedReader(isr);
//
//        // 3. 读取
//        String s = br.readLine();
//        System.out.println(s);
//
//        // 4. 关闭外层流
//        br.close();]

        // 1.创建流对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), "gbk");

        // 2.写入
        osw.write("Hello, 你太美～");

        // 3.关闭
        osw.close();
        System.out.println("保存成功~");

    }
}
