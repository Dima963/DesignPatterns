package com.company.Structural.Flyweight;

public class Point implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("Point" + x +" " + y);
    }
}
