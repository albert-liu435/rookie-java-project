package com.rookie.bigdata.util.function;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class MyFunctionTest
 * @Description
 * @Author rookie
 * @Date 2024/8/7 15:50
 * @Version 1.0
 */
class MyFunctionTest {


    @Test
    void test01(){
//        Function<Boolean,String> function=new Function<Boolean, String>() {
//            @Override
//            public String apply(Boolean aBoolean) {
//                if(aBoolean){
//                    return "true";
//                }
//                return "false";
//            }
//        };

        Function<Boolean,String> function=(flag)->{
            if(flag){
                return "true";
            }
            return "false";
        };

        String apply = function.apply(true);
        String apply1 = function.apply(false);
        System.out.println("apply:"+apply+"apply1:"+apply1);

    }

}
