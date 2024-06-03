package com.rookie.bigdata.designpatterns.bridge.pay;

/**
 * @Class PayCypher
 * @Description TODO
 * @Author rookie
 * @Date 2024/5/30 17:03
 * @Version 1.0
 */
//密码支付及风控校验
public class PayCypher implements IPayMode {

    @Override
    public boolean security(String uId) {
        System.out.println("密码支付,风控校验-环境安全");
        return false;
    }
}
