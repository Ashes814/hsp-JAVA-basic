package com.netProgramming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 欧欧
 * @version 1.0
 */
public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        // 3. write data to socket by output stream
        outputStream.write("hello, server".getBytes());

        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0,readLen));
        }

        // 4. close stream object and socket
        outputStream.close();
        socket.close();
        System.out.println("Client exit");
    }
}
