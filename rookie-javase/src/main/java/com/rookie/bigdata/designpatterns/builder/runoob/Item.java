package com.rookie.bigdata.designpatterns.builder.runoob;

/**
 * @Class Item
 * @Description 创建一个表示食物条目和食物包装的接口。
 * @Author rookie
 * @Date 2025/5/15 15:59
 * @Version 1.0
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
