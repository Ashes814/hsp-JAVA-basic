package com.netProgramming;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 欧欧
 * @version 1.0
 */
public class TCPFileCopyClient {
    public static void main(String[] args) throws Exception {
        // 客户端连接服务端，得到Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        String filePath = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter21_network/out/qie.jpg";

        // 创建读取磁盘文件的输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));


        // bytes就是file对应的字符数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //通过socket获取到输出流，将bytes数据发送给服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes); //将文件对应的字节数组的内容，写入到数据通道
        bis.close();
        socket.shutdownOutput(); //设置结束标志


        // get server message
        InputStream inputStream = socket.getInputStream();
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);

inputStream.close();
        //关闭相关流
        bos.close();
        socket.close();

    }
}
