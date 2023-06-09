package com.netProgramming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 欧欧
 * @version 1.0
 */
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        // 1. listening 9999 port, waiting for connection
        ServerSocket serverSocket = new ServerSocket(9999); // 9999 should not be used by other program
        System.out.println("Server listening for 9999, waiting for connections...");
        // 2. if no client connects to 9999, block
        Socket socket = serverSocket.accept();
        System.out.println(socket.getClass());

        // 3. Reading and showing data by socket.getInputStream
        InputStream inputStream = socket.getInputStream();
        // 4. IO read
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }
        // 5. close
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
