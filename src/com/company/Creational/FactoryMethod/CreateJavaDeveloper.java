package com.company.Creational.FactoryMethod;

/**
 * Created by Dima on 20.02.2017.
 */
public class CreateJavaDeveloper extends FactoryDeveloper {
    @Override
    Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
