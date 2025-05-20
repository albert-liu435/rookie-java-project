package com.rookie.bigdata.jvm.two.chapter02;

/**
 * @Author rookie
 * @Description 指令2：算术指令
 * @Date 2025/5/12 23:23
 * @Version 1.0
 */
public class ArithmeticTest {
//    @Test
    public void method1(){
        int i = 10;
        double j = i / 0.0;
        System.out.println(j);//无穷大


        double d1 = 0.0;
        double d2 = d1 / 0.0;
        System.out.println(d2);//NaN: not a number
    }

    public void method2(){
        float i = 10;
        float j = -i;
        i = -j;
    }

    public void method3(int j){
        int i = 100;
//        i = i + 10;
        i += 10;
    }
    public int method4(){
        int a = 80;
        int b = 7;
        int c = 10;
        return (a + b) * c;
    }

    public int method5(int i ,int j){
        return ((i + j - 1) & ~(j - 1));
    }

    //关于(前)++和(后)++
    public void method6(){
        int i = 10;
        i++;
//        ++i;

//        for(int j = 0;j < 10;j++){}
    }
    public void method7(){
        int i = 10;
        int a = i++;

        int j = 20;
        int b = ++j;
    }
    //思考
    public void method8(){
        int i = 10;
        i = i++;
        System.out.println(i);//10
    }

}
