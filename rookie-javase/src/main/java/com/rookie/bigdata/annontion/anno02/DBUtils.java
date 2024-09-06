package com.rookie.bigdata.annontion.anno02;

import java.util.Properties;

/**
 * @Class DBUtils
 * @Description
 * @Author rookie
 * @Date 2024/9/6 10:06
 * @Version 1.0
 */
@DBInfo
public class DBUtils {

    private static final Properties PROPERTIES = new Properties();
    private static String driver;
    private static String url;

    private static String username;

    private static String password;

    static {
        Class<DBUtils> dbUtilsClass = DBUtils.class;

        boolean annotationPresent = dbUtilsClass.isAnnotationPresent(DBInfo.class);
        if (annotationPresent) {
            DBInfo dbInfo = dbUtilsClass.getAnnotation(DBInfo.class);
            driver = dbInfo.driver();
        }
    }
}
