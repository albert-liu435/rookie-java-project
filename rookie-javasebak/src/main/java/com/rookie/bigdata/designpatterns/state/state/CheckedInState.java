package com.rookie.bigdata.designpatterns.state.state;

/**
 * @Class CheckedInState
 * @Description
 * @Author rookie
 * @Date 2023/5/6 17:16
 * @Version 1.0
 */
/**
 * 已入住状态
 *
 */
public class CheckedInState implements State {

    @Override
    public void handle() {
        System.out.println("房间已入住！请勿打扰！");
    }
}
