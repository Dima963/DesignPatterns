package com.company.Behavional.Visitor;

/**
 * Created by Dima on 19.02.2017.
 */
public class DataBase implements projectElement {
    @Override
    public void beWritten(Developer developer) {

        developer.create(this);
    }
}
