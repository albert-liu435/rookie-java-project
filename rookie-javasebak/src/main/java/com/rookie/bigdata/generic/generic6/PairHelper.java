package com.rookie.bigdata.generic.generic6;

/**
 * @Class PairHelper
 * @Description
 * @Author rookie
 * @Date 2024/7/4 17:39
 * @Version 1.0
 */
public class PairHelper {
    static int addPair(Pair<Number> p) {
        Number first = p.getFirst();
        Number last = p.getLast();
        return first.intValue() + last.intValue();
    }
}
