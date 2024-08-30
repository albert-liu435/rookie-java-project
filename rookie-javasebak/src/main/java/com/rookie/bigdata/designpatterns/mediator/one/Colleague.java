package com.rookie.bigdata.designpatterns.mediator.one;

/**
 * @Class Colleague
 * @Description 抽象同事类角色（Colleague）：定义各个同事类对象共有的方法，并声明了一些抽象方法供子类实现，同时他维持了一个对抽象中介者类的引用，其子类可以通过该引用进行通讯。同事对象只知道中介者，而不知道其余的同事对象。
 * @Author rookie
 * @Date 2023/5/6 17:34
 * @Version 1.0
 */
public abstract class Colleague {

    private Mediator mediator;

    private String name;

    Colleague(String name,Mediator mediator){
        this.name  =name;
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getter/setter方法

    // 得到其他同事发来的信息
    public abstract void getMessage(String message,String messageFormName);

    // 与其他同事通信
    public abstract void contactColleague(String message,String ... toColleagueName);

}