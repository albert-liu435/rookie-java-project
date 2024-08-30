package com.rookie.bigdata.designpatterns.proxy.statics;

/**
 * @Class AccountDaoProxy
 * @Description
 * @Author rookie
 * @Date 2024/8/30 10:54
 * @Version 1.0
 */
// 代理类
public class AccountDaoProxy implements AccountDao {
    private AccountDao target;

    public AccountDaoProxy(AccountDao target) {
        this.target = target;
    }

    @Override
    public void reduce(int cost) {
        //...
//        connection.setAutoCommit(false);
        System.out.println("reduce before");
        try {
            target.reduce(cost);
//            connection.commit();
            System.out.println("reduce after");
        } catch(Exception e) {
//            connection.rollback();
        } finally {
            //...
        }
    }
}
