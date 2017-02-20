package com.company.Behavional.Command;

/**
 * Created by Dima on 19.02.2017.
 */
public class Developer {
    Command insert;
    Command delete;
    Command update;
    Command select;

    public Developer(Command insert, Command delete, Command update, Command select) {
        this.insert = insert;
        this.delete = delete;
        this.update = update;
        this.select = select;
    }

    public void insertRecord(){
        insert.execute();
    }

    public  void updateRecord(){
        update.execute();
    }

    public void deleteRecor(){
        delete.execute();
    }
    public void selectRecord(){
        select.execute();
    }
}
