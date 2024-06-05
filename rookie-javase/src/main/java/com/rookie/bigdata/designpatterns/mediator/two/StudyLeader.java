package com.rookie.bigdata.designpatterns.mediator.two;

/**
 * @Class StudyLeader
 * @Description
 * @Author rookie
 * @Date 2023/5/6 17:38
 * @Version 1.0
 */

//学习委员
public class StudyLeader implements ClassLeader {
    //持有对班长大人的引用
    private Mediator media;

    public StudyLeader(Mediator media) {
        super();
        this.media = media;
        media.register("StudyLeader", this);
    }

    @Override
    public void job() {
        System.out.println("学习委员->小张最近成绩突飞猛进，果然在我的英明指导下没有人能不起飞!");
    }

    @Override
    public void sendRequest() {
        System.out.println("学习委员->小张为了成绩居然还搞抄袭，怎么变成这样了?班长大人快去通知生活委员和心理委员看看情况!");
        media.command("LifeLeader");
        media.command("phycologic");
    }
}
