package com.company.Behavional.Command;

/**
 * Created by Dima on 19.02.2017.
 */
public class Insert implements Command  {
    DataBase dataBase;

    public Insert(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {

        dataBase.insert();
    }
}
