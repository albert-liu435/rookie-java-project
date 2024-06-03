package com.rookie.bigdata.designpatterns.bridge.pay;

/**
 * @Class PayFingerprintMode
 * @Description TODO
 * @Author rookie
 * @Date 2024/5/30 17:02
 * @Version 1.0
 */
//指纹支付及风控校验
public class PayFingerprintMode implements IPayMode {

    @Override
    public boolean security(String uId) {
        System.out.println("指纹支付,风控校验-指纹信息");
        return true;
    }
}


