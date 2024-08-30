package com.rookie.bigdata.designpatterns.mediator.one;

/**
 * @Class Mediator
 * @Description 抽象中介者角色（Mediator）：定义一个接口用于与各同事对象之间进行通信，其中主要方法是一个（或多个）事件方法。
 * @Author rookie
 * @Date 2023/5/6 17:34
 * @Version 1.0
 */

/**
 * 抽象的中介者
 */
public interface Mediator {

    /**
     * 中介者来使各同事之间的联系
     *
     * @param content          交流内容
     * @param toColleagueNames 被联系者的名字
     */
    void contact(String content, Colleague colleague, String... toColleagueNames);

    /**
     * 添加同事
     *
     * @param colleague 被添加的同事
     */
    void addColleague(Colleague colleague);
}