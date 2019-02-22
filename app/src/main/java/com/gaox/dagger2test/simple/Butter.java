package com.gaox.dagger2test.simple;

import javax.inject.Inject;

/**
 * @author: gaox
 * @date: 2019/02/20 16:56
 */
public class Butter {


    @Inject
    public Butter() {

    }

    private String color;
    private String shape;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Butter{" +
                "color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }


}
