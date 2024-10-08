package com.rookie.bigdata.util.function;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;


/**
 * @Class BinaryOperatorTest
 * @Description
 * @Author rookie
 * @Date 2023/5/5 17:46
 * @Version 1.0
 */
class BinaryOperatorTest {


    @Test
    public void maxBy() {


        //两个实现功能是一样的
        BiFunction<Integer, Integer, Integer> function = (x, y) -> {

            return x > y ? x : y;
        };

        Integer apply = function.apply(2, 3);
        System.out.println(apply);


        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? o2 : o1;
            }
        };

        Integer apply1 = BinaryOperator.maxBy(comparator).apply(2, 3);
        System.out.println(apply1);


    }

}
