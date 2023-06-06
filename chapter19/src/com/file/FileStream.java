package com.file;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 欧欧
 * @version 1.0
 */
public class FileStream {
    String filePath = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter19/src/com/file/text001.txt";
    String outputFile = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter19/src/com/file/copy001.txt";
    public static void main(String[] args) {


    }

    @Test
    public void fileReader01() {
        FileReader fileReader = null;
        int data = 0;
        try {
            fileReader = new FileReader(filePath);

            while ((data = fileReader.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void fileReader02() {
        FileReader fileReader = null;

        int readLen = 0;
        char[] buf = new char[8];
        try {
            fileReader = new FileReader(filePath);

            while (( readLen = fileReader.read(buf)) != -1) {
                System.out.println(new String(buf, 0, readLen));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void fileWriter01() {
        FileWriter fileWriter = null;

        int readLen = 0;
        char[] buf = new char[8];
        try {
            fileWriter = new FileWriter(filePath);

            fileWriter.write('a');
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
