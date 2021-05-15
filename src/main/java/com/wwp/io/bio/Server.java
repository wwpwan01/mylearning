package com.wwp.io.bio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName Server.java
 * @Description BIO模型
 * @createTime 2021-05-07 20:29:00
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress("127.0.0.1",8888));
        while (true){
            Socket accept = serverSocket.accept();
            new Thread(()->{
                handler(accept);
            });
        }
    }
    static void handler(Socket socket){
        try {
            byte[] bytes = new byte[1024];
            int l = bytes.length;
            System.out.println(l);

            socket.getOutputStream().write(bytes,0,l);
            socket.getOutputStream().flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
