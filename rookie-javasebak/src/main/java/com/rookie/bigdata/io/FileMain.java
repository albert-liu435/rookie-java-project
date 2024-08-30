package com.rookie.bigdata.io;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * @Class FileMain
 * @Description https://blog.csdn.net/qq_45794943/article/details/124707318
 * @Author rookie
 * @Date 2023/10/31 11:39
 * @Version 1.0
 */
public class FileMain {

    /**
     * 传统的IO拷贝
     * 首先将硬盘上的数据拷贝到内核，然后在经过CPU拷贝将数据从内核拷贝到应用程序内存（用户态），在应用程序内存，用户可以对数据进行操作修改等，然后在经过CPU拷贝将数据从用户缓冲区拷贝到socket缓冲区，
     * 然后在经过DMA拷贝，将数据从socket缓冲区拷贝到网卡。
     * 那么经过以上的步骤，完成了将数据从本地硬盘传输到网络上的过程，
     * 那这个过程数据的拷贝经过了：
     * 硬盘—>内核—>应用程序内存(可以理解为用户态，相当于jvm中)—>socket缓冲区—>网卡，这4次拷贝的过程。
     * 上下文的切换经过了：用户态–>内核态–>用户态 这三次上下文切换
     * ————————————————
     * 版权声明：本文为CSDN博主「陈虎_63」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
     * 原文链接：https://blog.csdn.net/qq_45794943/article/details/124707318
     *
     * @throws Exception
     */

    @Test
    void testReadFile() throws Exception {

        File file = new File("C:\\work\\IDEAWorkSpace\\rookie-project\\rookie-github\\rookie-javases\\rookie-javase\\src\\main\\resources\\abc.txt");

        RandomAccessFile raf = new RandomAccessFile(file, "rw");


        byte[] arr = new byte[(int) file.length()];

        raf.read(arr);

        System.out.println(arr.length);


    }
}
