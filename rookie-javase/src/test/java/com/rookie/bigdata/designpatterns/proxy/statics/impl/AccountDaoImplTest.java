package com.rookie.bigdata.designpatterns.proxy.statics.impl;

import com.rookie.bigdata.designpatterns.proxy.statics.AccountDao;
import com.rookie.bigdata.designpatterns.proxy.statics.AccountDaoProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class AccountDaoImplTest
 * @Description
 * @Author rookie
 * @Date 2024/8/30 10:56
 * @Version 1.0
 */
class AccountDaoImplTest {

    @Test
    void reduce() {
        AccountDao accountDao = new AccountDaoImpl();
        AccountDaoProxy accountProxy = new AccountDaoProxy(accountDao);
        accountProxy.reduce(100);
    }
}
