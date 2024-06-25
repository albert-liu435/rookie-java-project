package com.rookie.bigdata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * @Class Slf4jTest
 * @Description https://blog.csdn.net/qq_41428418/article/details/134995964
 * @Author rookie
 * @Date 2024/6/25 13:31
 * @Version 1.0
 */

public class Slf4jTest {

    // 声明日志对象
    public final static Logger LOGGER = LoggerFactory.getLogger(Slf4jTest.class);

    @Test
    public void testSlf4j() {
        //打印日志信息
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }
}
