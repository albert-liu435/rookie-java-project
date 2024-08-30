package com.rookie.bigdata.designpatterns.proxy.jdk;

/**
 * @Class UserServiceImpl
 * @Description
 * @Author rookie
 * @Date 2024/8/27 14:20
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {
    public void select() {
        System.out.println("查询 selectById");
    }
    public void update() {
        System.out.println("更新 update");
    }
}

