package com.rookie.bigdata.designpatterns.observer.improve;

/**
 * @Class Observer
 * @Description 观察者接口，有观察者来实现
 * @Author rookie
 * @Date 2024/5/27 9:25
 * @Version 1.0
 */
public interface Observer {

    public void update(float temperature, float pressure, float humidity);
}
