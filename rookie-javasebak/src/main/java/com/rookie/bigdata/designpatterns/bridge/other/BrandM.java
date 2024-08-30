package com.rookie.bigdata.designpatterns.bridge.other;

/**
 * @Class BrandM
 * @Description
 * @Author rookie
 * @Date 2023/5/6 17:28
 * @Version 1.0
 */
//品牌M
public class BrandM extends PhoneBrand{

    @Override
    public void run() {
        super.soft.run();
        System.out.println("品牌M");
    }
}
