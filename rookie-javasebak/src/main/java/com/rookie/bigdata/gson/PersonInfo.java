package com.rookie.bigdata.gson;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Class PersonInfo
 * @Description
 * @Author rookie
 * @Date 2024/7/8 14:24
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class PersonInfo{
    long id;
    String name;
    int age;
}
