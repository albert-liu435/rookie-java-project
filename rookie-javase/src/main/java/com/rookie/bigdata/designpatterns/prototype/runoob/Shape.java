package com.rookie.bigdata.designpatterns.prototype.runoob;

/**
 * @Class Shape
 * @Description
 * @Author rookie
 * @Date 2025/5/14 15:42
 * @Version 1.0
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
