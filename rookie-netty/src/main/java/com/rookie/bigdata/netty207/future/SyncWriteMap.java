package com.rookie.bigdata.netty207.future;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Class SyncWriteMap
 * @Description
 * @Author rookie
 * @Date 2024/6/5 17:56
 * @Version 1.0
 */
public class SyncWriteMap {

    public static Map<String, WriteFuture> syncKey = new ConcurrentHashMap<String, WriteFuture>();

}
