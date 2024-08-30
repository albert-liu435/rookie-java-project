package com.rookie.bigdata.designpatterns.mediator.two;

/**
 * @Class Client
 * @Description https://kongzi.blog.csdn.net/article/details/103511324
 * @Author rookie
 * @Date 2023/5/6 17:39
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        Mediator m = new ClassMonitor();
        ClassLeader life = new LifeLeader(m);
        ClassLeader study = new StudyLeader(m);
        ClassLeader phycho = new PhychologicalLeader(m);
        //当前委员发送请求给班长然后通过班长与其他委员通信
        System.out.println("------生活委员->班长->心理委员------");
        life.sendRequest();
        System.out.println("--------------------------");
        System.out.println("------学习委员->班长->心理委员,生活委员------");
        study.sendRequest();
        System.out.println("--------------------------");
        System.out.println("------心理委员->班长->生活委员------");
        phycho.sendRequest();
        System.out.println("--------------------------");
    }
}