package com.file.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter19/src/com/file/homework/hello.txt";
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        String lineData;
        int lineNumber = 0;
        while ((lineData = br.readLine()) != null) {
            System.out.print(++lineNumber);
            System.out.print(": ");
            System.out.println(lineData);
        }


    }
}
