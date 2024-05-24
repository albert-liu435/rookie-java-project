package com.rookie.bigdata.designpatterns.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class PersonTest
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 14:59
 * @Version 1.0
 */
class PersonTest {


    @Test
    void testBuild() {


        Person.PersonBuilder builder = Person.builder();
        Person build = builder.address("123")
                .age(12)
                .desc("!23")
                .build();
    }

}