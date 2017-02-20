package com.company.Structural.Facade;

public class Developer {
    public void DoJobBeforeDeadline(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("Developer do work");
        }else {
            System.out.println("Developer nothing do");
        }
    }
}
