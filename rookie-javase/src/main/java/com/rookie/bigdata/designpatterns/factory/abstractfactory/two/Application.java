package com.rookie.bigdata.designpatterns.factory.abstractfactory.two;

/**
 * @Class Application
 * @Description
 * @Author rookie
 * @Date 2025/5/14 13:42
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
