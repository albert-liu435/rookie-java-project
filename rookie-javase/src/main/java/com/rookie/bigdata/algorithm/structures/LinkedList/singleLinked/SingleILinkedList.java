package com.rookie.bigdata.algorithm.structures.LinkedList.singleLinked;

import com.rookie.bigdata.algorithm.structures.LinkedList.ILinkedList;

/**
 * @Class SingleILinkedList
 * @Description 项链表的实现, 不含独立头结点, 不含尾部指针
 * @Author rookie
 * @Date 2025/5/23 17:18
 * @Version 1.0
 */
public class SingleILinkedList<T> implements ILinkedList<T> {

    public Node<T> head;//带数据头结点

    public SingleILinkedList() {
    }

    public SingleILinkedList(Node<T> head) {
        this.head = head;
    }


    /**
     * 传入一个数组，转换成链表
     *
     * @param array
     */
    public SingleILinkedList(T[] array) {
        this.head = null;
        if (array != null && array.length > 0) {

            this.head = new Node<>(array[0]);
            Node<T> rear = this.head;
            int i = 1;
            while (i < array.length) {
                rear.next = new Node<>(array[i]);
                rear = rear.next;
                i++;
            }
        }

    }

    /**
     * 通过传入的链表构造新的链表
     *
     * @param list
     */
    public SingleILinkedList(SingleILinkedList<T> list) {
        this.head = null;
        if (list != null && list.head != null) {


        }

    }


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T data) {
        return null;
    }

    @Override
    public boolean add(int index, T data) {
        return false;
    }

    @Override
    public boolean add(T data) {
        return false;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public boolean removeAll(T data) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(T data) {
        return false;
    }
}
