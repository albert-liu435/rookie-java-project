package com.rookie.bigdata.generic.generic2;

/**
 * @Class IA
 * @Description
 * @Author rookie
 * @Date 2024/7/4 16:47
 * @Version 1.0
 */
// 在继承泛型接口时，必须确定泛型接口的类型参数
interface IA extends IUsb<String, Double> {
}
