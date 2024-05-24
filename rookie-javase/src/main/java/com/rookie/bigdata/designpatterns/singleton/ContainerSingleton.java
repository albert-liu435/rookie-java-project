package com.rookie.bigdata.designpatterns.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Class ContainerSingleton
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 14:27
 * @Version 1.0
 */
public class ContainerSingleton {

    private static final Map<String, Object> CONTAINER = new ConcurrentHashMap<>();


    private ContainerSingleton() {
        //防止反射攻击
        throw new IllegalArgumentException("HungrySingleton not allow be constructed");
    }


    public static Object getInstance(String qualifiedName) {
        synchronized (CONTAINER) {
            try {
                if (!CONTAINER.containsKey(qualifiedName)) {
                    Object o = Class.forName(qualifiedName).newInstance();
                    CONTAINER.put(qualifiedName, CONTAINER);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return CONTAINER.get(qualifiedName);
        }
    }

}
