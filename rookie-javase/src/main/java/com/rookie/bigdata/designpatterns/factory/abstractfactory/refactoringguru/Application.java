package com.rookie.bigdata.designpatterns.factory.abstractfactory.refactoringguru;

/**
 * @Class Application
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:58
 * @Version 1.0
 */

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
