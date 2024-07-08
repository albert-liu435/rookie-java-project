package com.rookie.bigdata.generic.generic2;

/**
 * @Class BB
 * @Description
 * @Author rookie
 * @Date 2024/7/4 16:48
 * @Version 1.0
 */
// 实现接口时，需要指定泛型接口的类型参数
// 给 U 指定 Integer， 给 R 指定了 Float
// 所以，当我们实现 IUsb 方法时，会使用 Integer 替换 U, 使用 Float 替换 R
public class BB implements IUsb<Integer, Float> {
    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float afloat) {

    }
}
