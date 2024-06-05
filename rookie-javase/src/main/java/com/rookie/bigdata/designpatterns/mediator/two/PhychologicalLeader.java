package com.rookie.bigdata.designpatterns.mediator.two;

/**
 * @Class PhychologicalLeader
 * @Description
 * @Author rookie
 * @Date 2023/5/6 17:38
 * @Version 1.0
 */
//心理委员
public class PhychologicalLeader implements ClassLeader {
    //持有对班长大人的引用
    private Mediator media;
    public PhychologicalLeader(Mediator media) {
        super();
        this.media = media;
        media.register("phycologic", this);
    }

    @Override
    public void job() {
        System.out.println("心理委员->小张最近心情好像不太好，需要我的帮助!");
    }

    @Override
    public void sendRequest() {
        System.out.println("心理委员->小张是不是生活上有什么问题，班长大人叫生活委员多关注一下吧!");
        media.command("LifeLeader");
    }
}
