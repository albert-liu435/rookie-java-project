package com.rookie.artisan.netty001.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Class SocketServer
 * @Description https://artisan.blog.csdn.net/category_10743783_2.html
 * @Author rookie
 * @Date 2024/6/6 14:57
 * @Version 1.0
 */
public class SocketServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7777);
        while (true) {
            System.out.println("等待client连接");
            //阻塞方法
            Socket clientSocket = serverSocket.accept();
            System.out.println("已收到客户端的连接....,开始处理");
            handler(clientSocket);
            /*new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        handler(clientSocket);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();*/
        }
    }

    private static void handler(Socket clientSocket) throws IOException {

        byte[] bytes = new byte[1024];
        System.out.println("主备读取客户端发送来的数据");
        //接受客户端的数据，阻塞方法,没有数据可读时就阻塞
        int read = clientSocket.getInputStream().read(bytes);
        System.out.println("读取ing");
        if (read != -1) {
            System.out.println("接收到客户端的数据：" + new String(bytes, 0, read));
        }

        //向服务端发送数据
        clientSocket.getOutputStream().write("HelloClient".getBytes());
        //缓冲区刷新
        clientSocket.getOutputStream().flush();

    }
}
