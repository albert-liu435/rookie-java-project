package com.rookie.bigdata.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Class DateUtils
 * @Description
 * @Author rookie
 * @Date 2024/6/11 15:44
 * @Version 1.0
 */
public class DateUtils {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf3 = new SimpleDateFormat("EEEE");
        String weekofday = sdf3.format(date);
        System.out.println(weekofday);
    }
}
