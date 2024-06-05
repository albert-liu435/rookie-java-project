package com.rookie.bigdata.spi;

import java.util.ServiceLoader;

/**
 * @Class SPIServiceMain
 * @Description
 * @Author rookie
 * @Date 2023/5/5 17:03
 * @Version 1.0
 */
public class SPIServiceMain {

    public static void main(String[] args) {
        ServiceLoader<SPIService> serviceLoader = ServiceLoader.load(SPIService.class);

        for (SPIService service : serviceLoader) {

            service.print("SPI");
        }
    }
}
