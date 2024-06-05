package com.rookie.bigdata.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class Composite
 * @Description
 * @Author rookie
 * @Date 2023/5/6 16:07
 * @Version 1.0
 */
public class Composite extends Component {
    private List<Component> list = new ArrayList<>();

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return (Component) list.get(i);
    }

    @Override
    public void operation() {

    }

    @Override
    public void operation(Component component) {
        for (Component c : list) {
            c.operation();
        }
    }
}
