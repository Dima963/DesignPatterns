package com.company.Structural.Adapter;

public class AdapterRunner {
    public static void main(String[] args) {
        Database database =  new Adapter();
        database.insert();
        database.update();
        database.select();
        database.delete();
    }
}
