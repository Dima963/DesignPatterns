package com.company.Behavional.Visitor;

/**
 * Created by Dima on 19.02.2017.
 */
public interface Developer {
    void create(projectClass project);
    void create(DataBase dataBase);
    void create(Test test);
}
