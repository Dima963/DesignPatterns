package com.company.Creational.AbstractFactory.ElfeWarrior;

import com.company.Creational.AbstractFactory.Infantry;

public class ElfeInfantry implements Infantry {
    @Override
    public void createInfantry(){
        System.out.println("Elfe infantry");
    }
}
