package com.rookie.bigdata.designpatterns.factory.abstractfactory.two;

/**
 * @Class GUIFactory
 * @Description
 * @Author rookie
 * @Date 2025/5/14 13:41
 * @Version 1.0
 */
/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
