package com.rookie.bigdata.generic.generic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class GenericTest
 * @Description
 * @Author rookie
 * @Date 2024/7/4 16:42
 * @Version 1.0
 */
class GenericTest {

    @Test
    void test() {
        Generic<String> generic = new Generic<>();// 传入 String 类型

        // <> 中什么都不传入，等价于 Generic<Object> generic = new Generic<>();
        Generic generic1 = new Generic();
    }

}
