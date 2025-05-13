package com.rookie.bigdata.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @Class AppLog
 * @Description
 * @Author rookie
 * @Date 2025/5/13 10:11
 * @Version 1.0
 */
public class AppLog {

    static final Logger logger= LogManager.getLogger(AppLog.class);

    public static void main(String[] args) {

        logger.trace("Entering application.");
        Bar bar = new Bar();
        if (!bar.doIt()) {
            logger.error("Didn't do it.");
        }
        logger.trace("Exiting application.");

    }

}
