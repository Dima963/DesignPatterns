package com.company.Structural.Flyweight;

/**
 * Created by Dima on 14.02.2017.
 */
public class Circle implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("Circle" + x +" " + y);
    }
}