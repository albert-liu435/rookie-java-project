package com.rookie.bigdata.util.concurrent.atomic;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Class AtomicLongMain
 * @Description TODO
 * @Author rookie
 * @Date 2023/11/1 10:04
 * @Version 1.0
 */
public class AtomicLongMain {

    protected final AtomicLong refCount = new AtomicLong(1);

    @Test
    void testGetAndIncrement(){

        System.out.println(this.refCount.getAndIncrement());



    }
}
