package com.rookie.bigdata.designpatterns.state.state;

/**
 * @Class HomeContext
 * @Description
 * @Author rookie
 * @Date 2023/5/6 17:16
 * @Version 1.0
 */

/**
 * 房间对象
 */
public class HomeContext {
    //如果是银行系统，这个Context类就是账号。根据金额不同，切换不同的状态！
    private State state;

    public void setState(State s) {
        System.out.println("修改状态！");
        state = s;
        state.handle();
    }
}
