package com.company.Behavional.ChainOfResponsibility;

public class SMSLogger extends Logger {

    public SMSLogger(int priority) {
        super(priority);
    }

    protected void message(String msg){
        System.out.println("SMS: " + msg);
    }
}
