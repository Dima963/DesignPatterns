package com.company.Creational.Prototype;

public abstract class Prototype implements Cloneable {
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype)super.clone();
    }

}
