package com.rookie.bigdata.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class ConcreteAggregate
 * @Description
 * @Author rookie
 * @Date 2023/5/6 17:41
 * @Version 1.0
 */
// 具体聚合
public class ConcreteAggregate implements Aggregate {
    private List<Object> list=new ArrayList<Object>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return(new ConcreteIterator(list));
    }

}
