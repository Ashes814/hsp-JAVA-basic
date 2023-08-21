package com.netProgramming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        BufferedReader bi = new BufferedReader(new InputStreamReader(inputStream));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        String s = bi.readLine();
        System.out.println(s);

        if (s.equals("name")) {
            bw.write("I am Nova");
            bw.newLine();
            bw.flush();
            socket.shutdownOutput();
        } else if (s.equals("hobby")) {
            bw.write("Writting Java");
            bw.newLine();
            bw.flush();
            socket.shutdownOutput();
        } else {
            bw.write("你在说啥");
            bw.newLine();
            bw.flush();
            socket.shutdownOutput();
        }

        bi.close();
        bw.close();
        socket.close();
        serverSocket.close();

    }
}
