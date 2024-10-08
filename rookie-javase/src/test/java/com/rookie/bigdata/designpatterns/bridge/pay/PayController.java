package com.rookie.bigdata.designpatterns.bridge.pay;

import java.math.BigDecimal;

/**
 * @Class PayController
 * @Description
 * @Author rookie
 * @Date 2024/5/30 17:00
 * @Version 1.0
 */
public class PayController {


    /**
     * @param uId   用户id
     * @param tradeId 交易流水号
     * @param amount    交易金额
     * @param channelType 渠道类型 1 微信, 2 支付宝
     * @param modeType    支付模式 1 密码,2 人脸,3 指纹
     * @return: boolean
     */
    public boolean doPay(String uId, String tradeId, BigDecimal amount, int channelType, int modeType){
        //微信支付
        if(1 == channelType){
            System.out.println("微信渠道支付划账开始......");
            if(1 == modeType){
                System.out.println("密码支付");
            }if(2 == modeType){
                System.out.println("人脸支付");
            }if(3 == modeType){
                System.out.println("指纹支付");
            }
        }

        //支付宝支付
        if(2 == channelType){
            System.out.println("支付宝渠道支付划账开始......");
            if(1 == modeType){
                System.out.println("密码支付");
            }if(2 == modeType){
                System.out.println("人脸支付");
            }if(3 == modeType){
                System.out.println("指纹支付");
            }
        }
        return true;
    }
}

