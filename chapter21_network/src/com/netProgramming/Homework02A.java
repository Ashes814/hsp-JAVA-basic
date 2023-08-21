package com.netProgramming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework02A {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Server is listening 9999");

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        String downloadFileName = "";
        while ((len = inputStream.read(b)) != -1) {
            downloadFileName += new String(b, 0, len);


        }

        System.out.println("File Name is: " + downloadFileName);


        String file1 = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter21_network/out/qie1.jpg";
        String file2 = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter21_network/out/qie2.jpg";

        String resFilePath = "";

        if ("file1".equals(downloadFileName)) {
            resFilePath = file1;
        } else {
            resFilePath = file2;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(resFilePath));
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(bytes);
        socket.shutdownOutput();

        bufferedInputStream.close();
        bufferedOutputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();

    }
}
