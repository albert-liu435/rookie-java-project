package com.rookie.bigdata.designpatterns.factory.abstractfactory.refactoringguru;

/**
 * @Class MacOSButton
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:54
 * @Version 1.0
 */

/**
 * All products families have the same varieties (MacOS/Windows).
 * <p>
 * This is a MacOS variant of a button.
 */
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
