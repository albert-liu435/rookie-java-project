package com.rookie.bigdata.designpatterns.iterator;

/**
 * @Class Iterator
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 17:40
 * @Version 1.0
 */
// 抽象迭代器
public interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
}
