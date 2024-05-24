package com.rookie.bigdata.designpatterns.mediator.two;

/**
 * @Class LifeLeader
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 17:38
 * @Version 1.0
 */
//生活委员
public class LifeLeader implements ClassLeader {
    //持有对班长大人的引用
    private Mediator media;

    public LifeLeader(Mediator media) {
        super();
        this.media = media;
        media.register("LifeLeader", this);
    }

    @Override
    public void job() {
        System.out.println("生活委员->小张最近生活作风有点问题，需要我的帮助!");
    }

    @Override
    public void sendRequest() {
        System.out.println("生活委员->小张是不是有什么精神负担，班长大人去叫心理委员去看看什么情况吧!");
        media.command("phycologic");
    }
}

