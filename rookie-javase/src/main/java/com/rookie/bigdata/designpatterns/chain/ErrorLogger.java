package com.rookie.bigdata.designpatterns.chain;

/**
 * @Class ErrorLogger
 * @Description
 * @Author rookie
 * @Date 2025/5/9 13:39
 * @Version 1.0
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
