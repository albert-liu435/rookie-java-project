package com.rookie.bigdata.designpatterns.composite.safety;

/**
 * @Class Client
 * @Description
 * @Author rookie
 * @Date 2023/5/6 16:16
 * @Version 1.0
 */
// 客户端类
public class Client {
    public static void main(String[]args){
        Composite root = new Composite("服装");
        Composite c1 = new Composite("男装");
        Composite c2 = new Composite("女装");

        Leaf leaf1 = new Leaf("衬衫");
        Leaf leaf2 = new Leaf("夹克");
        Leaf leaf3 = new Leaf("裙子");
        Leaf leaf4 = new Leaf("套装");

        root.addChild(c1);
        root.addChild(c2);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);
        c2.addChild(leaf4);

        root.printStruct("");
    }
}// 抽象构件角色类
