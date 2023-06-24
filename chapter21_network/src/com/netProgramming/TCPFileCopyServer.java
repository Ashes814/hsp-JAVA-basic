package com.netProgramming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 欧欧
 * @version 1.0
 */
public class TCPFileCopyServer {
    public static void main(String[] args) throws Exception {
        //1. 服务端在本机监听8888端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("Server is listening 8888");

        //2.等待连接
        Socket socket = serverSocket.accept();

        //3.读取客户端发送的数据
        // 通过Socket得到输入
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //4. 将得到bytes数组，写入到指定的路径，就得到一个文件了
        String destFilePath = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter21_network/out/qie2.jpg";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
        bos.write(bytes);
        bos.close();

        //向客户端回复收到图片
        // 通过socket获取到输出流
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("收到图片");
        writer.flush(); // 把内容刷新到数据通道
        socket.shutdownOutput();
        writer.close();


        bis.close();
        socket.close();
        serverSocket.close();

    }
}
