package com.netProgramming;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework02B {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        String downloadFileName = "file1";

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downloadFileName.getBytes());
        socket.shutdownOutput();


        // 创建读取磁盘文件的输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());


        // bytes就是file对应的字符数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //通过socket获取到输出流，将bytes数据发送给服务端

        String filePath = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter21_network/out/qie3.jpg";;
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes); //将文件对应的字节数组的内容，写入到数据通道

        outputStream.close();
        //关闭相关流
        bos.close();
        socket.close();
        bis.close();
        System.out.println("ok");

    }
}
