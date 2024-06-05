package com.rookie.bigdata.netty203.util;

import com.rookie.bigdata.netty203.domain.MsgInfo;

/**
 * @Class MsgUtil
 * @Description
 * @Author rookie
 * @Date 2024/6/5 14:25
 * @Version 1.0
 */
public class MsgUtil {

    public static MsgInfo buildMsg(String channelId, String msgContent) {
        return new MsgInfo(channelId,msgContent);
    }

}
