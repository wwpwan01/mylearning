package com.wwp.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

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
        // 全双工 打开通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 监听端口
        serverSocketChannel.socket().bind(new InetSocketAddress("127.0.0.1",8888));
        // 阻塞态 默认也是阻塞的
        serverSocketChannel.configureBlocking(false);

        Selector open = Selector.open();
        // 在这个通道上注册，让open 去管理 有SelectionKey.OP_ACCEPT的时候open 去处理
        serverSocketChannel.register(open,SelectionKey.OP_ACCEPT);

        while (true){
            // 阻塞方法 监听的通道上有关心的事件发生的时候返回
            open.select();
            // 取出所有的事件进行处理 SelectionKey 事件
            Set<SelectionKey> selectionKeys = open.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()){
                SelectionKey next = iterator.next();
                // 处理之前先去除当前时间，否则下次处理时会再次获取到事件
                iterator.remove();
                handler(next);
            }
        }
    }
    static void handler(SelectionKey socket){
        // 是否可以接受
        if(socket.isAcceptable()) {
            ServerSocketChannel channel = null;
            try {
                channel = (ServerSocketChannel)socket.channel();
                // 获取客户端连接
                SocketChannel accept = channel.accept();
                accept.configureBlocking(false);
                accept.register(socket.selector(),SelectionKey.OP_ACCEPT);
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if(channel!=null){
                    try {
                        channel.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }else if(socket.isReadable()){
            SocketChannel channel = null;
            try {
                channel = (SocketChannel)socket.channel();
                ByteBuffer byteBuffer = ByteBuffer.allocate(512);
                byteBuffer.compact();
                int l = channel.read(byteBuffer);
                if(l != -1){
                    System.out.println(new String(byteBuffer.array()));
                }

                ByteBuffer byteBuffer1Writ = ByteBuffer.wrap("Hello Client".getBytes(),0,l);
                channel.write(byteBuffer1Writ);
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                if(channel!=null){
                    try {
                        channel.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
