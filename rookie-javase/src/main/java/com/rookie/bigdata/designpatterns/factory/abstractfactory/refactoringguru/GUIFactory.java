package com.rookie.bigdata.designpatterns.factory.abstractfactory.refactoringguru;

/**
 * @Class GUIFactory
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:57
 * @Version 1.0
 */
/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
