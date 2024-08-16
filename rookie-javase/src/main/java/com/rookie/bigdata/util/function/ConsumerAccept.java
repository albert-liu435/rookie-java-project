package com.rookie.bigdata.util.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Class ConsumerAccept
 * @Description
 * @Author rookie
 * @Date 2023/5/5 17:48
 * @Version 1.0
 */
public class ConsumerAccept {


    public static void main(String[] args) {

        List<String> stringList=new ArrayList<>();
        stringList.add("abc");

         Consumer<List<String>> authorizationRequestConvertersConsumer = (authorizationRequestConverters) -> {};

        authorizationRequestConvertersConsumer.accept(stringList);

        Consumer<List<String>> consumer=new Consumer<List<String>>() {
            @Override
            public void accept(List<String> list) {

            }
        };

    }

}
