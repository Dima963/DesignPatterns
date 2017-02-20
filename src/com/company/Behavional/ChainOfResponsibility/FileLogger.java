package com.company.Behavional.ChainOfResponsibility;

public class FileLogger extends Logger {

    public FileLogger (int priority) {
        super(priority);
    }

    protected void message(String msg){
        System.out.println("Write in file: " + msg);
    }

}
