package com.rookie.bigdata.generic.generic6;

/**
 * @Class Pair
 * @Description
 * @Author rookie
 * @Date 2024/7/4 17:39
 * @Version 1.0
 */
public class Pair<T> {
    private T first;
    private T last;

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }
    public T getFirst() {
        return first;
    }
    public T getLast() {
        return last;
    }
    public void setFirst(T first) {
        this.first = first;
    }
    public void setLast(T last) {
        this.last = last;
    }
}
