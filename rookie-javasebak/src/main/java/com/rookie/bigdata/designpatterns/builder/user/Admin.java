package com.rookie.bigdata.designpatterns.builder.user;

/**
 * @Class Admin
 * @Description Admin指导建造者创建User(Director)
 * @Author rookie
 * @Date 2023/5/6 17:21
 * @Version 1.0
 */
public class Admin {
    private AdminBuilder adminBuilder;

    public void setAdminBuilder(AdminBuilder adminBuilder) {
        this.adminBuilder = adminBuilder;
    }
    public User makeUser(String id,String name,String password,String phone){
        adminBuilder.makeId(id);
        adminBuilder.makeName(name);
        adminBuilder.makePassword(password);
        adminBuilder.makePhone(phone);
        return this.adminBuilder.makeUser();
    }
}