package com.rookie.bigdata.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;


/**
 * @Class ServerTest
 * @Description
 * @Author rookie
 * @Date 2024/7/8 14:25
 * @Version 1.0
 */
class ServerTest {


    @Test
    public void test01() {
        String responseStr = Server.getPersonById(1234L);
        //反序列化
        Response<PersonInfo> response = new Gson().fromJson(responseStr, new TypeToken<Response<PersonInfo>>() {
        }.getType());
        System.out.println(response);
    }

}
