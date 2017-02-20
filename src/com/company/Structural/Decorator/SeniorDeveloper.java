package com.company.Structural.Decorator;

/**
 * Created by Dima on 15.02.2017.
 */
public class SeniorDeveloper  extends  DeveloperDecorator{
    public SeniorDeveloper(Developer developer) {
        super(developer);
    }

    public  String makeCodeRewiew(){
        return "Make code rewiew";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+ makeCodeRewiew();
    }
}
