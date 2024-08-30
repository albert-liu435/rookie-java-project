package com.rookie.bigdata.designpatterns.state.state;

/**
 * @Class Client
 * @Description https://kongzi.blog.csdn.net/article/details/103387094
 * @Author rookie
 * @Date 2023/5/6 17:17
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 获取房间对象
        HomeContext ctx = new HomeContext();
        // 设置房间状态
        ctx.setState(new FreeState());
        ctx.setState(new BookedState());
    }
}

/**
 * 修改状态！
 * 房间空闲！！！没人住！
 * 修改状态！
 * 房间已预订！别人不能定！
 */