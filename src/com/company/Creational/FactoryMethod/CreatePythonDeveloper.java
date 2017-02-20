package com.company.Creational.FactoryMethod;

public class CreatePythonDeveloper extends FactoryDeveloper {
    @Override
    Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
