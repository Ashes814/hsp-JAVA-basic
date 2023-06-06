package com.file;

import org.junit.jupiter.api.Test;
import java.io.File;

/**
 * @author 欧欧
 * @version 1.0
 */
public class FileInfo {
    public static void main(String[] args) {


    }

    @Test
    public void info() {
        File file = new File("/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter19/src/com/file/text001.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.isFile());
    }
}
