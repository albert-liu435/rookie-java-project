package com.rookie.bigdata.algorithm.structures.stack;

/**
 * @Class Stack
 * @Description 栈接口抽象数据类型
 * @Author rookie
 * @Date 2025/5/22 15:57
 * @Version 1.0
 */
public interface Stack<T> {

    /**
     * 栈是否为空
     *
     * @return
     */
    boolean isEmpty();

    /**
     * data元素入栈
     *
     * @param data
     */
    void push(T data);

    /**
     * 返回栈顶元素，未出栈
     *
     * @return
     */
    T peek();

    /**
     * 出栈,返回栈顶元素，同时从栈中移除元素
     *
     * @return
     */
    T pop();

}
