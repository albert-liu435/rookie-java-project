package com.rookie.bigdata.designpatterns.bridge.shape;

/**
 * @Class RedDraw
 * @Description
 * @Author rookie
 * @Date 2024/5/30 16:43
 * @Version 1.0
 */
public class RedDraw implements DrawApi{
    @Override
    public String draw() {
        return "使用红色颜料画图";
    }
}
