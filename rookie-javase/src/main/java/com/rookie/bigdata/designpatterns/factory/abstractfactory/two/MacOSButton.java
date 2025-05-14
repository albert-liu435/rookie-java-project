package com.rookie.bigdata.designpatterns.factory.abstractfactory.two;

/**
 * @Class MacOSButton
 * @Description
 * @Author rookie
 * @Date 2025/5/14 12:01
 * @Version 1.0
 */
/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a button.
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
