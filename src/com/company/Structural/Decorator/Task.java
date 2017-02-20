package com.company.Structural.Decorator;

/**
 * Created by Dima on 15.02.2017.
 */
public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead( new SeniorDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());

    }
}
