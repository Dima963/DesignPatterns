package com.company.Behavional.Visitor;

/**
 * Created by Dima on 19.02.2017.
 */
public class SeniorJavaDeveloper implements Developer {
    @Override
    public void create(projectClass project) {
        System.out.println("Write good code");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Can create db");
    }

    @Override
    public void create(Test test) {

        System.out.println("Creating reliable test");

    }
}
