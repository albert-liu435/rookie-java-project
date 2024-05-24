package com.rookie.bigdata.designpatterns.builder.user;

import lombok.Data;

/**
 * @Class User
 * @Description 实体User类(Product)
 * @Author rookie
 * @Date 2023/5/6 17:19
 * @Version 1.0
 */

@Data
public class User {
    String id;
    String name;
    String password;
    String phone;

    //set/get方法
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}