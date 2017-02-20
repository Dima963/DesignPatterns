package com.company.Creational.FactoryMethod;

public abstract class FactoryDeveloper {

    abstract Developer createDeveloper();

    public static FactoryDeveloper createConcreteDeveloper(String developer){
        if(developer.equals("Java"))
            return new CreateJavaDeveloper();
        else if(developer.equals("Python"))
            return new CreatePythonDeveloper();
        else {
            throw new RuntimeException();
        }
    }


}
