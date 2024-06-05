package com.rookie.bigdata.netty204.util;

import com.rookie.bigdata.netty204.domain.FileBurstInstruct;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Class CacheUtil
 * @Description
 * @Author rookie
 * @Date 2024/6/5 17:10
 * @Version 1.0
 */
public class CacheUtil {

    public static Map<String, FileBurstInstruct> burstDataMap = new ConcurrentHashMap<>();

}
