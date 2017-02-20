package com.company.Structural.Adapter;

/**
 * Created by Dima on 20.02.2017.
 */
public class Adapter implements Database  {

    JavaAplication javaAplication =  new JavaAplication();

    @Override
    public void insert() {
        javaAplication.createObject();
    }

    @Override
    public void update() {
        javaAplication.updateObject();
    }

    @Override
    public void select() {
        javaAplication.loadObject();
    }

    @Override
    public void delete() {
        javaAplication.deleteObject();
    }
}
