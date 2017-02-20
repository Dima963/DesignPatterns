package com.company.Structural.Decorator;

/**
 * Created by Dima on 15.02.2017.
 */
public class DeveloperDecorator implements Developer {

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    Developer developer;
    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
