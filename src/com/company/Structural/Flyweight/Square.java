package com.company.Structural.Flyweight;

/**
 * Created by Dima on 14.02.2017.
 */
public class Square implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("Square" + x +" " + y);
    }
}