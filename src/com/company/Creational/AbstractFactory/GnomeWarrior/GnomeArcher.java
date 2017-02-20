package com.company.Creational.AbstractFactory.GnomeWarrior;

import com.company.Creational.AbstractFactory.Archer;

/**
 * Created by Dima on 19.02.2017.
 */
public class GnomeArcher implements Archer {
    @Override
    public void createArcher() {
        System.out.println("Gnome archer");
    }
}
