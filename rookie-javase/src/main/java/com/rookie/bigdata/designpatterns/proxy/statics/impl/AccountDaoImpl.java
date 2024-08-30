package com.rookie.bigdata.designpatterns.proxy.statics.impl;

import com.rookie.bigdata.designpatterns.proxy.statics.AccountDao;

/**
 * @Class AccountDaoImpl
 * @Description
 * @Author rookie
 * @Date 2024/8/30 10:53
 * @Version 1.0
 */
// 目标类
public class AccountDaoImpl implements AccountDao {
    @Override
    public void reduce(int cost) {
        System.out.println("cost " + cost + " yuan.");
        // ... database operation
    }
}
