package com.company.Creational.AbstractFactory;

import com.company.Creational.AbstractFactory.GnomeWarrior.GnomeFactory;

public class AbstractFactoryRunner {
    public static void main(String[] args) {

        AbstractFactory factory =  new GnomeFactory();
        Archer archer =  factory.createArcher();
        Infantry infantry = factory.createInfantry();

        archer.createArcher();
        infantry.createInfantry();
    }


}
