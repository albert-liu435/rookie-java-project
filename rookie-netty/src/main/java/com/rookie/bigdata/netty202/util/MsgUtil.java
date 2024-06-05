package com.rookie.bigdata.netty202.util;

import com.rookie.bigdata.netty202.domain.MsgBody;

/**
 * @Class MsgUtil
 * @Description
 * @Author rookie
 * @Date 2024/6/5 13:55
 * @Version 1.0
 */
public class MsgUtil {

    /**
     * 构建protobuf消息体
     */
    public static MsgBody buildMsg(String channelId, String msgInfo) {
        MsgBody.Builder msg = MsgBody.newBuilder();
        msg.setChannelId(channelId);
        msg.setMsgInfo(msgInfo);
        return msg.build();
    }

}
