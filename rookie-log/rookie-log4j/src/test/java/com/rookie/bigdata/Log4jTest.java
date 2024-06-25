package com.rookie.bigdata;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import java.util.UUID;

/**
 * @Class Log4jTest
 * @Description https://blog.csdn.net/qq_41428418/article/details/134995964
 * @Author rookie
 * @Date 2024/6/21 11:46
 * @Version 1.0
 */

public class Log4jTest {



    @Test
    public void test001(){
        Logger rootLogger = Logger.getRootLogger();

        System.out.println(UUID.randomUUID().toString());
    }


    @Test
    public void testQuick() throws Exception {
        // 初始化系统配置，不需要配置文件
        BasicConfigurator.configure();
        // 创建日志记录器对象
        Logger logger = Logger.getLogger(Log4jTest.class);
//        Logger logger2 = Logger.getLogger(Log4jTest.class);
        // 日志记录输出
        logger.info("hello log4j");
        // 日志级别
        // 严重错误，一般会造成系统崩溃和终止运行
        logger.fatal("fatal");
        // 错误信息，但不会影响系统运行
        logger.error("error");
        // 警告信息，可能会发生问题
        logger.warn("warn");
        // 程序运行信息，数据库的连接、网络、IO操作等
        logger.info("info");
        // 调试信息，一般在开发阶段使用，记录程序的变量、参数等
        logger.debug("debug");
        // 追踪信息，记录程序的所有流程信息
        logger.trace("trace");
    }


    @Test
    public void testCustomLogger() throws Exception {
        // 自定义 com.itheima
        Logger logger1 = Logger.getLogger(Log4jTest.class);
        logger1.fatal("fatal"); // 严重错误，一般会造成系统崩溃和终止运行
        logger1.error("error"); // 错误信息，但不会影响系统运行
        logger1.warn("warn"); // 警告信息，可能会发生问题
        logger1.info("info"); // 程序运行信息，数据库的连接、网络、IO操作等
        logger1.debug("debug"); // 调试信息，一般在开发阶段使用，记录程序的变量、参数等
        logger1.trace("trace"); // 追踪信息，记录程序的所有流程信息
        // 自定义 org.apache
        Logger logger2 = Logger.getLogger(Logger.class);
        logger2.fatal("fatal logger2"); // 严重错误，一般会造成系统崩溃和终止运行
        logger2.error("error logger2"); // 错误信息，但不会影响系统运行
        logger2.warn("warn logger2"); // 警告信息，可能会发生问题
        logger2.info("info logger2"); // 程序运行信息，数据库的连接、网络、IO操作等
        logger2.debug("debug logger2"); // 调试信息，一般在开发阶段使用，记录程序的变量、参数等
        logger2.trace("trace logger2"); // 追踪信息，记录程序的所有流程信息
    }


//    CREATE TABLE `log` (
//`log_id` int(11) NOT NULL AUTO_INCREMENT,
//`project_name` varchar(255) DEFAULT NULL COMMENT '目项名',
//`create_date` varchar(255) DEFAULT NULL COMMENT '创建时间',
//`level` varchar(255) DEFAULT NULL COMMENT '优先级',
//`category` varchar(255) DEFAULT NULL COMMENT '所在类的全名',
//`file_name` varchar(255) DEFAULT NULL COMMENT '输出日志消息产生时所在的文件名称 ',
//`thread_name` varchar(255) DEFAULT NULL COMMENT '日志事件的线程名',
//`line` varchar(255) DEFAULT NULL COMMENT '号行',
//`all_category` varchar(255) DEFAULT NULL COMMENT '日志事件的发生位置',
//`message` varchar(4000) DEFAULT NULL COMMENT '输出代码中指定的消息',
//PRIMARY KEY (`log_id`)
//);

}

