package com.rookie.bigdata.designpatterns.bridge.pay;

/**
 * @Class PayFaceMode
 * @Description
 * @Author rookie
 * @Date 2024/5/30 17:02
 * @Version 1.0
 */
//刷脸支付及风控校验
public class PayFaceMode implements IPayMode {

    @Override
    public boolean security(String uId) {
        System.out.println("人脸支付,风控校验-脸部识别");
        return true;
    }
}
