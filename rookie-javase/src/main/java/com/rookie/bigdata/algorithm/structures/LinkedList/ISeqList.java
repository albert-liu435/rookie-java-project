package com.rookie.bigdata.algorithm.structures.LinkedList;

/**
 * @Class ISeqList
 * @Description 顺序表顶级接口
 * @Author rookie
 * @Date 2025/5/23 9:14
 * @Version 1.0
 */
public interface ISeqList<T> {

    /**
     * 判断是否为空
     *
     * @return
     */
    boolean isEmpty();


    /**
     * 获取表的长度
     *
     * @return
     */
    int length();

    /**
     * 获取元素
     *
     * @param index
     * @return
     */
    T get(int index);


    /**
     * 设置某个节点的值
     *
     * @param index
     * @param data
     * @return
     */
    T set(int index, T data);

    /**
     * 根据index添加节点
     *
     * @param index
     * @param data
     * @return
     */
    boolean add(int index, T data);


    /**
     * 添加节点
     *
     * @param data
     * @return
     */
    boolean add(T data);


    /**
     * 根据index移除节点
     *
     * @param index
     * @return
     */
    T remove(int index);

    /**
     * 根据data移除节点
     *
     * @param data
     * @return
     */
    boolean remove(T data);


    /**
     * 根据data移除所有节点
     *
     * @param data
     * @return
     */
    boolean removeAll(T data);

    /**
     * 清空链表
     */
    void clear();

    /**
     * 是否包含data节点
     *
     * @param data
     * @return
     */
    boolean contains(T data);


    /**
     * 根据data值查询最后一个出现的顺序表中的下标
     *
     * @param data
     * @return
     */
    int indexOf(T data);


    /**
     * 输出格式
     *
     * @return
     */
    String toString();

}
