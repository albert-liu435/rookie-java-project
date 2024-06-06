package com.rookie.bigdata.netty207.msg;

/**
 * @Class Request
 * @Description 请求对象
 * @Author rookie
 * @Date 2024/6/5 17:45
 * @Version 1.0
 */
public class Request {

    //请求ID
    private String requestId;
    //请求内容
    private Object result;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

}
