package com.rookie.artisan.netty001.bio;

import java.io.IOException;
import java.net.Socket;

/**
 * @Class SocketClient
 * @Description
 * @Author rookie
 * @Date 2024/6/6 15:04
 * @Version 1.0
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 7777);
        //向服务端发送数据
        socket.getOutputStream().write("HelloServer".getBytes());
        socket.getOutputStream().flush();
        System.out.println("向服务端发送数据结束");
        byte[] bytes = new byte[1024];
        //接受服务端回传的数据
        socket.getInputStream().read(bytes);
        System.out.println("接受到服务端的数据： " + new String(bytes));
        socket.close();

    }
}
