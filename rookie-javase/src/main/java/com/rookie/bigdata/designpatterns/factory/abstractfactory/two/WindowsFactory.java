package com.rookie.bigdata.designpatterns.factory.abstractfactory.two;

/**
 * @Class WindowsFactory
 * @Description
 * @Author rookie
 * @Date 2025/5/14 13:42
 * @Version 1.0
 */
/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
