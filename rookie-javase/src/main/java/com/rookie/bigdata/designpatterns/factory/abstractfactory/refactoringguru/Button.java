package com.rookie.bigdata.designpatterns.factory.abstractfactory.refactoringguru;

/**
 * @Class Button
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:53
 * @Version 1.0
 */

/**
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Button/Checkbox). All products of
 * the same family have the common interface.
 * <p>
 * This is the common interface for buttons family.
 */
public interface Button {

    void paint();
}
