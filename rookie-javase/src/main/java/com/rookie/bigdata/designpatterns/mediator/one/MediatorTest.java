package com.rookie.bigdata.designpatterns.mediator.one;

/**
 * @Class MediatorTest
 * @Description https://kongzi.blog.csdn.net/article/details/103511324
 * @Author rookie
 * @Date 2023/5/6 17:35
 * @Version 1.0
 */
public class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();

        Colleague colleagueA = new ColleagueImpl("小花", mediator);
        Colleague colleagueB = new ColleagueImpl("小明", mediator);
        Colleague colleagueC = new ColleagueImpl("小绿", mediator);
        Colleague colleagueD = new ColleagueImpl("小蓝", mediator);

        mediator.addColleague(colleagueA);
        mediator.addColleague(colleagueB);
        mediator.addColleague(colleagueC);
        mediator.addColleague(colleagueD);

        colleagueA.contactColleague("大家好", colleagueB.getName(), colleagueC.getName(), colleagueD.getName());
    }
}