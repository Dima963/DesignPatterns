package com.company.Behavional.Command;

/**
 * Created by Dima on 19.02.2017.
 */
public class Select implements Command{

    DataBase dataBase;

    public Select(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
dataBase.select();
    }
}
