package com.rookie.bigdata.designpatterns.all.srp.v1;



/**
 * @Class Program
 * @Description https://www.cnblogs.com/green-jcx/p/16203447.html
 * @Author rookie
 * @Date 2025/5/14 20:23
 * @Version 1.0
 */
public class Program {

    public static void main(String[] args) {
        Box box = new Box();
        box.Lay("碗");
        box.Lay("书");
        box.Lay("锤子");
//        BowlBox bowlBox = new BowlBox();
//        bowlBox.Lay("饭碗");
//        ToolBox ToolBox = new ToolBox();
//        ToolBox.Lay("锤子");
//        BookBox bookBox = new BookBox();
//        bookBox.Lay("书");
    }
}
