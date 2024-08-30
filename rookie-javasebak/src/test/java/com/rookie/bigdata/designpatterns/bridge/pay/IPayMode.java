package com.rookie.bigdata.designpatterns.bridge.pay;

/**
 * @Class IPayMode
 * @Description
 * @Author rookie
 * @Date 2024/5/30 17:02
 * @Version 1.0
 */
/**
 * 支付模式接口
 **/
public interface IPayMode {

    //安全校验功能: 对各种支付模式进行风控校验
    boolean security(String uId);
}

