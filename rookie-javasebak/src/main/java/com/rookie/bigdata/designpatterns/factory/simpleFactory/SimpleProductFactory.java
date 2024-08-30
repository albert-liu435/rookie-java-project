package com.rookie.bigdata.designpatterns.factory.simpleFactory;

/**
 * @Class SimpleProductFactory
 * @Description 简单工厂模式
 * @Author rookie
 * @Date 2023/5/6 14:33
 * @Version 1.0
 */
public class SimpleProductFactory {


    public static final String IPHONE = "iphone";

    public static final String LAPTOP = "laptop";

    public Product create(String type) {
        if (IPHONE.equalsIgnoreCase(type)) {
            return new Iphone();
        } else if (LAPTOP.equalsIgnoreCase(type)) {
            return new Laptop();
        }
        return null;
    }

    /**
     * create instance by full-qualified name
     *
     * @param path full qualified name
     * @return the instance of Product
     */
    public Product createWithPath(String path) {
        try {
            if (path != null && !"".equals(path)) {
                return (Product) Class.forName(path).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * create instance by Class
     */
    public Product create(Class clazz) {
        try {
            if (clazz != null) {
                return (Product) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
