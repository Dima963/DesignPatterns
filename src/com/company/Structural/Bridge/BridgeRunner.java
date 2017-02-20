package com.company.Structural.Bridge;

public class BridgeRunner {

    public static void main(String[] args) {

        Abstraction abstraction =  new RefinedAbstraction(1,2,3, new ConcreteImplement1());
        Abstraction abstraction2 =  new RefinedAbstraction(4,5,6, new ConcreteImplement2());
        abstraction.draw();
        abstraction2.draw();
    }
}
