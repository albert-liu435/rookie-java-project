package com.rookie.bigdata.designpatterns.all.srp.v3;

/**
 * @Class Box
 * @Description 盒子类
 * @Author rookie
 * @Date 2025/5/14 20:31
 * @Version 1.0
 */
public class Box {

    public void LayBowlGrid(String bowl) {
        System.out.println("将" + bowl + "放入盒子里的碗格");
    }

    public void LayToolGrid(String tool) {
        System.out.println("将" + tool + "放入盒子里的工具格");
    }

    public void LayBookGrid(String book) {
        System.out.println("将" + book + "放入盒子里的书格");
    }
}
