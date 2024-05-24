package com.rookie.bigdata.designpatterns.singleton;

import com.rookie.bigdata.common.MyThreadPoolExecutor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class LazySingletonTest
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 14:24
 * @Version 1.0
 */
class LazySingletonTest {

    @Test
    void getInstance() {

        MyThreadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName() + "-->" + LazySingleton.getInstance());
        });

    }
}