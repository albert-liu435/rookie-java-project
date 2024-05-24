package com.rookie.bigdata.designpatterns.composite.transparent;

/**
 * @Class Client
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 17:07
 * @Version 1.0
 */
public class Client {
    public static void main(String[]args){
        Component root = new Composite("服装");
        Component c1 = new Composite("男装");
        Component c2 = new Composite("女装");

        Component leaf1 = new Leaf("衬衫");
        Component leaf2 = new Leaf("夹克");
        Component leaf3 = new Leaf("裙子");
        Component leaf4 = new Leaf("套装");

        root.addChild(c1);
        root.addChild(c2);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);
        c2.addChild(leaf4);

        root.printStruct("");
    }
}
