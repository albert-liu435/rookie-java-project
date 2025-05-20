package com.rookie.bigdata.designpatterns.all.srp.v1;

/**
 * @Class Box
 * @Description
 * @Author rookie
 * @Date 2025/5/14 20:22
 * @Version 1.0
 */
public class Box {
    /// <summary>
    /// 将物品放入盒子
    /// </summary>
    /// <param name="stuff">物品</param>
    public void Lay(String stuff) {
//        Console.WriteLine($"将{stuff}放入盒子里");
        System.out.println("将" + stuff + "放入盒子里");
    }
}
