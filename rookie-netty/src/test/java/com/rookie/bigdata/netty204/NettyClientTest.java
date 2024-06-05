package com.rookie.bigdata.netty204;

import com.rookie.bigdata.netty204.client.NettyClient;
import com.rookie.bigdata.netty204.domain.FileTransferProtocol;
import com.rookie.bigdata.netty204.util.MsgUtil;
import io.netty.channel.ChannelFuture;

import java.io.File;

/**
 * @Class NettyClientTest
 * @Description
 * @Author rookie
 * @Date 2024/6/5 17:22
 * @Version 1.0
 */
public class NettyClientTest {

    public static void main(String[] args) {

        //启动客户端
        ChannelFuture channelFuture = new NettyClient().connect("127.0.0.1", 7397);

        //文件信息{文件大于1024kb方便测试断点续传}
        File file = new File("C:\\Users\\fuzhengwei1\\Desktop\\测试传输文件.rar");
        FileTransferProtocol fileTransferProtocol = MsgUtil.buildRequestTransferFile(file.getAbsolutePath(), file.getName(), file.length());

        //发送信息；请求传输文件
        channelFuture.channel().writeAndFlush(fileTransferProtocol);

    }

}
