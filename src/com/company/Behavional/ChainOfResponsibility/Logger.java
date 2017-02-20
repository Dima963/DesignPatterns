package com.company.Behavional.ChainOfResponsibility;

public abstract class Logger{
    public static final int ERR = 1;
    public static  final  int Debug = 2;
    public static final int Info = 3;

    int priority;
    Logger next;

    public Logger(int priority) {
        this.priority = priority;
    }

    public void setNext(Logger next) {
        this.next = next;
    }

    void writeMessage(String msg, int level) {

        if(level <= priority){
           message(msg);
        }
        if(next != null){
            next.writeMessage(msg, level);
        }
    }

    abstract void message(String msg);

}
