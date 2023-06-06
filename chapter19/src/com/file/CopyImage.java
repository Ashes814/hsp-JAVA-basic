package com.file;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 欧欧
 * @version 1.0
 */
public class CopyImage {
    public static void main(String[] args) {


    }


    @Test

    public void copyImage() {
        String filePath = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter19/src/com/file/text001.txt";
        String outputFile = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter19/src/com/file/copy001.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        byte[] buf = new byte[1024];
        int readLen = 0;
        String data;

        try {
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(outputFile);

            while ((readLen = fileInputStream.read(buf)) != -1) {
                fileOutputStream.write(buf, 0, readLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {


            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }

                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
