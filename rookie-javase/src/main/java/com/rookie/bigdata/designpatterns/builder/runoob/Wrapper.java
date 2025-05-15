package com.rookie.bigdata.designpatterns.builder.runoob;

/**
 * @Class Wrapper
 * @Description 创建实现 Packing 接口的实体类。
 * @Author rookie
 * @Date 2025/5/15 15:59
 * @Version 1.0
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
