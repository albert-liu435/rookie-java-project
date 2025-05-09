package com.rookie.bigdata.designpatterns.chain;

/**
 * @Class ConsoleLogger
 * @Description
 * @Author rookie
 * @Date 2025/5/9 13:39
 * @Version 1.0
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
