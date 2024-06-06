package com.rookie.bigdata.netty207.future;

import com.rookie.bigdata.netty207.msg.Response;

import java.util.concurrent.Future;

/**
 * @Class WriteFuture
 * @Description
 * @Author rookie
 * @Date 2024/6/5 17:53
 * @Version 1.0
 */
public interface WriteFuture<T> extends Future<T> {

    Throwable cause();

    void setCause(Throwable cause);

    boolean isWriteSuccess();

    void setWriteResult(boolean result);

    String requestId();

    T response();

    void setResponse(Response response);

    boolean isTimeout();


}
