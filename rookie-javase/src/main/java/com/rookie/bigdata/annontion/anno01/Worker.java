package com.rookie.bigdata.annontion.anno01;

/**
 * @Class Worker
 * @Description
 * @Author rookie
 * @Date 2024/9/6 9:38
 * @Version 1.0
 */

@Hours(hours = 4)
@Hours(hours = 4.5)
@Hours(hours = 2)
public class Worker {

    public static void main(String[] args) {
        //通过Hours注解类型来获取Worker中的值数组对象
        Hours[] hours = Worker.class.getAnnotationsByType(Hours.class);
        //遍历数组
        for (Hours h : hours) {
            System.out.println(h);
        }
    }
}
