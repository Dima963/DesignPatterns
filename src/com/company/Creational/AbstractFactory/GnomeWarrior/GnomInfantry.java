package com.company.Creational.AbstractFactory.GnomeWarrior;

import com.company.Creational.AbstractFactory.Infantry;

/**
 * Created by Dima on 19.02.2017.
 */
public class GnomInfantry implements Infantry {
    @Override
    public void createInfantry() {
        System.out.println("Gnom infantry");
    }
}
