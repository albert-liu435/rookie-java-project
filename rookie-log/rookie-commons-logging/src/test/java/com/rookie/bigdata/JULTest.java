package com.rookie.bigdata;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;

/**
 * @Class JULTest
 * @Description
 * @Author rookie
 * @Date 2024/6/25 11:33
 * @Version 1.0
 */
public class JULTest {


    @Test
    public void test01(){
        Log log = LogFactory.getLog(JULTest.class);
        // jcl优先使用 log4j 日志，如果未添加log4j依赖，默认会使用java自带的日志框架：java.util.logging
        log.fatal("fatal");
        log.error("error");
        log.warn("warn");
        log.info("info");
        log.debug("debug");

    }
}
