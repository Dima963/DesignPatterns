package com.company.Structural.Bridge;

/**
 * Created by Dima on 13.02.2017.
 */
public abstract class Abstraction {

    Implaments implament;

    Abstraction(Implaments implament){
        this.implament =  implament;
    }

    public  abstract void draw();
}
