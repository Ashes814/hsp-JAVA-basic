package com.file.homework;
import java.io.File;
import java.io.IOException;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework01 {

    public static void main(String[] args) throws IOException {
        String dirPath = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter19/src/com/file/homework/mytemp";
        File dir = new File(dirPath);
        if (!dir.exists()) {
            dir.mkdirs();
        } else {
            System.out.println("Directory Exists");
        }

        String filePath = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter19/src/com/file/homework/hello.txt";
        File file = new File(filePath);
        if (file.createNewFile()) {
            System.out.println("File Success");
        } else {
            System.out.println("File Exists");
        }
    }

}
