package com.company.Creational.AbstractFactory.GnomeWarrior;

import com.company.Creational.AbstractFactory.AbstractFactory;
import com.company.Creational.AbstractFactory.Archer;
import com.company.Creational.AbstractFactory.Infantry;

public class GnomeFactory implements AbstractFactory {
    @Override
    public Archer createArcher() {
        return new GnomeArcher();
    }

    @Override
    public Infantry createInfantry() {
        return new GnomInfantry();
    }
}
