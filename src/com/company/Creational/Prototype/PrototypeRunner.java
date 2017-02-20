package com.company.Creational.Prototype;

public class PrototypeRunner {
    public static void main(String[] args) throws CloneNotSupportedException {

        Developer javaDevelope =  new Developer(1, "Junior");
        Developer copyJavaDev = (Developer) javaDevelope.clone();
        copyJavaDev.setStage(2);
        copyJavaDev.setStatus("Middle");
        System.out.println(javaDevelope);
        System.out.println(copyJavaDev);
        Developer newDevelop =  (Developer) javaDevelope.clone();
        System.out.println(newDevelop);
        Developer dev =  (Developer)copyJavaDev.clone();
        System.out.println(dev);

    }
}
