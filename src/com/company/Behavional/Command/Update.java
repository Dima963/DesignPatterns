package com.company.Behavional.Command;

/**
 * Created by Dima on 19.02.2017.
 */
public class Update implements  Command{
    DataBase dataBase;

    public Update(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.update();
    }
}
