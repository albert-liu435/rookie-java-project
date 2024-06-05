package com.rookie.bigdata.netty203.codec;

import com.rookie.bigdata.netty203.util.SerializationUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * @Class ObjDecoder
 * @Description 解码器
 * @Author rookie
 * @Date 2024/6/5 14:17
 * @Version 1.0
 */
public class ObjDecoder extends ByteToMessageDecoder {

    private Class<?> genericClass;

    public ObjDecoder(Class<?> genericClass) {
        this.genericClass = genericClass;
    }

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {

        //返回可以读取bytes的数量
        if (in.readableBytes() < 4) {
            return;
        }
        in.markReaderIndex();
        //数据字节长度
        int dataLength = in.readInt();
        if (in.readableBytes() < dataLength) {
            in.resetReaderIndex();
            return;
        }

        byte[] data = new byte[dataLength];
        in.readBytes(data);
        out.add(SerializationUtil.deserialize(data, genericClass));


    }
}
