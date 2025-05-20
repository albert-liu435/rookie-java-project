package com.rookie.bigdata.designpatterns.bridge.runoob;

/**
 * @Class RedCircle
 * @Description 创建实现了 DrawAPI 接口的实体桥接实现类。
 * @Author rookie
 * @Date 2025/5/15 16:21
 * @Version 1.0
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
