package com.rookie.bigdata.designpatterns.filter.runoob;

/**
 * @Class Person
 * @Description 创建一个类，在该类上应用标准。
 * @Author rookie
 * @Date 2025/5/15 16:26
 * @Version 1.0
 */
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name,String gender,String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
}
