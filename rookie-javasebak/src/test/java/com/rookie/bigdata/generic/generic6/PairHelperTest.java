package com.rookie.bigdata.generic.generic6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class PairHelperTest
 * @Description
 * @Author rookie
 * @Date 2024/7/4 17:40
 * @Version 1.0
 */
class PairHelperTest {

    @Test
    void test01() {
        Pair<Number> pair = new Pair<>(1, 2);
        int sum = PairHelper.addPair(pair);
    }

    @Test
    void test02() {
//        Pair<Integer> pairInteger = new Pair<>(123, 456);
//        int sum = PairHelper.addPair(pair);
//        编译器会直接报错，原因是 Pair< Integer > 并不是 Pair< Number > 的子类，而 addPair() 方法的形参数据类型为 Pair< Number >。因此， Pair< Integer > 对象不能传给 addPair() 方法。**
    }
}
