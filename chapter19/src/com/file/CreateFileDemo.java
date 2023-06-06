package com.file;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 欧欧
 * @version 1.0
 */
public class CreateFileDemo {
    public static void main(String[] args) {
    }

    @Test
    public void create01() throws IOException {
        String filePath = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter19/src/com/file/text001.txt";
        File file = new File(filePath);
        file.createNewFile();
        System.out.println("File Ok");
    }
}
