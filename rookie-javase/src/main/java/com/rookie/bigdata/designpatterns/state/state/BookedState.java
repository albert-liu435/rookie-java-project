package com.rookie.bigdata.designpatterns.state.state;

/**
 * @Class BookedState
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 17:15
 * @Version 1.0
 */

/**
 * 已预订状态
 */
public class BookedState implements State {

    @Override
    public void handle() {
        System.out.println("房间已预订！别人不能定！");
    }
}