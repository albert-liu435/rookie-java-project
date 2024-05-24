package com.rookie.bigdata.designpatterns.bridge.other;

/**
 * @Class BrandN
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 17:29
 * @Version 1.0
 */
//品牌N
public class BrandN extends PhoneBrand{

    @Override
    public void run() {
        super.soft.run();
        System.out.println("品牌N");
    }
}