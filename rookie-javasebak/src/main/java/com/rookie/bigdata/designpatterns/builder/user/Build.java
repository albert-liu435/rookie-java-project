package com.rookie.bigdata.designpatterns.builder.user;

/**
 * @Class Builder
 * @Description 抽象建造者/建造者接口(Builder)
 * @Author rookie
 * @Date 2023/5/6 17:20
 * @Version 1.0
 */
public interface Build {
    void makeId(String val);
    void makeName(String val);
    void makePassword(String val);
    void makePhone(String val);
    User makeUser();
}