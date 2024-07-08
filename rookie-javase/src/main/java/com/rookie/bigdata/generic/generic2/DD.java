package com.rookie.bigdata.generic.generic2;

/**
 * @Class DD
 * @Description
 * @Author rookie
 * @Date 2024/7/4 16:50
 * @Version 1.0
 */
// DD 类定义为 泛型类，则不需要确定 接口的类型参数
// 但 DD 类定义的类型参数要和接口中类型参数的一致
public class DD<U, R> implements IUsb<U, R> {

    @Override
    public R get(U u) {
        return null;
    }

    @Override
    public void hi(R r) {

    }
}
