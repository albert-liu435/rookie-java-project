package com.rookie.bigdata.util.function;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @Class FunctionMapTest
 * @Description
 * @Author rookie
 * @Date 2023/5/5 17:49
 * @Version 1.0
 */
class FunctionMapTest {




    @Test
    public void apply(){

        //定义一个实现类
        Function<Integer,Integer> function= new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {

                return integer+5;
            }
        };

        Integer apply = function.apply(3);
        System.out.println(apply);

        //采用lambda表达式的写法
        Function<Integer,Integer> function1=integer -> integer+3;
        System.out.println(function1.apply(3));

        Function<Integer,Integer> function2=integer -> {
            return integer+3;
        };

        System.out.println(function2.apply(5));



        MyFunction<String,String> myFunction=new MyFunction<>();
        String hello = myFunction.getProcessor().apply("hello");
        System.out.println(hello);


    }


    @Test
    public void  compose(){

        Function<Integer,Integer> function= new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                //这里会打印出2
                System.out.println(integer);
                return integer+5;
            }
        };

        Function<Integer,Integer> function1=integer -> integer+2;
        Function<Integer, Integer> compose = function1.compose(function);
        Integer apply = compose.apply(2);
        System.out.println(apply);

    }


    @Test
    public void andThen(){
        Function<Integer,Integer> function= new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                //这里会打印出4
                System.out.println(integer);
                return integer+5;
            }
        };

        Function<Integer,Integer> function1=integer -> integer+2;
        Function<Integer, Integer> compose = function1.andThen(function);
        Integer apply = compose.apply(2);
        System.out.println(apply);
    }


    @Test
    public void identity(){

        Stream<String> stream = Stream.of("This", "is", "a", "test");
        Map<String, Integer> map = stream.collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(map);
        Function<Integer,Integer> function1=Function.identity();
        Function<Integer,Integer> function2=t->t;
        Integer apply = function1.apply(2);
        System.out.println(apply);

        Integer apply2 = function2.apply(3);
        System.out.println(apply2);


    }

}
