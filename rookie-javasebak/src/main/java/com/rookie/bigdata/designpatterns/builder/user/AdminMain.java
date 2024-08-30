package com.rookie.bigdata.designpatterns.builder.user;

/**
 * @Class AdminMain
 * @Description https://kongzi.blog.csdn.net/article/details/103140954
 * @Author rookie
 * @Date 2023/5/6 17:21
 * @Version 1.0
 */
public class AdminMain {

    public static void main(String[] args){
        // new具体建造者
        AdminBuilder adminBuilder=new AdminBuilder();
        Admin admin=new Admin();// new出Admin指导建造者
        admin.setAdminBuilder(adminBuilder);// 准备开始建造(不写会报空指针)
        // 根据Admin的建造方法创建User
        User user=admin.makeUser("1","张三","123456","88888888");
        System.out.println(user.toString());
    }
}
