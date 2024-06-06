package com.rookie.bigdata.netty207;

import com.alibaba.fastjson.JSON;
import com.rookie.bigdata.netty207.client.ClientSocket;
import com.rookie.bigdata.netty207.future.SyncWrite;
import com.rookie.bigdata.netty207.msg.Request;
import com.rookie.bigdata.netty207.msg.Response;
import io.netty.channel.ChannelFuture;

/**
 * @Class StartClient
 * @Description
 * @Author rookie
 * @Date 2024/6/6 9:18
 * @Version 1.0
 */
public class StartClient {

    private static ChannelFuture future;

    public static void main(String[] args) {
        System.out.println("hi 微信公众号：bugstack虫洞栈");
        ClientSocket client = new ClientSocket();
        new Thread(client).start();

        while (true) {
            try {
                //获取future，线程有等待处理时间
                if (null == future) {
                    future = client.getFuture();
                    Thread.sleep(500);
                    continue;
                }
                //构建发送参数
                Request request = new Request();
                request.setResult("查询｛bugstack虫洞栈｝用户信息");
                SyncWrite s = new SyncWrite();
                Response response = s.writeAndSync(future.channel(), request, 1000);
                System.out.println("调用结果：" + JSON.toJSON(response));
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

