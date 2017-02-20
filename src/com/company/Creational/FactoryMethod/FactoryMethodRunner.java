package com.company.Creational.FactoryMethod;

public class FactoryMethodRunner {
    public static void main(String[] args) {
        FactoryDeveloper factoryDeveloper =  FactoryDeveloper.createConcreteDeveloper("Java");
        Developer developer =  factoryDeveloper.createDeveloper();
        developer.writeCode();
    }
}
