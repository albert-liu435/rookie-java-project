package com.rookie.bigdata.spi;

import org.junit.jupiter.api.Test;

import java.util.ServiceLoader;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class SPIServiceTest
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/5 17:02
 * @Version 1.0
 */
class SPIServiceTest {

    @Test
    void print() {
        ServiceLoader<SPIService> serviceLoader = ServiceLoader.load(SPIService.class);
        SPIService spiService = null;
        for (SPIService service : serviceLoader) {

            service.print("SPI");
        }
    }


//    @Test
//     void print2() {
//
//
//        Iterator<SPIService> providers = Service.providers(SPIService.class);
//        ServiceLoader<SPIService> load = ServiceLoader.load(SPIService.class);
//
//        while (providers.hasNext()) {
//            SPIService ser = providers.next();
//            ser.print("SPI");
//        }
//        System.out.println("--------------------------------");
//        Iterator<SPIService> iterator = load.iterator();
//        while (iterator.hasNext()) {
//            SPIService ser = iterator.next();
//            ser.print("SPI");
//        }
//    }

}