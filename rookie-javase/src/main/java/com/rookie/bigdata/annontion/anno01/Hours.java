package com.rookie.bigdata.annontion.anno01;

import java.lang.annotation.Repeatable;

/**
 * @Class Hours
 * @Description
 * @Author rookie
 * @Date 2024/9/6 9:36
 * @Version 1.0
 */
@Repeatable(Hour.class)
public @interface Hours {

    double[] hours() default 0;
}
