package com.company.Behavional.Interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {

        Expresion isJava =  getJavaExpresion();
        Expresion isEE =  getJavaEeExpression();
        System.out.println(isJava.interpret("Java Core"));
        System.out.println(isEE.interpret("JavaEE"));
    }

    public static Expresion getJavaExpresion(){

        Expresion java  = new TerminalExpresion("Java");
        Expresion javaCore =  new TerminalExpresion("Java Core");

        return  new OrExpresssion(java, javaCore);

    }

    public static Expresion getJavaEeExpression(){

        Expresion java  = new TerminalExpresion("Java");
        Expresion Spring =  new TerminalExpresion("JavaEE");

        return  new AndExpresion(java, Spring);
    }
}
