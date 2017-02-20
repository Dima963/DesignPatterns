package com.company.Creational.AbstractFactory.ElfeWarrior;

import com.company.Creational.AbstractFactory.*;

public class ElfeFactory implements AbstractFactory {
    @Override
    public Archer createArcher() {
        return new ElfeArcher();
    }

    @Override
    public Infantry createInfantry() {
        return new ElfeInfantry();
    }
}
