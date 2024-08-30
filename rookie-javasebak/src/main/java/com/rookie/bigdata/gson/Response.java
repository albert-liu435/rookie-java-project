package com.rookie.bigdata.gson;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Class Response
 * @Description
 * @Author rookie
 * @Date 2024/7/8 14:23
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class Response<T>{
    int code;
    String message;
    T body;
}
