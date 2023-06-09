package com.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 欧欧
 * @version 1.0
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter19/src/com/file/text002.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
        bufferedWriter.write("hello, 只因你太美！");
        bufferedWriter.newLine();
        bufferedWriter.write("hello, 只因你太美！");

        // 关闭外层流即可
        bufferedWriter.close();


    }
}
