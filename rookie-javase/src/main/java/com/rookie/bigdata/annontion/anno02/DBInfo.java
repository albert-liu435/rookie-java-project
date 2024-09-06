package com.rookie.bigdata.annontion.anno02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Class DBInfo
 * @Description
 * @Author rookie
 * @Date 2024/9/6 10:04
 * @Version 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DBInfo {

    String driver() default "com.mysql.jdbc.Driver";

    String url() default "jdbc:mysql://localhost:3306/temp?";

    String username() default "root";

    String password() default "root";
}
