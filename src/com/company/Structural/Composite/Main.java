package com.company.Structural.Composite;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape  shape  =  new Square();
        Shape shape1 =  new Triangle();
        Shape shape2 =  new Circle();

        Shape  shap3  =  new Square();
        Shape shape4 =  new Triangle();
        Shape shape5 =  new Circle();

        Composite com =  new Composite();
        Composite com2 =  new Composite();
        Composite com3=  new Composite();

        com.addComponent(shape);
        com.addComponent(shape1);
        com.addComponent(shape2);

        com2.addComponent(shap3);
        com2.addComponent(shape4);
        com2.addComponent(shape5);

        com3.addComponent(com);
        com3.addComponent(com2);

        com3.draw();
    }
}
