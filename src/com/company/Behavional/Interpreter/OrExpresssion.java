package com.company.Behavional.Interpreter;

/**
 * Created by Dima on 17.02.2017.
 */
public class OrExpresssion implements Expresion {
    private  Expresion expresion;
    private  Expresion expresion2;

    public OrExpresssion(Expresion expresion, Expresion expresion2) {
        this.expresion = expresion;
        this.expresion2 = expresion2;
    }

    @Override
    public boolean interpret(String context) {
        return expresion.interpret(context)||expresion2.interpret(context);
    }
}
