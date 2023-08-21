package com.netProgramming;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();


        // char stream
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        bufferedWriter.write("others");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        socket.shutdownOutput();



        String s = bufferedReader.readLine();
        System.out.println(s);


        bufferedWriter.close();
        bufferedReader.close();

        socket.close();
        System.out.println("Client exit");
    }
}
