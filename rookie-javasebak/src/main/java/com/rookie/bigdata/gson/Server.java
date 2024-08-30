package com.rookie.bigdata.gson;

import com.google.gson.Gson;

/**
 * @Class Server
 * @Description TODO
 * @Author rookie
 * @Date 2024/7/8 14:24
 * @Version 1.0
 */
public class Server {
    public static String getPersonById(Long id){
        PersonInfo personInfo = new PersonInfo(1234L, "zhangesan", 18);
        Response<PersonInfo> response = new Response<>(200, "success", personInfo);
        //序列化
        return new Gson().toJson(response);
    }
}
