package com.rookie.bigdata.netty207.msg;

/**
 * @Class Response
 * @Description
 * @Author rookie
 * @Date 2024/6/5 17:52
 * @Version 1.0
 */
public class Response {

    private String requestId;
    private String param;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

}
