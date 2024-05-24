package com.rookie.bigdata.designpatterns.builder.user;

/**
 * @Class AdminBuilder
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 17:20
 * @Version 1.0
 */
public class AdminBuilder implements Build{
    User user=new User();
    @Override
    public User makeUser(){
        return user;
    }
    @Override
    public void makeId(String val) {
        user.setId(val);
    }
    @Override
    public void makeName(String val) {
        user.setName(val);
    }
    @Override
    public void makePassword(String val) {
        user.setPassword(val);
    }
    @Override
    public void makePhone(String val) {
        user.setPhone(val);
    }
}