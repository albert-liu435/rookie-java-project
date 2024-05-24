package com.rookie.bigdata.designpatterns.mediator.one;

/**
 * @Class ColleagueImpl
 * @Description 具体同事类角色（ConcreteColleague）：所有的具体同事类均从抽象同事类继承而来。实现自己的业务，在需要与其他同事通信的时候，就与持有的中介者通信，中介者会负责与其他的同时交互。
 * @Author rookie
 * @Date 2023/5/6 17:34
 * @Version 1.0
 */
public class ColleagueImpl extends Colleague {

    ColleagueImpl(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void getMessage(String message,String messageFormName) {
        System.out.println("我" + this.getName() + " 被" + messageFormName + " 联系了， " + "信息为:" + message );
    }

    @Override
    public void contactColleague(String message,String ... toColleagueNames) {
        System.out.print("我 " + this.getName() + " 向 ");
        for (String toColleagueName : toColleagueNames){
            System.out.print(toColleagueName + ",");
        }
        System.out.println(" 发 " + message + " 信息");
        this.getMediator().contact(message,this, toColleagueNames);
    }
}