package com.company.Behavional.Command;

/**
 * Created by Dima on 19.02.2017.
 */
public class DataBaseRunnar {
    public static void main(String[] args) {
        DataBase dataBase =  new DataBase();
        Developer developer =  new Developer(
                new Insert(dataBase),
                new Delete(dataBase),
                new Select(dataBase),
                new Update(dataBase)
        );
        developer.insertRecord();
        developer.deleteRecor();
        developer.selectRecord();
        developer.updateRecord();
    }
}
