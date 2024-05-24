package com.rookie.bigdata.designpatterns.mediator.one;

import java.util.HashMap;
import java.util.Map;

/**
 * @Class MediatorImpl
 * @Description 具体中介者角色（ConcreteMediator）：实现抽象中介者中所声明的事件方法。具体中介者维持了对各个具体同事类对象的引用，并负责具体的协调各个同事对象的交互关系。
 * @Author rookie
 * @Date 2023/5/6 17:35
 * @Version 1.0
 */
public class MediatorImpl implements Mediator {

    // 维护并知道所有同事。
    private Map<String,Colleague> colleagueMap = new HashMap<>();


    @Override
    public void contact(String message,Colleague colleagueForm, String... toColleagueNames) {
        for (String name : toColleagueNames){
            Colleague colleague = colleagueMap.get(name);
            colleague.getMessage(message,colleagueForm.getName());
        }
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagueMap.put(colleague.getName(),colleague);
    }
}