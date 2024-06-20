package com.rookie.bigdata.fastjson;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Set;

/**
 * @Class JsonMain
 * @Description
 * @Author rookie
 * @Date 2024/6/13 15:43
 * @Version 1.0
 */
public class JsonMain {

    public static void main(String[] args) {
        String parameters = "{\"username\":\"qzcsbj\", \"password\":\"123456\"}";

        // 方式一：先解析为JSONObject，然后转换为map
        // 先创建一个map
        HashMap<String, String> params = new HashMap<String, String>();

        // 解析json格式字符串为JSONObject（JSONObject是Map接口的一个实现类，和HashMap平级）
        JSONObject jsonObject = JSONObject.parseObject(parameters);
        // 也可以写为下面，因为JSONObject继承了JSON，parseObject是JSON的静态方法
        // JSONObject jsonObject2 = JSON.parseObject(parameters);

        // JSONObject转换为map
        Set<String> keys = jsonObject.keySet();
        for (String key : keys) {
            params.put(key, jsonObject.getString(key));
        }

        // 遍历map
        Set<String> username = params.keySet();
        for (String name : username) {
            System.out.println("key=" + name + ", value=" + params.get(name));
        }
    }
}
