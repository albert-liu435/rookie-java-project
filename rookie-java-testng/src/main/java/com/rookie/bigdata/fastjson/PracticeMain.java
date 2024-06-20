package com.rookie.bigdata.fastjson;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @Class PracticeMain
 * @Description https://www.cnblogs.com/uncleyong/p/16683578.html
 * @Author rookie
 * @Date 2024/6/13 15:45
 * @Version 1.0
 */
public class PracticeMain {
    public static void main(String[] args) {
        String parameters = "[{\"name\":\"jack\",\"age\":\"18\"},{\"name\":\"tom\",\"age\":\"19\"}]";
        List<User> users = JSONObject.parseArray(parameters, User.class);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
