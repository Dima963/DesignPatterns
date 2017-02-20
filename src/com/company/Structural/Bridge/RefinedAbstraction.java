package com.company.Structural.Bridge;

/**
 * Created by Dima on 13.02.2017.
 */
public class RefinedAbstraction extends Abstraction {

    double x, y, radius;
    RefinedAbstraction(double x, double y, double radius, Implaments implaments){
        super(implaments);
        this.x = x;
        this.y =  y;
        this.radius =  radius;
    }
    @Override
    public void draw(){
        implament.drowCircle(x, y, radius);
    }
}
