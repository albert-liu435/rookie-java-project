package com.rookie.bigdata.designpatterns.composite;

/**
 * @Class Component
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 16:05
 * @Version 1.0
 */
public abstract class Component{
    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract Component getChild(int i);
    public abstract void operation();//业务方法

    public abstract void operation(Component component);
}