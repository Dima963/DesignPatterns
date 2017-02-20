package com.company.Behavional.Command;

/**
 * Created by Dima on 19.02.2017.
 */
public class Delete implements Command {
    DataBase dataBase;

    @Override
    public void execute() {
        dataBase.delete();
    }

    public Delete(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
