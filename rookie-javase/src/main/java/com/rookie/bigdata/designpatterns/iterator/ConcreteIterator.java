package com.rookie.bigdata.designpatterns.iterator;

import java.util.List;

/**
 * @Class ConcreteIterator
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 17:41
 * @Version 1.0
 */
// 具体迭代器
public class ConcreteIterator implements Iterator {
    private List<Object> list = null;
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object first() {
        index = 0;
        Object obj = list.get(index);
        return obj;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }
}