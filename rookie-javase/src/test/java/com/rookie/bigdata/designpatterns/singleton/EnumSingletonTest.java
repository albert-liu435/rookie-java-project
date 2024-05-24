package com.rookie.bigdata.designpatterns.singleton;

import com.rookie.bigdata.common.MyThreadPoolExecutor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class EnumSingletonTest
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 14:16
 * @Version 1.0
 */
class EnumSingletonTest {

    @Test
    void whateverMethod() {
        MyThreadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName() + "-->" + EnumSingleton.INSTANCE.hashCode());
        });
    }
}