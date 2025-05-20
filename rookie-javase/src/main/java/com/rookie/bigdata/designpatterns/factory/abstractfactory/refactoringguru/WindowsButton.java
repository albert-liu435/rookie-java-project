package com.rookie.bigdata.designpatterns.factory.abstractfactory.refactoringguru;

/**
 * @Class WindowsButton
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:54
 * @Version 1.0
 */

/**
 * All products families have the same varieties (MacOS/Windows).
 * <p>
 * This is another variant of a button.
 */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");

    }
}
