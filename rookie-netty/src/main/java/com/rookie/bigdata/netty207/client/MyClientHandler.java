package com.rookie.bigdata.netty207.client;

import com.rookie.bigdata.netty207.future.SyncWriteFuture;
import com.rookie.bigdata.netty207.future.SyncWriteMap;
import com.rookie.bigdata.netty207.msg.Response;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @Class MyClientHandler
 * @Description
 * @Author rookie
 * @Date 2024/6/5 17:50
 * @Version 1.0
 */
public class MyClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object obj) throws Exception {
        Response msg = (Response) obj;
        String requestId = msg.getRequestId();
        SyncWriteFuture future = (SyncWriteFuture) SyncWriteMap.syncKey.get(requestId);
        if (future != null) {
            future.setResponse(msg);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

}
