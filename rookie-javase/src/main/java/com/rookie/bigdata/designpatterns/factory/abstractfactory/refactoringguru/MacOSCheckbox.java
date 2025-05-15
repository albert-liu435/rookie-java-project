package com.rookie.bigdata.designpatterns.factory.abstractfactory.refactoringguru;

/**
 * @Class MacOSCheckbox
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:56
 * @Version 1.0
 */

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.
 */
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
