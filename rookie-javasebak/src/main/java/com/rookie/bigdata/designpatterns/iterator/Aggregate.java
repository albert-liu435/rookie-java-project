package com.rookie.bigdata.designpatterns.iterator;

/**
 * @Class Aggregate
 * @Description
 * @Author rookie
 * @Date 2023/5/6 17:40
 * @Version 1.0
 */
// 抽象聚合
public interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator getIterator();
}


