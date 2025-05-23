package com.rookie.bigdata.algorithm.structures.stack;

import java.io.Serializable;

/**
 * @Class EmptyStackException
 * @Description
 * @Author rookie
 * @Date 2025/5/22 17:55
 * @Version 1.0
 */
public class EmptyStackException extends RuntimeException implements Serializable {


    private static final long serialVersionUID = -8766038608920134747L;


    public EmptyStackException(){
        super();
    }

    public EmptyStackException(String msg){
        super(msg);
    }
}

