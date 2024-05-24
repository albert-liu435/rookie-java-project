package com.rookie.bigdata.designpatterns.composite.safety;

/**
 * @Class Component
 * @Description https://blog.csdn.net/carefree31441/article/details/103125233/
 * @Author rookie
 * @Date 2023/5/6 16:15
 * @Version 1.0
 */
// 抽象构件角色类
public interface Component {
    /**
     * 输出组建自身的名称
     */
    public void printStruct(String preStr);
}

