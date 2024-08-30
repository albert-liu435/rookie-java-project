package com.rookie.bigdata.designpatterns.bridge.pay;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * @Class Test_Pay
 * @Description https://blog.csdn.net/jbjmh/article/details/136048208
 * https://www.cnblogs.com/longyao/p/11732983.html
 * @Author rookie
 * @Date 2024/5/30 17:01
 * @Version 1.0
 */

//测试
public class Test_Pay {

    public static void main(String[] args) {

        PayController payController = new PayController();
        System.out.println("测试: 微信支付、人脸支付方式");
        payController.doPay("weixin_001","1000112333333",new BigDecimal(100),1,2);

        System.out.println("\n测试: 支付宝支付、指纹支付方式");
        payController.doPay("hifubao_002","1000112334567",new BigDecimal(100),2,3);

    }



    @Test
    public void test02() {
        System.out.println("测试场景1: 微信支付、人脸方式.");
        Pay wxpay = new WxPay(new PayFaceMode());
        wxpay.transfer("wx_00100100","10001900",new BigDecimal(100));

        System.out.println();

        System.out.println("测试场景2: 支付宝支付、指纹方式");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jlu1234567","567689999999",new BigDecimal(200));
    }

}
