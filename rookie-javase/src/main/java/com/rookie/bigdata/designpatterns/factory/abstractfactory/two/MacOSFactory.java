package com.rookie.bigdata.designpatterns.factory.abstractfactory.two;

/**
 * @Class MacOSFactory
 * @Description
 * @Author rookie
 * @Date 2025/5/14 13:42
 * @Version 1.0
 */
/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
