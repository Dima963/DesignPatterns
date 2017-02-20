package com.company.Behavional.Interpreter;

/**
 * Created by Dima on 17.02.2017.
 */
public class TerminalExpresion implements  Expresion {

    private  String data;

    public TerminalExpresion(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data))
            return true;
        else
            return false;
    }
}
