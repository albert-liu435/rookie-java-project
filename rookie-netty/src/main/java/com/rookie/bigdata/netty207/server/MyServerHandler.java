package com.rookie.bigdata.netty207.server;

import com.rookie.bigdata.netty207.msg.Request;
import com.rookie.bigdata.netty207.msg.Response;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

/**
 * @Class MyServerHandler
 * @Description
 * @Author rookie
 * @Date 2024/6/5 17:57
 * @Version 1.0
 */
public class MyServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object obj){
        Request msg = (Request) obj;
        //反馈
        Response request = new Response();
        request.setRequestId(msg.getRequestId());
        request.setParam(msg.getResult() + " 请求成功，反馈结果请接受处理｛公众号：bugstack虫洞栈 博客栈：https://bugstack.cn｝。");
        ctx.writeAndFlush(request);
        //释放
        ReferenceCountUtil.release(msg);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }

}