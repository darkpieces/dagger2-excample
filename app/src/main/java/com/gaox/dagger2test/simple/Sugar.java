package com.gaox.dagger2test.simple;

import javax.inject.Inject;

/**
 * @author: gaox
 * @date: 2019/01/22 15:47
 */
public class Sugar {
    private String color;
    private boolean isSweet;
    private Butter butter;

    @Inject
    public Sugar(Butter butter) {
        this.butter = butter;
    }


    public Sugar() {

    }


    public Sugar(String color, boolean isSweet, Butter butter) {
        this.color = color;
        this.isSweet = isSweet;
        this.butter = butter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSweet() {
        return isSweet;
    }

    public void setSweet(boolean sweet) {
        isSweet = sweet;
    }

//    @Override
//    public String toString() {
//        return "Sugar{" +
//                "color='" + color + '\'' +
//                ", isSweet=" + isSweet +
//                '}';
//    }
}
