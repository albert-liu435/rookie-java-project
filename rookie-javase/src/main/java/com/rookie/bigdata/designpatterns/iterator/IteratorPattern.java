package com.rookie.bigdata.designpatterns.iterator;

/**
 * @Class IteratorPattern
 * @Description https://kongzi.blog.csdn.net/article/details/103304681
 * @Author rookie
 * @Date 2023/5/6 17:41
 * @Version 1.0
 */
public class IteratorPattern {
    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("中山大学");
        ag.add("华南理工");
        ag.add("韶关学院");
        System.out.print("聚合的内容有：");
        Iterator it = ag.getIterator();
        while (it.hasNext()) {
            Object ob = it.next();
            System.out.print(ob.toString() + "\t");
        }
        Object ob = it.first();
        System.out.println("\nFirst：" + ob.toString());
    }
}

/**
 聚合的内容有：中山大学	华南理工	韶关学院
 First：中山大学
 */