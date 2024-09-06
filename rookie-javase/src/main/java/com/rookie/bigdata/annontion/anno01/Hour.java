package com.rookie.bigdata.annontion.anno01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Class Hour
 * @Description
 * @Author rookie
 * @Date 2024/9/6 9:36
 * @Version 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Hour {

    Hours[] value();
}
