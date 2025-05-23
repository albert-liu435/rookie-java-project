package com.rookie.bigdata.algorithm.structures.LinkedList.singleLinked;

/**
 * @Class Node
 * @Description 单向链表节点
 * @Author rookie
 * @Date 2025/5/23 17:11
 * @Version 1.0
 */
public class Node<T> {

    public T data;

    public Node<T> next;

    public Node() {

    }

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }


}
