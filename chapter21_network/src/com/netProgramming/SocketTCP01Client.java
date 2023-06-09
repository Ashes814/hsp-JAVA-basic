package com.netProgramming;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 欧欧
 * @version 1.0
 */
public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        // 1. connect server,(ip, port)
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("client" + socket.getClass());
        // 2. generate Socket ny socket.getOutputStream()
        OutputStream outputStream = socket.getOutputStream();
        // 3. write data to socket by output stream
        outputStream.write("hello, server".getBytes());
        // 4. close stream object and socket
        outputStream.close();
        socket.close();
        System.out.println("Client exit");
    }
}
