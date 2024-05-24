package com.rookie.bigdata.designpatterns.state.state;

/**
 * @Class FreeState
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 17:16
 * @Version 1.0
 */
/**
 * 空闲状态
 *
 */
public class FreeState implements State {

    @Override
    public void handle() {
        System.out.println("房间空闲！！！没人住！");
    }
}
