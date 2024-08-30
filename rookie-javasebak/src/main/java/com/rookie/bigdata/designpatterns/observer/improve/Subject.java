package com.rookie.bigdata.designpatterns.observer.improve;

/**
 * @Class Subject
 * @Description 接口, 让WeatherData 来实现
 * @Author rookie
 * @Date 2024/5/27 9:18
 * @Version 1.0
 */
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
