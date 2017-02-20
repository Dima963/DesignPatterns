package com.company.Creational.AbstractFactory.ElfeWarrior;

import com.company.Creational.AbstractFactory.Archer;

public class ElfeArcher implements Archer {
    @Override
    public void createArcher() {
        System.out.println("Elfe archer");
    }
}
