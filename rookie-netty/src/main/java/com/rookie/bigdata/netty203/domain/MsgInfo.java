package com.rookie.bigdata.netty203.domain;

/**
 * @Class MsgInfo
 * @Description
 * @Author rookie
 * @Date 2024/6/5 14:16
 * @Version 1.0
 */
public class MsgInfo {

    private String channelId;

    private String msgContent;

    public MsgInfo() {

    }

    public MsgInfo(String channelId, String msgContent) {
        this.channelId = channelId;
        this.msgContent = msgContent;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }
}
