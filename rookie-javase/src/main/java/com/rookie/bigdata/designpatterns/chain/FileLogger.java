package com.rookie.bigdata.designpatterns.chain;

/**
 * @Class FileLogger
 * @Description
 * @Author rookie
 * @Date 2025/5/9 13:39
 * @Version 1.0
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
