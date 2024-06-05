package com.rookie.bigdata.designpatterns.bridge.other;

/**
 * @Class PhoneBrand
 * @Description
 * @Author rookie
 * @Date 2023/5/6 17:28
 * @Version 1.0
 */
public abstract class PhoneBrand {

    public Soft soft;   //引用了软件类 类似桥梁，将两个抽象类连通

    public void setSoft(Soft soft) {
        this.soft = soft;
    }

    public abstract void run();
}

