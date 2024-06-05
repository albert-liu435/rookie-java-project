package com.rookie.bigdata.nio;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @Class MmapMain
 * @Description
 * @Author rookie
 * @Date 2023/10/31 13:45
 * @Version 1.0
 */
public class MmapMain {


    /**
     * Java 实现 mmap示例
     *
     * @throws Exception
     */
    @Test
    void testMmap() throws Exception {
        // 获取文件
        FileChannel readChannel = FileChannel.open(Paths.get("C:\\work\\IDEAWorkSpace\\rookie-project\\rookie-github\\rookie-javases\\rookie-javase\\src\\main\\resources\\abc.txt"), StandardOpenOption.READ);
        MappedByteBuffer data = readChannel.map(FileChannel.MapMode.READ_ONLY, 0, readChannel.size());
        FileChannel writeChannel = FileChannel.open(Paths.get("C:\\work\\IDEAWorkSpace\\rookie-project\\rookie-github\\rookie-javases\\rookie-javase\\src\\main\\resources\\abc1.txt"), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        //数据传输
        writeChannel.write(data);
        readChannel.close();
        writeChannel.close();
    }


    @Test
    void testSendFile()throws Exception{
        FileChannel readChannel = FileChannel.open(Paths.get("C:\\work\\IDEAWorkSpace\\rookie-project\\rookie-github\\rookie-javases\\rookie-javase\\src\\main\\resources\\abc.txt"), StandardOpenOption.READ);
        long len = readChannel.size();
        long position = readChannel.position();
        FileChannel writeChannel = FileChannel.open(Paths.get("C:\\work\\IDEAWorkSpace\\rookie-project\\rookie-github\\rookie-javases\\rookie-javase\\src\\main\\resources\\abc1.txt"), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        //数据传输
        //开始发送数据：在Java中使用零拷贝技术调用transferTo方法，这个方法底层使用了零拷贝技术
        // 在Linux系统下 使用transferTo 方法，没有文件大小限制，可以将文件调用一次transferTo方法即可传输完成
        //但是在Windows系统下调用一次transferTo 方法，最多只能发送 8m 的数据，所以需要将文件进行分段传输
        // transferTo 参数介绍：
        //              第一个参数：从文件的哪里开始读取
        //              第二个参数：读取多少字节
        //              第三个参数：将读取的字节,放入需要写入的Channel中
        readChannel.transferTo(position, len, writeChannel);
        readChannel.close();
        writeChannel.close();
    }

//    @Test
//    public void writeHtml(File file) {
//        if (file.exists() && file.isFile()) {
//            try {
//                System.err.println("文件存在");
//
//                //文件存在进行输出，此处使用零拷贝技术
//
//                //获取到该 channel 关联的 缓存Buffer
//                ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
//
//                //得到一个文件 通道
//                FileChannel fileChannel = new FileInputStream(file).getChannel();
//                writeBuffer.put(HttpProtocolUtil.sendHead(fileChannel.size(),"200"));
//                writeBuffer.flip();
//                channel.write(writeBuffer);
//
//                //开始发送数据：在Java中使用零拷贝技术调用transferTo方法，这个方法底层使用了零拷贝技术
//                // 在Linux系统下 使用transferTo 方法，没有文件大小限制，可以将文件调用一次transferTo方法即可传输完成
//                //但是在Windows系统下调用一次transferTo 方法，最多只能发送 8m 的数据，所以需要将文件进行分段传输
//                // transferTo 参数介绍：
//                //              第一个参数：从文件的哪里开始读取
//                //              第二个参数：读取多少字节
//                //              第三个参数：将读取的字节需要放入的SocketChannel
//                long count = fileChannel.transferTo(0, fileChannel.size(), channel);
//
//                System.err.println("传输的总的字节大小："+count);
//                //关闭通道
//                close();
//            } catch (Exception e) {
//                e.printStackTrace();
//                System.err.println("写出静态资源失败");
//            }
//        } else {
//            doWrite(HttpProtocolUtil.send404("404 资源未找到"));
//            //关闭通道
//            close();
//        }
//    }
//

}
