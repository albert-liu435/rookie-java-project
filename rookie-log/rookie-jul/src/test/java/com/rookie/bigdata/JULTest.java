package com.rookie.bigdata;

import org.testng.annotations.Test;

import java.io.InputStream;
import java.util.logging.*;

/**
 * @Class JULTest
 * @Description https://blog.csdn.net/qq_41428418/article/details/134995964
 * @Author rookie
 * @Date 2024/6/20 17:14
 * @Version 1.0
 */
public class JULTest {
    @Test
    public void testQuick() throws Exception {
        // 1.创建日志记录器对象
        Logger logger = Logger.getLogger("com.rookie.bigdata.JULTest");
        // 2.日志记录输出
        logger.info("hello jul");
        logger.log(Level.INFO, "info msg");
        String name = "jack";
        Integer age = 18;
        logger.log(Level.INFO, "用户信息：{0},{1}", new Object[]{name, age});
    }

    @Test
    public void testLogLevel() throws Exception {
        // 1.获取日志对象
        Logger logger = Logger.getLogger("com.rookie.bigdata.JULTest");
        // 2.日志记录输出
        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");
        logger.config("cofnig");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
    }


    /**
     * 自定义日志等级
     * @throws Exception
     */
    @Test
    public void testLogConfig() throws Exception {
        // 1.创建日志记录器对象
        Logger logger = Logger.getLogger("com.rookie.bigdata.JULTest");
        // 一、自定义日志级别
        // a.关闭系统默认配置
        logger.setUseParentHandlers(false);
        // b.创建handler对象
        ConsoleHandler consoleHandler = new ConsoleHandler();
        // c.创建formatter对象
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        // d.进行关联
        consoleHandler.setFormatter(simpleFormatter);
        logger.addHandler(consoleHandler);
        // e.设置日志级别
        logger.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);
        // 二、输出到日志文件
        FileHandler fileHandler = new FileHandler("c:/logs/jul.log");
        fileHandler.setFormatter(simpleFormatter);
        logger.addHandler(fileHandler);
        // 2.日志记录输出
        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
    }

    /**
     * Logger之间的父子关系
     * @throws Exception
     */
    @Test
    public void testLogParent() throws Exception {
        // 日志记录器对象父子关系
        Logger logger1 = Logger.getLogger("com.rookie.bigdata");
        Logger logger2 = Logger.getLogger("com.rookie");
        System.out.println(logger1.getParent() == logger2);
        // 所有日志记录器对象的顶级父元素 class为java.util.logging.LogManager$RootLogger
        System.out.println("logger2 parent:" + logger2.getParent() + "，name：" + logger2.getParent().getName());
        // 一、自定义日志级别
        // a.关闭系统默认配置
        logger2.setUseParentHandlers(false);
        // b.创建handler对象
        ConsoleHandler consoleHandler = new ConsoleHandler();
        // c.创建formatter对象
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        // d.进行关联
        consoleHandler.setFormatter(simpleFormatter);
        logger2.addHandler(consoleHandler);
        // e.设置日志级别
        logger2.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);
        // 测试日志记录器对象父子关系
        logger1.severe("severe");
        logger1.warning("warning");
        logger1.info("info");
        logger1.config("config");
        logger1.fine("fine");
        logger1.finer("finer");
        logger1.finest("finest");
    }


    @Test
    public void testProperties() throws Exception {
        // 读取自定义配置文件
        InputStream in = JULTest.class.getClassLoader().getResourceAsStream("logging.properties");
        // 获取日志管理器对象
        LogManager logManager = LogManager.getLogManager();
        // 通过日志管理器加载配置文件
        logManager.readConfiguration(in);
        Logger logger = Logger.getLogger("com.rookie.bigdata.JULTest");
        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
    }


    //


}


//#为顶级父元素RootLogger指定默认的处理器:ConsoleHandler,即若是你没有自定义Logger,就用这个Logger
//handlers=java.util.logging.ConsoleHandler
//#顶级父元素默认的日志级别为INFO,即此Logger的日志级别是INFO
//.level=INFO
//
//#自定义Logger,即该Logger的name为com.itheima,调用时这样即可 Logger logger = Logger.getLogger("com.itheima");
//#指定了自定义Logger的handlers，ConsoleHandler是输出到控制台，FileHandler是输出到文件中，两个都指定就可以同时输出；
//com.itheima.handlers=java.util.logging.ConsoleHandler, java.util.logging.FileHandler
//#指定了自定义Logger的日志级别
//com.itheima.level=INFO
//#忽略父日志设置
//com.itheima.useParentHandlers=false
//
//#控制台处理器
//#输出日志级别
//#指定日志级别 ,尽量和自定义的级别相同，否则会有些日志无法打印处理
//java.util.logging.ConsoleHandler.level=INFO
//#指定日志的格式
//java.util.logging.ConsoleHandler.formatter=java.util.logging.SimpleFormatter
//#指定日志的编码
//java.util.logging.ConsoleHandler.encoding=UTF-8
//#指定日志消息的格式
//java.util.logging.SimpleFormatter.format=%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS %4$s %2$s %5$s%6$s%n
//
//#文件处理器
//# 输出日志级别
//java.util.logging.FileHandler.level=INFO
//# 输出日志格式
//java.util.logging.FileHandler.formatter = java.util.logging.SimpleFormatter
//# 输出日志文件路径
//java.util.logging.FileHandler.pattern = /java%u.log
//# 输出日志文件限制大小（50000字节）
//java.util.logging.FileHandler.limit = 50000
//# 输出日志文件限制个数
//java.util.logging.FileHandler.count = 10
//# 输出日志文件 是否是追加
//java.util.logging.FileHandler.append=true
